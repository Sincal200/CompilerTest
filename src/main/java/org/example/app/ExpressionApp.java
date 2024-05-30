package org.example.app;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.expresion.AntlrToProgram;
import org.example.expresion.ExpressionProcessor;
import org.example.expresion.Program;
import org.example.testLexer;
import org.example.testParser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExpressionApp {
    public static void main(String[] args) {
        if(args.length != 1){
            System.err.println("Usage: file name");
        }
        else{
            String fileName = args[0];
            testParser parser = getParser(fileName);

            // tell ANTLR to build a parse tree
            // parse from the start symbol 'prog'
            ParseTree antlrAST = parser.prog();

            //Crating a visitor object for converting the parse tree into Program/Expression object
            AntlrToProgram progVisitor = new AntlrToProgram();
            Program prog = progVisitor.visit(antlrAST);

            if(progVisitor.semanticErrors.isEmpty()) {
                ExpressionProcessor ep = new ExpressionProcessor(prog.expressions);
                for (String evaluation : ep.getEvaluationResults()) {
                    System.out.println(evaluation);
                    try {
                        // Leer el contenido del archivo original
                        String content = new String(Files.readAllBytes(Paths.get("src/main/java/org/example/test/test1.txt")));

                        // Separar las líneas del contenido
                        String[] lines = content.split("\n");

                        // Transformar el contenido a formato SQL
                        StringBuilder sqlContent = new StringBuilder();
                        for (String line : lines) {
                            if (line.contains("=")) { // Es una asignación de variable
                                String[] parts = line.split(" = ");
                                String variableName = parts[0].split(":")[0].trim();
                                String variableType = parts[0].split(":")[1].trim();
                                String variableValue = parts[1].trim();
                                sqlContent.append("DECLARE @")
                                        .append(variableName)
                                        .append(" ")
                                        .append(variableType.equals("INT") ? "INT" : "FLOAT") // Asume que los tipos posibles son INT y DOUBLE
                                        .append("; SET @")
                                        .append(variableName)
                                        .append(" = ")
                                        .append(variableValue)
                                        .append(";\n");
                            }else { // Es una operación
                                    String[] parts = line.split(" ");
                                    sqlContent.append("-- Realizar la operación\n")
                                            .append("PRINT 'Resultado: ' + CAST((");
                                    for (int i = 0; i < parts.length; i++) {
                                        if (i % 2 == 0) { // Es una variable
                                            sqlContent.append("@").append(parts[i]);
                                        } else { // Es un operador
                                            sqlContent.append(parts[i]);
                                        }
                                        if (i != parts.length - 1) {
                                            sqlContent.append(" ");
                                        }
                                    }
                                sqlContent.append(") AS VARCHAR);");
                                }

                        }

                        // Crear el nuevo archivo SQL
                        File mySqlFile = new File("myFile.sql");
                        if (mySqlFile.createNewFile()) {
                            System.out.println("File created: " + mySqlFile.getName());
                        } else {
                            System.out.println("File already exists.");
                        }

                        // Escribir el contenido en el nuevo archivo SQL
                        FileWriter writer = new FileWriter("myFile.sql");
                        writer.write(sqlContent.toString());
                        writer.close();

                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                }
            }else {
                for (String err : progVisitor.semanticErrors) {
                    System.err.println(err);
                }
            }
        }
    }
    /*
    * Here the types of parser and lexer are specific to the
    * grammar name is test.g4
     */
    private static testParser getParser(String fileName) {
        testParser parser = null;

        try {
            CharStream input = CharStreams.fromFileName(fileName);
            testLexer lexer = new testLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new testParser(tokens);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return parser;

    }
}

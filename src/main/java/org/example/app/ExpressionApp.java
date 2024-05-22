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

import java.io.IOException;

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

            if(progVisitor.semanticErrors.isEmpty()){
                ExpressionProcessor ep = new ExpressionProcessor(prog.expressions);
                for(String evaluation: ep.getEvaluationResults()){
                    System.out.println(evaluation);
                }
            }else{
                for(String err: progVisitor.semanticErrors){
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

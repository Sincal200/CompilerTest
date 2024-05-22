package org.example.expresion;

import org.example.testBaseVisitor;
import org.example.testParser;

import java.util.ArrayList;
import java.util.List;

public class AntlrToProgram extends testBaseVisitor<Program> {

    public List<String> semanticErrors; // to be accessed by the main application program

    @Override
    public Program visitProgram(testParser.ProgramContext ctx) {
        Program prog = new Program();

        semanticErrors = new ArrayList<>();
        AntlrToExpresion expVisitor = new AntlrToExpresion(semanticErrors);// a helper visitor for transforming each subtree into an Expression object
        for( int i = 0; i < ctx.getChildCount(); i++) {
            if(i == ctx.getChildCount() -1){
                // last child is the EOF token
                // we don't need to visit it
            }
            else{
                prog.addExpression(expVisitor.visit(ctx.getChild(i)));
            }
        }
        return prog;
    }
}

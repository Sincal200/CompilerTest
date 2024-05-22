package org.example.expresion;

import org.antlr.v4.runtime.Token;
import org.example.testBaseVisitor;
import org.example.testParser;

import java.util.ArrayList;
import java.util.List;


public class AntlrToExpresion extends testBaseVisitor<Expression> {

    /*
    * Given that all visit_* methods are called in a top-down fashion,
    * we can be sure that the order in which we add declared variables in to the 'vars' is
    * identical to how they are declared in the input program.
     */

    private List<String> vars; // stores all the variables declared in the program so far
    private List<String> semanticErrors; // 1. duplicate variable declaration 2. undeclared variable

    public AntlrToExpresion(List<String> semanticErrors) {
        vars = new ArrayList<>();
        this.semanticErrors = semanticErrors;
    }

    @Override
    public Expression visitDelcaration(testParser.DelcarationContext ctx) {
        // ID() is a method generated by ANTLR4 that returns the terminal node of the ID token in the grammar
        Token idToken = ctx.ID().getSymbol(); // equivalent to ctx.getChild(0).getSymbol()
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();
        //Maintaining the vars list for semantic analysis
        if (vars.contains(id)) {
            semanticErrors.add("Error: Variable: " + id + "already declared (" + line + ", " + column +")");
        } else {
            vars.add(id);
        }
        String type = ctx.getChild(2).getText();
        int value = Integer.parseInt(ctx.NUM().getText());
        return  new VariableDeclaration(id, type, value);
    }

    @Override
    public Expression visitModification(testParser.ModificationContext ctx) {

        Expression left = visit(ctx.getChild(0)); //recursively visit the current Multiplication node
        Expression right = visit(ctx.getChild(2)); //recursively visit the right Multiplication node
        return new Multiplication(left, right);
    }

    @Override
    public Expression visitAddition(testParser.AdditionContext ctx) {
        Expression left = visit(ctx.getChild(0)); //recursively visit the current Multiplication node
        Expression right = visit(ctx.getChild(2)); //recursively visit the right Multiplication node
        return new Addition(left, right);
    }

    @Override
    public Expression visitVariable(testParser.VariableContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;

        String id = ctx.getChild(0).getText();
        if(!vars.contains(id)) {
            semanticErrors.add("Error: Variable: " + id + "not declared (" + line + ", " + column +")");
        }
        return new Variable(id);
    }

    @Override
    public Expression visitNumber(testParser.NumberContext ctx) {
        String numText = ctx.getChild(0).getText();
        int num = Integer.parseInt(numText);
        return new Number(num);
    }
}

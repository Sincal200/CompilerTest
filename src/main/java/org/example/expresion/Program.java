package org.example.expresion;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public List<Expression> expressions;

    public Program(){
        this.expressions = new ArrayList<>();
    }

    public void addExpression(Expression e){
        this.expressions.add(e);
    }
}

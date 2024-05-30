package org.example.expresion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpressionProcessor {
    List<Expression> list;
    public Map<String,Integer> values; //symbol table for storing values of variables

    public ExpressionProcessor(List<Expression> list){
        this.list = list;
        values = new HashMap<>();
    }

    public List<String> getEvaluationResults(){
        List<String> evaluations = new ArrayList<>();

        for(Expression e : list){
            if(e instanceof VariableDeclaration){
                VariableDeclaration decl = (VariableDeclaration) e;
                values.put(decl.id,decl.value);
            }
            else if(e instanceof Power || e instanceof Multiplication || e instanceof Addition || e instanceof Subtraction || e instanceof Number || e instanceof Variable){
                String input = e.toString();
                int result = getEvalResult(e);
                evaluations.add(input + " is " + result);
            }else{
                String input = e.toString();
                double result = getEvalDivResult(e);
                evaluations.add(input + " is " + result);
            }
        }

        return evaluations;
    }

    private int getEvalResult(Expression e){
        int result  = 0;

        if(e instanceof Number){
            Number num = (Number) e;
            result = num.num;
        }else if(e instanceof Variable){
            Variable var = (Variable) e;
            result = values.get(var.id);
        }else if(e instanceof Addition){ //adiciona
            Addition add = (Addition) e;
            int left = getEvalResult(add.left);
            int right = getEvalResult(add.right);
            result = left + right;
        }else if(e instanceof Multiplication){ // e instanceof Multiplication multiplica
            Multiplication mul = (Multiplication) e;
            int left = getEvalResult(mul.left);
            int right = getEvalResult(mul.right);
            result = left * right;
        }else if(e instanceof Subtraction) { //sustracciona
            Subtraction sub = (Subtraction) e;
            int left = getEvalResult(sub.left);
            int right = getEvalResult(sub.right);
            result = left - right;
        } else {
            Power pow = (Power) e; //poderea
            int left = getEvalResult(pow.left);
            int right = getEvalResult(pow.right);
            result = (int) Math.pow(left,right);
        }
        return result;
    }

    private double getEvalDivResult(Expression e){
        double result = 0;
        if(e instanceof Division){
            Division div = (Division) e;
            double left = getEvalResult(div.left);
            double right = getEvalResult(div.right);
            return left / right;
        }
        return result;
    }


}

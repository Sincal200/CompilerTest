package org.example.expresion;

public class Power extends Expression{
    public Expression left;
    public Expression right;

    public Power(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return left.toString() + " ^ " + right.toString();
    }
}

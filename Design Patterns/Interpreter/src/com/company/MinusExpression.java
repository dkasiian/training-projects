package com.company;

class MinusExpression implements Expression {
    private Expression left;
    private Expression right;

    MinusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}

package com.company;

class PlusExpression implements Expression {
    private Expression left;
    private Expression right;

    PlusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}

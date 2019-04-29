package com.company;

class RightBracketDecorator extends Decorator {

    RightBracketDecorator(IPrinter component) {
        super(component);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("]");
    }
}

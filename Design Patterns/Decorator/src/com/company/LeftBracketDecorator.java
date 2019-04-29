package com.company;

class LeftBracketDecorator extends Decorator {

    LeftBracketDecorator(IPrinter component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("[");
        super.print();
    }
}

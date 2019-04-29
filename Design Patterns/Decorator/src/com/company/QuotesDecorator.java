package com.company;

class QuotesDecorator extends Decorator {

    QuotesDecorator(IPrinter component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("\"");
        super.print();
        System.out.print("\"");
    }
}

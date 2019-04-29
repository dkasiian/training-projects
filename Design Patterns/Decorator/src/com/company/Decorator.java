package com.company;

abstract class Decorator implements IPrinter {
    private IPrinter component;

    Decorator(IPrinter component) {
        this.component = component;
    }

    public void print(){
        component.print();
    }
}

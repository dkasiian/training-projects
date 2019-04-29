package com.company;

class Printer implements IPrinter {
    private String value;

    Printer(String value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.print(value);
    }
}

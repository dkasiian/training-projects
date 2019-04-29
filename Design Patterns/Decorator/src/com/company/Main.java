package com.company;

public class Main {

    public static void main(String[] args) {
        IPrinter printer = new QuotesDecorator(new LeftBracketDecorator(new RightBracketDecorator(
                new Printer("Hi"))));
        printer.print();
    }
}

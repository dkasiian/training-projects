package com.company;

class EnKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("Print line.");
    }

    @Override
    public void println() {
        System.out.println("Print line and set cursor to new line.");
    }
}

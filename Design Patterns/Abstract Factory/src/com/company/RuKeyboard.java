package com.company;

class RuKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("Печатаем строку.");
    }

    @Override
    public void println() {
        System.out.println("Печатаем строку с переносом строки.");
    }
}

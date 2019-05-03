package com.company;

class Singleton2 {
    static int count = 0;
    private static Singleton2 instance = new Singleton2();

    private Singleton2(){ count++; }

    static Singleton2 getInstance() {
        return instance;
    }
}

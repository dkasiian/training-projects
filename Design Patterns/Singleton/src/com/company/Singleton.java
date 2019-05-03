package com.company;

class Singleton {

    static int count = 0;
    private static Singleton instance;

    private Singleton(){ count++; }

    static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

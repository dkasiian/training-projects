package com.company;

class Singleton3 {
    static int count = 0;
    private static Singleton3 instance;

    private Singleton3(){ count++; }

    static synchronized Singleton3 getInstance(){
        if (instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}

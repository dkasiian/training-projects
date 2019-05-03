package com.company;

class Singleton4 {
    static int count = 0;
    private static volatile Singleton4 instance;

    private Singleton4(){ count++; }

    static Singleton4 getInstance(){
        if (instance == null){
            synchronized (Singleton4.class){
                if (instance == null)
                    instance = new Singleton4();
            }
        }
        return instance;
    }
}

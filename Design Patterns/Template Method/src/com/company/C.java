package com.company;

abstract class C {
    void templateMethod(){
        System.out.println("1");
        differ();
        System.out.println("3");
        differ2();
    }

    abstract void differ2();

    abstract void differ();
}

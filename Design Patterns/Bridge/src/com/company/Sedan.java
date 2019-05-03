package com.company;

class Sedan extends Car{

    Sedan(Make make) {
        super(make);
    }

    @Override
    void showType() {
        System.out.println("Sedan");
    }
}

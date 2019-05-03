package com.company;

class Coupe extends Car{
    Coupe(Make make) {
        super(make);
    }

    @Override
    void showType() {
        System.out.println("Coupe");
    }
}

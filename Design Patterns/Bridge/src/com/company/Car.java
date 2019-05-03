package com.company;

abstract class Car {
    private Make make;

    Car(Make make) {
        this.make = make;
    }

    void showDetails(){
        showType();
        make.setMake();
    }

    abstract void showType();
}

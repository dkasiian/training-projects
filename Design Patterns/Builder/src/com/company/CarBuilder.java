package com.company;

abstract class CarBuilder {
    Car car;
    void createCar(){car = new Car();}

    abstract void buildProducer();
    abstract void buildTransmission();
    abstract void buildMaxSpeed();

    Car getCar(){return car;}
}

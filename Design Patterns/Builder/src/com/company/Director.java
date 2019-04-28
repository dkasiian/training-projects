package com.company;

class Director {
    private CarBuilder builder;

    void setBuilder(CarBuilder carBuilder){builder=carBuilder;}

    Car BuildCar(){
        builder.createCar();
        builder.buildProducer();
        builder.buildTransmission();
        builder.buildMaxSpeed();
        return builder.getCar();
    }
}

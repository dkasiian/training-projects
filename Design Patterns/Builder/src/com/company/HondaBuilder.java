package com.company;

class HondaBuilder extends CarBuilder {
    @Override
    void buildProducer() {
        car.setProducer("Honda");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(250);
    }
}

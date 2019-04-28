package com.company;

class FordBuilder extends CarBuilder {
    @Override
    void buildProducer() {
        car.setProducer("Ford");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(180);
    }
}

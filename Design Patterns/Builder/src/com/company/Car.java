package com.company;

public class Car {
    private String producer;
    private Transmission transmission;
    private int maxSpeed;


    void setProducer(String producer) {
        this.producer = producer;
    }

    void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString(){
        return "Car [producer=" + producer + ", transmission=" + transmission + ", maxSpeed=" + maxSpeed + "]";
    }
}

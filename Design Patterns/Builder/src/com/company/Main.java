package com.company;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new FordBuilder());
        Car car = director.BuildCar();
        System.out.println(car);
    }
}

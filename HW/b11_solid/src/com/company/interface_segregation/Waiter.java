package com.company.interface_segregation;

public class Waiter implements Eater {
    @Override
    public void eat() {
        System.out.println("Eating.");
    }
}

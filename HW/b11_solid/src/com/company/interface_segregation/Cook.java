package com.company.interface_segregation;

public class Cook implements Worker, Eater {
    @Override
    public void work() {
        System.out.println("Working.");
    }

    @Override
    public void eat() {
        System.out.println("Eating.");
    }
}

package com.company.single_responsibility;

public class Janitor implements Employee {
    void cleanFloor(){
        System.out.println("Cleaning floor.");
    }

    @Override
    public int getSalary() {
        return 15;
    }
}

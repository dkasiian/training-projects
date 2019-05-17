package com.company.single_responsibility;

public class Cook implements Employee {
    void cook(){
        System.out.println("Cooking.");
    }

    @Override
    public int getSalary() {
        return 20;
    }
}

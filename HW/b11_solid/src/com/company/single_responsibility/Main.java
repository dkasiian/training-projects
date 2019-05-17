package com.company.single_responsibility;

public class Main {
    public static void main(String[] args) {
        Cook cook = new Cook();
        Janitor janitor = new Janitor();

        System.out.println(cook.getSalary());
        cook.cook();

        System.out.println(janitor.getSalary());
        janitor.cleanFloor();
    }
}

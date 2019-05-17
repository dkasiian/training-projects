package com.company.open_close;

public class Main {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();
//        Celica celica = new Celica();
        workInTaxi(toyota);
    }

    private static void workInTaxi(Car car){
        car.workInTaxi();
    }
}

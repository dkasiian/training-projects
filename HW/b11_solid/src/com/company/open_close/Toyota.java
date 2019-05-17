package com.company.open_close;

public class Toyota implements Car {
    private void getPassengers(){
        System.out.println("Get passengers.");
    }

    @Override
    public void workInTaxi() {
        getPassengers();
    }
}

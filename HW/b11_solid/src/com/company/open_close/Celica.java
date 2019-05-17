package com.company.open_close;

public class Celica extends Toyota {
    private void getPassenger(){
        System.out.println("Get passenger.");
    }

    @Override
    public void workInTaxi(){
        getPassenger();
    }
}

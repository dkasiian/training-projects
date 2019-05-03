package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        final int SIZE = 10000;
        Thread[] arr = new Thread[SIZE];
        for (int i = 0; i < SIZE; i++){
            arr[i] = new Thread(Singleton4::getInstance);
            arr[i].start();
        }
        for (int i = 0; i < SIZE; i++){
            arr[i].join();
        }

        System.out.println(Singleton4.count);
    }
}

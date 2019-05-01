package com.company;

public class ConsoleObserver implements Observer {
    @Override
    public void handleEvent(int temperature, int pressure) {
        System.out.println("Weather changed. temperature: " + temperature + ", pressure: " + pressure);
    }
}

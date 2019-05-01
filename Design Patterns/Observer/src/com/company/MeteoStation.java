package com.company;

import java.util.ArrayList;
import java.util.List;

class MeteoStation implements Observed {
    private int temperature;
    private int pressure;

    private List<Observer> observers = new ArrayList<>();

    void setMeasurements(int temperature, int pressure){
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.handleEvent(temperature, pressure);
        }
    }
}

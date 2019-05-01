package com.company;

public class Main {

    public static void main(String[] args) {
        MeteoStation meteoStation = new MeteoStation();

        meteoStation.addObserver(new ConsoleObserver());
        meteoStation.addObserver(new FileObserver());

        meteoStation.setMeasurements(25, 760);
        meteoStation.setMeasurements(-5, 745);
    }
}

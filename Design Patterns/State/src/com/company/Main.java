package com.company;

public class Main {

    public static void main(String[] args) {
        Station dfm = new RadioDFM();
        Radio radio= new Radio();
        radio.setStation(dfm);

        for (int i = 0; i < 10; i++){
            radio.play();
            radio.nextStation();
        }
    }
}

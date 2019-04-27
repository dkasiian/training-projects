package com.company;

public class Main {

    public static void main(String[] args) {
        WatchMaker maker = getMakerByName("Digital");

        Watch watch = maker.createWatch();
        watch.showTime();
    }

    private static WatchMaker getMakerByName(String name){
        if (name.equals("Digital")){
            return new DigitalWatchMaker();
        } else if (name.equals("Rome")){
            return new RomeWatchMaker();
        }
        throw new RuntimeException("Invalid name: " + name);
    }
}

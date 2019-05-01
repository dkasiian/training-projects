package com.company;

// Context
class Radio {
    private Station station;

    void setStation(Station station) {
        this.station = station;
    }

    void nextStation(){
        if (station instanceof RadioSeven){
            setStation(new RadioDFM());
        } else if (station instanceof RadioDFM){
            setStation(new RadioVesti());
        } else if (station instanceof RadioVesti){
            setStation(new RadioSeven());
        }
    }

    void play(){
        station.play();
    }
}

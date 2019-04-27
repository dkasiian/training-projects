package com.company;

class Computer {
    private Power power = new Power();
    private DVDRom dvdRom = new DVDRom();
    private HDD hdd = new HDD();

    void copy(){
        power.on();
        dvdRom.loadData();
        hdd.copyFromDVD(dvdRom);
    }
}

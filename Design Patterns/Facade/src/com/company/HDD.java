package com.company;

class HDD {
    void copyFromDVD(DVDRom dvdRom){
        if(dvdRom.hasData()){
            System.out.println("Initialize coping data from dvd.");
        } else {
            System.out.println("Please, load dvd.");
        }
    }
}

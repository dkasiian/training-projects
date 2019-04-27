package com.company;

class DVDRom {
    private boolean data = false;

    boolean hasData(){
        return data;
    }

    void loadData(){
        data = true;
    }

    void unloadData(){
        data = false;
    }
}

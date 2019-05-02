package com.company;

class RealImage implements Image {

    private String file;

    RealImage(String file) {
        this.file = file;
        load();
    }

    private void load(){
        System.out.println("Loading " + file);
    }

    @Override
    public void display() {
        System.out.println("Display " + file);
    }
}

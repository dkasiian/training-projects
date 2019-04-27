package com.company;

class Painter{
    private Graphics graphics;

    void setGraphics(Graphics graphics){
        this.graphics = graphics;
    }

    void draw(){
        graphics.draw();
    }
}

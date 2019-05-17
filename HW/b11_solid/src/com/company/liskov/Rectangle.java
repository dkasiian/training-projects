package com.company.liskov;

public class Rectangle implements Shape {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getSquare(){
        return width * height;
    }
}

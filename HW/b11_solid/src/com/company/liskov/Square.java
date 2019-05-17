package com.company.liskov;

public class Square implements Shape {
    private int side;

    @Override
    public int getSquare() {
        return side * side;
    }

    public int getSide() {
        return side;
    }

    void setSide(int side) {
        this.side = side;
    }
}

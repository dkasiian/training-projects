package com.company;

class Circle implements Shape{
    private int r = 5;

    @Override
    public void draw(int x, int y) {
        System.out.println("Draw circle with radius=" + r + ", origin x=" + x + ", y=" + y);
    }
}

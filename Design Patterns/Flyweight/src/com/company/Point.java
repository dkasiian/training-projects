package com.company;

class Point implements Shape{
    @Override
    public void draw(int x, int y) {
        System.out.println("Draw point, x=" + x + ", y=" + y);
    }
}

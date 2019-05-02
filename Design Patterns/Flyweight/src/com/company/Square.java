package com.company;

class Square implements Shape{
    private int side = 10;
    @Override
    public void draw(int x, int y) {
        System.out.println("Draw square with side length " + side + " at the point x=" + x + ", y=" + y);
    }
}

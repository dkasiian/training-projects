package com.company.liskov;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(20);
        System.out.println(rectangle.getSquare());

        Square square = new Square();
        square.setSide(10);
        System.out.println(square.getSquare());
    }
}

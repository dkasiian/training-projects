package com.company;

import java.util.HashMap;
import java.util.Map;

class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<>();

    Shape getShape(String name){
        Shape shape = shapes.get(name);
        if (shape == null){
            switch (name){
                case "circle":
                    shape = new Circle(); break;
                case "square":
                    shape = new Square(); break;
                case "point":
                    shape = new Point(); break;
            }
            shapes.put(name, shape);
        }
        return shape;
    }
}

package model.flowers;

import model.characteristics.Color;
import model.entities.Flower;
import model.characteristics.Recency;

import java.math.BigDecimal;

public class Tulip extends Flower {
    private final static String name = "Tulip";

    public Tulip(Color color, Recency recency, double stemLength, BigDecimal price) {
        super(name, color, recency, stemLength, price);
    }
}

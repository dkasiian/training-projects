package model.flowers;

import model.characteristics.Color;
import model.entities.Flower;
import model.characteristics.Recency;
import model.entities.PreparedFlower;

import java.math.BigDecimal;

/**
 * Concrete realisation that represent tulip flower.
 */
public class Tulip extends Flower {
    private final static String name = "Tulip";

    public Tulip(Color color, Recency recency, double stemLength, BigDecimal price) {
        super(name, color, recency, stemLength, price);
    }

    public Tulip(PreparedFlower flower){
        super(name, flower.getColor(), flower.getRecency(), flower.getStemLength(), flower.getPrice());
    }
}

package model.flowers;

import model.characteristics.Color;
import model.entities.Flower;
import model.characteristics.Recency;
import model.entities.PreparedFlower;

import java.math.BigDecimal;

/**
 * Concrete realisation that represent lily flower.
 */
public class Lily extends Flower {
    private final static String name = "Lily";

    public Lily(Color color, Recency recency, double stemLength, BigDecimal price) {
        super(name, color, recency, stemLength, price);
    }

    public Lily(PreparedFlower flower){
        super(name, flower.getColor(), flower.getRecency(), flower.getStemLength(), flower.getPrice());
    }
}

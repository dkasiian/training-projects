package model.flowers;

import model.characteristics.Color;
import model.entities.Flower;
import model.characteristics.Recency;
import model.entities.PreparedFlower;

import java.math.BigDecimal;

/**
 * Concrete realisation that represent chrysanthemum flower.
 */
public class Chrysanthemum extends Flower {

    private final static String name = "Chrysanthemum";

    public Chrysanthemum(Color color, Recency recency, double stemLength, BigDecimal price) {
        super(name, color, recency, stemLength, price);
    }

    public Chrysanthemum(PreparedFlower flower){
        super(name, flower.getColor(), flower.getRecency(), flower.getStemLength(), flower.getPrice());
    }

}

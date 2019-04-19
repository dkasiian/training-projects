package model.flowers;

import model.characteristics.Color;
import model.entities.Flower;
import model.characteristics.Recency;

import java.math.BigDecimal;

public class Chrysanthemum extends Flower {

    private final static String name = "Chrysanthemum";

    public Chrysanthemum(Color color, Recency recency, float stemLength, BigDecimal price) {
        super(name, color, recency, stemLength, price);
    }

}

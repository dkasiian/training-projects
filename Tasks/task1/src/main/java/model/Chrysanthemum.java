package model;

import java.math.BigDecimal;

public class Chrysanthemum extends Flower {

    private final static String name = "Chrysanthemum";

    public Chrysanthemum(Recency recency, float stemLength, BigDecimal price) {
        super(name, recency, stemLength, price);
    }

}

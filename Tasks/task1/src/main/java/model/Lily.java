package model;

import java.math.BigDecimal;

public class Lily extends Flower {
    private final static String name = "Lily";

    public Lily(Recency recency, float stemLength, BigDecimal price) {
        super(name, recency, stemLength, price);
    }
}

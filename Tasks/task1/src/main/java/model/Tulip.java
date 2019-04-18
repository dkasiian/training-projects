package model;

import java.math.BigDecimal;

public class Tulip extends Flower {
    private final static String name = "Tulip";

    public Tulip(Recency recency, float stemLength, BigDecimal price) {
        super(name, recency, stemLength, price);
    }
}

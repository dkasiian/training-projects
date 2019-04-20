package model.entities;

import model.characteristics.Color;
import model.characteristics.Recency;

import java.math.BigDecimal;

public enum PreparedFlower {
    TULIP(Color.RED, Recency.RECENT, 8.5, BigDecimal.valueOf(12.5)),
    LILY(Color.WHITE, Recency.RECENT, 10, BigDecimal.valueOf(10)),
    CHRYSANTHEMUM(Color.BLUE, Recency.RECENT, 12, BigDecimal.valueOf(15.5));

    private final Color color;
    private final Recency recency;
    private final double stemLength;
    private final BigDecimal price;

    PreparedFlower(Color color, Recency recency, double stemLength, BigDecimal price){
        this.color = color;
        this.recency = recency;
        this.stemLength = stemLength;
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public Recency getRecency() {
        return recency;
    }

    public double getStemLength() {
        return stemLength;
    }

    public BigDecimal getPrice() {
        return price;
    }
}

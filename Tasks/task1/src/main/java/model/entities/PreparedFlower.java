package model.entities;

import model.characteristics.Color;
import model.characteristics.Recency;
import model.flowers.*;

import java.math.BigDecimal;

import static model.characteristics.Color.*;
import static model.characteristics.Recency.*;

public enum PreparedFlower {
    CHRYSANTHEMUM(BLUE, NEW, 12, BigDecimal.valueOf(15.5)),
    LILY(WHITE, RECENT, 10, BigDecimal.valueOf(10)),
    TULIP(RED, FADED, 8.5, BigDecimal.valueOf(1.5));

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

    public Flower getPreparedFlower(PreparedFlower flower){
        switch (flower){
            case CHRYSANTHEMUM:
                return new Chrysanthemum(
                        CHRYSANTHEMUM.color,
                        CHRYSANTHEMUM.recency,
                        CHRYSANTHEMUM.stemLength,
                        CHRYSANTHEMUM.price);
            case LILY:
                return new Lily(
                        LILY.color,
                        LILY.recency,
                        LILY.stemLength,
                        LILY.price);
            case TULIP:
                return new Tulip(
                        TULIP.color,
                        TULIP.recency,
                        TULIP.stemLength,
                        TULIP.price);
            default:
                return new Lily(
                        LILY.color,
                        LILY.recency,
                        LILY.stemLength,
                        LILY.price);
        }
    }

}

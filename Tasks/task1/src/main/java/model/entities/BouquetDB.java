package model.entities;

import model.characteristics.Color;
import model.characteristics.Recency;

import java.math.BigDecimal;

public enum BouquetDB {
    TULIP_BOUQUET("Tulip", Color.RED, Recency.NEW, 10, BigDecimal.valueOf(20)),
    LILY_BOUQUET("Lily", Color.WHITE, Recency.RECENT, 15, BigDecimal.valueOf(25)),
    CHRYSANTHEMUM_BOUQUET("Chrysanthemum", Color.ORANGE, Recency.NEW, 8, BigDecimal.valueOf(15));

    private final String name;
    private final Color color;
    private final Recency recency;
    private final double stemLength;
    private final BigDecimal price;

    BouquetDB(String name, Color color, Recency recency, double stemLength, BigDecimal price){
        this.name = name;
        this.color = color;
        this.recency = recency;
        this.stemLength = stemLength;
        this.price = price;
    }
}

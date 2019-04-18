package model;

import com.sun.org.apache.regexp.internal.RE;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Flower {
    private final String name;
    private final Recency recency;
    private final double stemLength;
    private final BigDecimal price;

    public Flower(String name, Recency recency, double stemLength, BigDecimal price){
        this.name = name;
        this.recency = recency;
        this.stemLength = stemLength;
        this.price = price;
    }

    public String getName() {
        return name;
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

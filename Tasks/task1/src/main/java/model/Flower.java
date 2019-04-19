package model;

import java.math.BigDecimal;
import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public abstract class Flower implements Comparable <Flower> {
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

    @Override
    public int compareTo(Flower compareFlower){
        LocalDate compareRecency = compareFlower.getRecency().getDate();
        LocalDate thisRecency = this.getRecency().getDate();
        return  (int) DAYS.between(thisRecency, compareRecency);
    }

    @Override
    public String toString(){
        return this.getName() + ", " +
                this.getRecency() + ", " +
                this.getStemLength() + ", " +
                this.getPrice() + ".";
    }
}

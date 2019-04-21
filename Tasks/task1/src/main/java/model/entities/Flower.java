package model.entities;

import model.characteristics.Color;
import model.characteristics.Recency;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

/**
 * Class to represent the common flowers properties.
 */
public abstract class Flower implements Comparable <Flower> {
    private final String name;
    private final Color color;
    private final Recency recency;
    private final double stemLength;
    private final BigDecimal price;

    /**
     * Initializes a flower.
     *
     * @param name flower name
     * @param color flower color
     * @param recency flower recency
     * @param stemLength flower stem length
     * @param price flower price
     */
    public Flower(String name, Color color, Recency recency, double stemLength, BigDecimal price){
        this.name = name;
        this.color = color;
        this.recency = recency;
        this.stemLength = stemLength;
        this.price = price;
    }

    /**
     * Returns flower name.
     *
     * @return flower name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns flower color.
     *
     * @return flower color
     */
    public Color getColor() { return color; }

    /**
     * Returns flower recency.
     *
     * @return flower recency
     */
    public Recency getRecency() {
        return recency;
    }

    /**
     * Returns flower stem length.
     *
     * @return flower stem length
     */
    public double getStemLength() {
        return stemLength;
    }

    /**
     * Returns flower price.
     *
     * @return flower price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Compares this object recency with the specified object recency for order.
     *
     * @param compareFlower flower to compare
     * @return a negative integer, zero, or a positive integer as this object is
     *         less than, equal to, or greater than the specified object.
     */
    @Override
    public int compareTo(Flower compareFlower){
        LocalDate compareRecency = compareFlower.getRecency().getDate();
        LocalDate thisRecency = this.getRecency().getDate();
        int diff = Period.between(thisRecency, compareRecency).getDays();
        return diff;
    }
}

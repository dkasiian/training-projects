package model;

import java.time.LocalDate;

public abstract class Flower {
    private LocalDate recency;
    private float stemLength;
    private float price;

    public Flower(LocalDate recency, float stemLength, float price){
        this.recency = recency;
        this.stemLength = stemLength;
        this.price = price;
    }


    public LocalDate getRecency() {
        return recency;
    }

    public float getStemLength() {
        return stemLength;
    }

    public float getPrice() {
        return price;
    }
}

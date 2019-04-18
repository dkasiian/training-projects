package model;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Bouquet {
    private ArrayList<Flower> flowers;
    private ArrayList<Accessories> accessories;
    private BigDecimal bouquetPrice;

    public  Bouquet(){
        flowers = new ArrayList<>();
        accessories = new ArrayList<>();
        bouquetPrice = BigDecimal.ZERO;
    }

    public void addFlower(Flower flower){
        flowers.add(flower);
        bouquetPrice = bouquetPrice.add(flower.getPrice());
    }

    public void addAccessorie(Accessories accessorie){
        accessories.add(accessorie);
        bouquetPrice = bouquetPrice.add(accessorie.getAccessoriePrice());
    }

    public BigDecimal getBouquetPrice() {
        return bouquetPrice;
    }
}

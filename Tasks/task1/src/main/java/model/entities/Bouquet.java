package model.entities;

import model.characteristics.Accessory;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Class to represent the bouquet.
 */
public class Bouquet {
    private List<Flower> flowers;
    private List<Accessory> accessories;
    private BigDecimal bouquetPrice;

    /**
     * Initializes an empty bouquet.
     */
    public Bouquet(){
        flowers = new ArrayList<>();
        accessories = new ArrayList<>();
        bouquetPrice = BigDecimal.ZERO;
    }

    /**
     * Returns flowers of the bouquet.
     *
     * @return list of bouquet's flowers
     */
    public List<Flower> getFlowers() {
        return flowers;
    }

    /**
     * Returns accessories of the bouquet.
     *
     * @return list of bouquet's accessories
     */
    public List<Accessory> getAccessories() {
        return accessories;
    }

    /**
     * Returns the price of the bouquet.
     *
     * @return the price of the bouquet
     */
    public BigDecimal getBouquetPrice() {
        return bouquetPrice;
    }

    /**
     * Adds the flower to this bouquet.
     *
     * @param flower the flower to add
     */
    public void addFlower(Flower flower){
        flowers.add(flower);
        bouquetPrice = bouquetPrice.add(flower.getPrice());
    }

    /**
     * Adds the accessory to this bouquet.
     *
     * @param accessory the accessory to add
     */
    public void addAccessory(Accessory accessory){
        accessories.add(accessory);
        bouquetPrice = bouquetPrice.add(accessory.getPrice());
    }

    /**
     * Sorts the flowers in the bouquet by their recency.
     */
    public void sortFlowersByRecency(){
        flowers = flowers.stream()
                .sorted(Comparator.comparing(f -> f.getRecency()))
                .collect(Collectors.toList());
    }

    /**
     * Returns flowers that correspond to the specified stem length ranges.
     *
     * @param from minimum stem length
     * @param to maximum stem length
     * @return list of bouquet's flowers that correspond to the specified stem length ranges
     */
    public List<Flower> findFlowersWithStemLengthBetween(double from, double to){
        return flowers.stream()
                .filter(f -> f.getStemLength() >= from && f.getStemLength() <= to)
                .collect(Collectors.toList());
    }
}

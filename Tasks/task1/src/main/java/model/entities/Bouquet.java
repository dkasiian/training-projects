package model.entities;

import model.characteristics.Accessory;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Class to represent the bouquet.
 */
public class Bouquet {
    private ArrayList<Flower> flowers;
    private ArrayList<Accessory> accessories;
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
    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    /**
     * Returns accessories of the bouquet.
     *
     * @return list of bouquet's accessories
     */
    public ArrayList<Accessory> getAccessories() {
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
        for (int i = 0; i < flowers.size() - 1; i++){
            for (int j = i + 1; j < flowers.size(); j++) {
                if (flowers.get(i).compareTo(flowers.get(j)) > 0) {
                    Flower temp = flowers.get(i);
                    flowers.set(i, flowers.get(j));
                    flowers.set(j, temp);
                }
            }
        }
    }

    /**
     * Returns flowers that correspond to the specified stem length ranges.
     *
     * @param from minimum stem length
     * @param to maximum stem length
     * @return list of bouquet's flowers that correspond to the specified stem length ranges
     */
    public ArrayList<Flower> findFlowersWithStemLengthBetween(double from, double to){
        ArrayList<Flower> resultFlowers = new ArrayList<>();
        for (Flower flower : this.flowers){
            if (flower.getStemLength() >= from && flower.getStemLength() <= to){
                resultFlowers.add(flower);
            }
        }
        return resultFlowers;
    }
}

package model.entities;

import model.characteristics.Accessory;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Bouquet {
    private ArrayList<Flower> flowers;
    private ArrayList<Accessory> accessories;
    private BigDecimal bouquetPrice;

    public  Bouquet(){
        flowers = new ArrayList<>();
        accessories = new ArrayList<>();
        bouquetPrice = BigDecimal.ZERO;
    }

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public ArrayList<Accessory> getAccessories() {
        return accessories;
    }

    public BigDecimal getBouquetPrice() {
        return bouquetPrice;
    }

    public void addFlower(Flower flower){
        flowers.add(flower);
        bouquetPrice = bouquetPrice.add(flower.getPrice());
    }

    public void addAccessory(Accessory accessory){
        accessories.add(accessory);
        bouquetPrice = bouquetPrice.add(accessory.getAccessoriePrice());
    }

    public void sortFlowersByRecency(){
        for (int i = 0; i < flowers.size() - 1; i++){
            if (flowers.get(i).compareTo(flowers.get(i+1)) > 0){
                Flower temp = flowers.get(i);
                flowers.set(i, flowers.get(i + 1));
                flowers.set(i + 1, temp);
            }
        }
    }

    public ArrayList<Flower> findFlowersWithStemLengthBetween(double from, double to){
        ArrayList<Flower> resultFlowers = new ArrayList<>();
        for (Flower flower : this.flowers){
            if (flower.getStemLength() >= from && flower.getStemLength() <= to){
                resultFlowers.add(flower);
            }
        }
        return resultFlowers;
    }

    public void displayBouquetFlowers(){
        System.out.println("\n");
        if (this.flowers.size() != 0) {
            for (Flower flower : this.flowers) {
                System.out.println(flower);
            }
        } else {
            System.out.println("There aren't flowers in bouquet.");
        }
    }

    public void displayFlowers(ArrayList<Flower> flowers){
        System.out.println("\n");
        if (flowers.size() != 0) {
            for (Flower flower : flowers) {
                System.out.println(flower);
            }
        } else {
            System.out.println("There aren't flowers.");
        }
    }
}

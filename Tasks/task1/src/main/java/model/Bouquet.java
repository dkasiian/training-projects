package model;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private List<Flower> flowers;

    public  Bouquet(){
        flowers = new ArrayList<>();
    }

    public void addFlower(Flower flower){
        flowers.add(flower);
    }

    public float calculatePrice(){
        float bouquetPrice = 0;
        for (Flower flower : flowers){
            bouquetPrice += flower.getPrice();
        }
        return  bouquetPrice;
    }

}

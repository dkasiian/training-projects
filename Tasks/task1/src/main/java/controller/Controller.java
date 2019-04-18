package controller;

import model.*;

import java.math.BigDecimal;

public class Controller {

    public void process(){
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(new Lily(Recency.NEW, 10, BigDecimal.valueOf(10)));
        bouquet.addFlower(new Tulip(Recency.RECENT, 11, BigDecimal.valueOf(25.5)));
        bouquet.addFlower(new Chrysanthemum(Recency.SHRUNKEN, 12, BigDecimal.valueOf(15.8)));

        System.out.println(bouquet.getBouquetPrice());
    }
}

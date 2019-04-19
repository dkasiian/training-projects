package controller;

import model.*;
import view.View;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Controller {

    private View view;

    public Controller(View view){
        this.view = view;
    }

    public void process(){
        Bouquet bouquet = new Bouquet();

        bouquet.addFlower(new Lily(Recency.NEW, 10, BigDecimal.valueOf(10)));
        bouquet.addFlower(new Tulip(Recency.FADED, 5, BigDecimal.valueOf(0.5)));
        bouquet.addFlower(new Tulip(Recency.RECENT, 8, BigDecimal.valueOf(25.5)));
        bouquet.addFlower(new Chrysanthemum(Recency.SHRUNKEN, 12, BigDecimal.valueOf(15.8)));

        bouquet.addAccessory(Accessories.PACKAGING);
        bouquet.addAccessory(Accessories.POT);

        bouquet.displayBouquetFlowers();
        bouquet.sortFlowersByRecency();
        bouquet.displayBouquetFlowers();

        ArrayList<Flower> flowersWithAdjustedStem = bouquet.findFlowersWithStemLengthBetween(7, 11);
        bouquet.displayFlowers(flowersWithAdjustedStem);

        view.printMessage(bouquet.getBouquetPrice().toString());
    }
}

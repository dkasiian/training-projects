package controller;

import model.characteristics.Accessory;
import model.characteristics.Color;
import model.characteristics.Recency;
import model.entities.Bouquet;
import model.entities.Flower;
import model.flowers.Chrysanthemum;
import model.flowers.Lily;
import model.flowers.Tulip;
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

        bouquet.addFlower(new Lily(Color.WHITE, Recency.NEW, 10, BigDecimal.valueOf(10)));
        bouquet.addFlower(new Tulip(Color.RED, Recency.FADED, 5, BigDecimal.valueOf(0.5)));
        bouquet.addFlower(new Tulip(Color.ORANGE, Recency.RECENT, 8, BigDecimal.valueOf(25.5)));
        bouquet.addFlower(new Chrysanthemum(Color.BLUE, Recency.SHRUNKEN, 12, BigDecimal.valueOf(15.8)));

        bouquet.addAccessory(Accessory.PACKAGING);
        bouquet.addAccessory(Accessory.POT);

        bouquet.displayBouquetFlowers();
        bouquet.sortFlowersByRecency();
        bouquet.displayBouquetFlowers();

        ArrayList<Flower> flowersWithAdjustedStem = bouquet.findFlowersWithStemLengthBetween(7, 11);
        bouquet.displayFlowers(flowersWithAdjustedStem);

        view.printMessage(bouquet.getBouquetPrice().toString());
    }
}

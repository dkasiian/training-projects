package controller;

import model.BouquetFactory;
import model.characteristics.*;
import model.entities.Bouquet;
import model.entities.Flower;
import model.entities.PreparedBouquet;
import model.flowers.*;
import view.View;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Controller {

    private View view;

    public Controller(View view){
        this.view = view;
    }

    public void process(){
        // Creating new bouquets
        Bouquet lilyDefaultBouquet = BouquetFactory.createDefaultBouquet(PreparedBouquet.LILY_BOUQUET);

        Bouquet compoundedBouquet = BouquetFactory.createBouquet(
                new Lily(Color.WHITE, Recency.NEW, 10, BigDecimal.valueOf(10)),
                new Tulip(Color.RED, Recency.FADED, 5, BigDecimal.valueOf(0.5)),
                new Tulip(Color.ORANGE, Recency.RECENT, 8, BigDecimal.valueOf(25.5)),
                new Chrysanthemum(Color.BLUE, Recency.SHRUNKEN, 12, BigDecimal.valueOf(15.8))
        );

        // Adding accessories to bouquets
        lilyDefaultBouquet.addAccessory(Accessory.TAPE);
        lilyDefaultBouquet.addAccessory(Accessory.PACKAGING);

        compoundedBouquet.addAccessory(Accessory.POT);

        // Displaying and sort bouquets by recency
        lilyDefaultBouquet.displayBouquetFlowers();
        lilyDefaultBouquet.sortFlowersByRecency();
        lilyDefaultBouquet.displayBouquetFlowers();

        compoundedBouquet.displayBouquetFlowers();
        compoundedBouquet.sortFlowersByRecency();
        compoundedBouquet.displayBouquetFlowers();

        // Selecting flowers with specified stem range
        ArrayList<Flower> flowersWithAdjustedStem = lilyDefaultBouquet.findFlowersWithStemLengthBetween(7, 9);
        lilyDefaultBouquet.displayFlowers(flowersWithAdjustedStem);

        flowersWithAdjustedStem = compoundedBouquet.findFlowersWithStemLengthBetween(7, 11);
        compoundedBouquet.displayFlowers(flowersWithAdjustedStem);

        // Displaying bouquets' price
        view.printMessage(lilyDefaultBouquet.getBouquetPrice().toString());

        view.printMessage(compoundedBouquet.getBouquetPrice().toString());
    }
}

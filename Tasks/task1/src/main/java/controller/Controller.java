package controller;

import model.*;
import view.View;

import java.math.BigDecimal;

public class Controller {

    private View view;

    public Controller(View view){
        this.view = view;
    }

    public void process(){
        Bouquet bouquet = new Bouquet();

        bouquet.addFlower(new Lily(Recency.NEW, 10, BigDecimal.valueOf(10)));
        bouquet.addFlower(new Tulip(Recency.RECENT, 11, BigDecimal.valueOf(25.5)));
        bouquet.addFlower(new Chrysanthemum(Recency.SHRUNKEN, 12, BigDecimal.valueOf(15.8)));

        bouquet.addAccessorie(Accessories.PACKAGING);
        bouquet.addAccessorie(Accessories.POT);

        view.printMessage(bouquet.getBouquetPrice().toString());
    }
}

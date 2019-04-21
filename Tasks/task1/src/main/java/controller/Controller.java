package controller;


import model.entities.*;
import view.View;

import java.util.ArrayList;
import java.util.Scanner;

import static view.MessageConstants.BOUQUET_SORT;
import static view.MessageConstants.BOUQUET_STEM;

public class Controller {

    private View view;

    public Controller(View view){
        this.view = view;
    }

    public void process(){
        Scanner sc = new Scanner(System.in);
        InputUtilityController utilityController = new InputUtilityController(sc, view);

        Bouquet bouquet = utilityController.makeBouquet();
        view.printBouquetFlowers(bouquet.getFlowers());
        view.printAccessories(bouquet.getAccessories());
        view.printBouquetPrice(bouquet);

        view.printMessage(BOUQUET_SORT);
        bouquet.sortFlowersByRecency();
//        Collections.sort(bouquet.getFlowers());
        view.printBouquetFlowers(bouquet.getFlowers());

        view.printMessage(BOUQUET_STEM);
        ArrayList<Flower> stemFlowers = bouquet.findFlowersWithStemLengthBetween(7, 10);
        view.printBouquetFlowers(stemFlowers);
    }
}

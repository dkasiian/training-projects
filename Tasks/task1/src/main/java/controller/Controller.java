package controller;


import model.entities.*;
import view.View;

import java.util.ArrayList;
import java.util.Scanner;

import static view.MessageConstants.BOUQUET_PRICE;

public class Controller {

    private View view;

    public Controller(View view){
        this.view = view;
    }

    public void process(){
        Scanner sc = new Scanner(System.in);
        InputUtilityController utilityController = new InputUtilityController(sc, view);

//        utilityController.demo();
        Bouquet bouquet = utilityController.makeBouquet();
        view.printBouquetFlowers(bouquet);
        view.printBouquetPrice(bouquet);

        bouquet.sortFlowersByRecency();
        view.printBouquetFlowers(bouquet);

        ArrayList<Flower> stemFlowers = bouquet.findFlowersWithStemLengthBetween(7, 10);
        view.printFlowers(stemFlowers);
    }
}

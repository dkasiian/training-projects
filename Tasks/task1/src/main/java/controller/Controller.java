package controller;

import model.BouquetFactory;
import model.FlowerFactory;
import model.characteristics.*;
import model.entities.Bouquet;
import model.entities.Flower;
import model.entities.PreparedBouquet;
import model.entities.PreparedFlower;
import model.flowers.*;
import view.View;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    private View view;

    public Controller(View view){
        this.view = view;
    }

    public void process(){
        //demo();


        Scanner scanner = new Scanner(System.in);
        Bouquet bouquet = new Bouquet();
        boolean isRun = true;
        while (isRun){
            System.out.println("Make a choice:");
            System.out.println("- Press '1' to make a default bouquet;");
            System.out.println("- Press '2' to make a default bouquet from lilies;");
            System.out.println("- Press '3' to make a default bouquet from tulips;");
            System.out.println("- Press '4' to make a default bouquet from chrysanthemums;");
            System.out.println("- Press '5' to make an your unique bouquet;");
            System.out.println("- Press '6' to add accessories;");
            System.out.println("- Press '0' to exit;");

            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    bouquet = BouquetFactory.createDefaultBouquet(PreparedBouquet.DEFAULT_BOUQUET);
                    break;
                case 2:
                    bouquet = BouquetFactory.createDefaultBouquet(PreparedBouquet.LILY_BOUQUET);
                    break;
                case 3:
                    bouquet = BouquetFactory.createDefaultBouquet(PreparedBouquet.TULIP_BOUQUET);
                    break;
                case 4:
                    bouquet = BouquetFactory.createDefaultBouquet(PreparedBouquet.CHRYSANTHEMUM_BOUQUET);
                    break;
                case 5:
                    bouquet = composeUniqueBouquet();
                    break;
                case 6:
                    addAccessories(bouquet);
                    break;
                case 0:
                    isRun = false;
                    break;
                default:
                    System.out.println("Your choice is incorrect! Please, try again.");
                    break;
            }
        }

        bouquet.displayBouquetFlowers();
        view.printMessage(bouquet.getBouquetPrice().toString());

    }

    private Bouquet composeUniqueBouquet(){
        Bouquet compoundedBouquet = new Bouquet();
        Scanner scanner = new Scanner(System.in);
        boolean isRun = true;
        while (isRun){
            System.out.println("Make a choice:");
            System.out.println("- Press '1' to add a lily to your bouquet;");
            System.out.println("- Press '2' to add a tulip to your bouquet;");
            System.out.println("- Press '3' to add a chrysanthemum to your bouquet;");
            System.out.println("- Press '0' to exit;");

            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    compoundedBouquet.addFlower(FlowerFactory.createDefaultFlower(PreparedFlower.LILY));
                    break;
                case 2:
                    compoundedBouquet.addFlower(FlowerFactory.createDefaultFlower(PreparedFlower.TULIP));
                    break;
                case 3:
                    compoundedBouquet.addFlower(FlowerFactory.createDefaultFlower(PreparedFlower.CHRYSANTHEMUM));
                    break;
                case 0:
                    isRun = false;
                    break;
                default:
                    System.out.println("Your choice is incorrect! Please, try again.");
                    break;
            }
        }
        return compoundedBouquet;
    }

    private void addAccessories(Bouquet bouquet){
        Scanner scanner = new Scanner(System.in);
        boolean isRun = true;
        while (isRun){
            System.out.println("Make a choice:");
            System.out.println("- Press '1' to add a tape;");
            System.out.println("- Press '2' to add a packaging;");
            System.out.println("- Press '3' to add a pot;");
            System.out.println("- Press '0' to exit;");

            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    bouquet.addAccessory(Accessory.TAPE);
                    break;
                case 2:
                    bouquet.addAccessory(Accessory.PACKAGING);
                    break;
                case 3:
                    bouquet.addAccessory(Accessory.POT);
                    break;
                case 0:
                    isRun = false;
                    break;
                default:
                    System.out.println("Your choice is incorrect! Please, try again.");
                    break;
            }
        }
    }

    private void demo(){
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

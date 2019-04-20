package controller;

import model.BouquetFactory;
import model.FlowerFactory;
import model.entities.*;
import view.View;

import java.util.Scanner;

import static model.characteristics.Accessory.*;
import static model.entities.PreparedBouquet.*;
import static model.entities.PreparedFlower.*;
import static view.MessageConstants.*;

public class InputUtilityController {

    private Scanner scanner;
    private View view;

    public InputUtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public Bouquet makeBouquet(){
        Bouquet bouquet = new Bouquet();

        view.printMessages(
                INPUT_MAKE,
                INPUT1_DEF_BOUQUET,
                INPUT2_DEF_LILIES_BOUQUET,
                INPUT3_DEF_TULIPS_BOUQUET,
                INPUT4_DEF_CHRYSANT_BOUQUET,
                INPUT5_UNIQUE_BOUQUET,
                INPUT0_FINISH
        );

        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                bouquet = BouquetFactory.createDefaultBouquet(DEFAULT_BOUQUET);
                addAccessories(bouquet); break;
            case 2:
                bouquet = BouquetFactory.createDefaultBouquet(LILY_BOUQUET);
                addAccessories(bouquet); break;
            case 3:
                bouquet = BouquetFactory.createDefaultBouquet(TULIP_BOUQUET);
                addAccessories(bouquet); break;
            case 4:
                bouquet = BouquetFactory.createDefaultBouquet(CHRYSANTHEMUM_BOUQUET);
                addAccessories(bouquet); break;
            case 5:
                bouquet = makeUniqueBouquet();
                addAccessories(bouquet); break;
            case 0:
                break;
            default:
                view.printMessage(INPUT_WRONG_CHOICE); break;
        }
        return bouquet;
    }

    private Bouquet makeUniqueBouquet(){
        Bouquet bouquet = new Bouquet();
        boolean isRun = true;

        while (isRun){
            view.printMessages(
                    INPUT_MAKE,
                    INPUT1_ADD_LILY,
                    INPUT2_ADD_TULIP,
                    INPUT3_ADD_CHRYSANT,
                    INPUT0_FINISH
            );

            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    bouquet.addFlower(FlowerFactory.createDefaultFlower(LILY)); break;
                case 2:
                    bouquet.addFlower(FlowerFactory.createDefaultFlower(TULIP)); break;
                case 3:
                    bouquet.addFlower(FlowerFactory.createDefaultFlower(CHRYSANTHEMUM)); break;
                case 0:
                    isRun = false; break;
                default:
                    view.printMessage(INPUT_WRONG_CHOICE); break;
            }
        }
        return bouquet;
    }

    private void addAccessories(Bouquet bouquet){
        boolean isRun = true;

        while (isRun){
            view.printMessages(
                    INPUT_MAKE_ACCESSORIES,
                    INPUT1_ADD_TAPE,
                    INPUT2_ADD_PACK,
                    INPUT3_ADD_POT,
                    INPUT0_FINISH
            );

            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    bouquet.addAccessory(TAPE); break;
                case 2:
                    bouquet.addAccessory(PACKAGING); break;
                case 3:
                    bouquet.addAccessory(POT); break;
                case 0:
                    isRun = false; break;
                default:
                    view.printMessage(INPUT_WRONG_CHOICE); break;
            }
        }
    }

//    public void demo(){
//        // Creating new bouquets
//        Bouquet lilyDefaultBouquet = BouquetFactory.createDefaultBouquet(PreparedBouquet.LILY_BOUQUET);
//
//        Bouquet compoundedBouquet = BouquetFactory.createBouquet(
//                new Lily(Color.WHITE, Recency.NEW, 10, BigDecimal.valueOf(10)),
//                new Tulip(Color.RED, Recency.FADED, 5, BigDecimal.valueOf(0.5)),
//                new Tulip(Color.ORANGE, Recency.RECENT, 8, BigDecimal.valueOf(25.5)),
//                new Chrysanthemum(Color.BLUE, Recency.SHRUNKEN, 12, BigDecimal.valueOf(15.8))
//        );
//
//        // Adding accessories to bouquets
//        lilyDefaultBouquet.addAccessory(Accessory.TAPE);
//        lilyDefaultBouquet.addAccessory(Accessory.PACKAGING);
//
//        compoundedBouquet.addAccessory(Accessory.POT);
//
//        // Displaying and sort bouquets by recency
//        lilyDefaultBouquet.displayBouquetFlowers();
//        lilyDefaultBouquet.sortFlowersByRecency();
//        lilyDefaultBouquet.displayBouquetFlowers();
//
//        compoundedBouquet.displayBouquetFlowers();
//        compoundedBouquet.sortFlowersByRecency();
//        compoundedBouquet.displayBouquetFlowers();
//
//        // Selecting flowers with specified stem range
//        ArrayList<Flower> flowersWithAdjustedStem = lilyDefaultBouquet.findFlowersWithStemLengthBetween(7, 9);
//        lilyDefaultBouquet.displayFlowers(flowersWithAdjustedStem);
//
//        flowersWithAdjustedStem = compoundedBouquet.findFlowersWithStemLengthBetween(7, 11);
//        compoundedBouquet.displayFlowers(flowersWithAdjustedStem);
//
//        // Displaying bouquets' price
//        view.printMessage(lilyDefaultBouquet.getBouquetPrice().toString());
//
//        view.printMessage(compoundedBouquet.getBouquetPrice().toString());
//    }

}

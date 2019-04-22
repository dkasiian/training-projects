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

/**
 * The class provide utility methods for receiving the input, validation and creation Bouquet.
 */
public class InputUtilityController {

    private Scanner scanner;
    private View view;

    public InputUtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    /**
     * Handles user input and creates a Bouquet object based on user input.
     *
     * @return the bouquet
     */
    public Bouquet makeBouquet(){
        Bouquet bouquet = new Bouquet();
        boolean isRun = true;
        int choice;

        while (isRun) {
            view.printMessages(
                    INPUT_MAKE,
                    INPUT1_DEF_BOUQUET,
                    INPUT2_DEF_LILIES_BOUQUET,
                    INPUT3_DEF_TULIPS_BOUQUET,
                    INPUT4_DEF_CHRYSANT_BOUQUET,
                    INPUT5_UNIQUE_BOUQUET,
                    INPUT0_FINISH);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                view.printMessage(INPUT_WRONG_CHOICE); continue;
            }
            switch (choice) {
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
                case 0: break;
                default:
                    view.printMessage(INPUT_WRONG_CHOICE); continue;
            }
            isRun = false;
        }
        return bouquet;
    }

    /**
     * Additional method to create a unique bouquet based on user input.
     *
     * @return the bouquet
     */
    private Bouquet makeUniqueBouquet(){
        Bouquet bouquet = new Bouquet();
        boolean isRun = true;
        int choice;

        while (isRun){
            view.printMessages(
                    INPUT_MAKE,
                    INPUT1_ADD_LILY,
                    INPUT2_ADD_TULIP,
                    INPUT3_ADD_CHRYSANT,
                    INPUT0_FINISH);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                view.printMessage(INPUT_WRONG_CHOICE); continue;
            }
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
                    view.printMessage(INPUT_WRONG_CHOICE); continue;
            }
        }
        return bouquet;
    }

    /**
     * Adds accessories to a bouquet based on user input.
     *
     * @param bouquet Bouquet object for which you want to add accessories
     */
    private void addAccessories(Bouquet bouquet){
        boolean isRun = true;
        int choice;

        while (isRun){
            view.printMessages(
                    INPUT_MAKE_ACCESSORIES,
                    INPUT1_ADD_TAPE,
                    INPUT2_ADD_PACK,
                    INPUT3_ADD_POT,
                    INPUT0_FINISH);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                view.printMessage(INPUT_WRONG_CHOICE); continue;
            }
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
                    view.printMessage(INPUT_WRONG_CHOICE); continue;
            }
        }
    }
}

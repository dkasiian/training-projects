package view;

import model.entities.Bouquet;
import model.entities.Flower;

import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

import static view.MessageConstants.BOUQUET_PRICE;

public class View {

    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle = ResourceBundle.getBundle(
            MESSAGES_BUNDLE_NAME,
            //new Locale("ua", "UA"));   // Ukrainian
            new Locale("en"));        // English

//    private String concatenationString(String ... messages){
//        StringBuilder concatString = new StringBuilder();
//        for(String v : messages)
//            concatString = concatString.append(v);
//        return new String(concatString);
//    }

    public void printMessage(String message){
        System.out.println("\n" + bundle.getString(message));
    }

    public void printMessages(String ... messages){
        for (String message : messages)
            System.out.println(bundle.getString(message));
    }

    public void printBouquetFlowers(Bouquet bouquet){
        System.out.println("\n");
        if (bouquet.getFlowers().size() != 0) {
            for (Flower flower : bouquet.getFlowers()) {
                System.out.println(flower);
            }
        } else {
            System.out.println("There aren't flowers.");
        }
    }

    public void printFlowers(ArrayList<Flower> flowers){
        System.out.println("\n");
        if (flowers.size() != 0) {
            for (Flower flower : flowers) {
                System.out.println(flower);
            }
        } else {
            System.out.println("There aren't flowers.");
        }
    }

    public void printBouquetPrice(Bouquet bouquet){
        System.out.println("\n" + bundle.getString(BOUQUET_PRICE) + bouquet.getBouquetPrice());
    }
}

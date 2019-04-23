package view;

import model.characteristics.Accessory;
import model.entities.Bouquet;
import model.entities.Flower;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import static view.MessageConstants.*;

/**
 * Represents the visualization of the data.
 */
public class View {

    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle = ResourceBundle.getBundle(
            MESSAGES_BUNDLE_NAME,
//            new Locale("ua", "UA"));   // Ukrainian
            new Locale("en"));        // English

    /**
     * Prints one message.
     *
     * @param message message to print
     */
    public void printMessage(String message){
        System.out.println(bundle.getString(message));
    }

    /**
     * Prints several messages.
     *
     * @param messages messages to print
     */
    public void printMessages(String ... messages){
        for (String message : messages)
            System.out.println(bundle.getString(message));
    }

    /**
     * Prints all bouquet flowers in a table form.
     *
     * @param flowers bouquet flowers
     */
    public void printBouquetFlowers(List<Flower> flowers){
        if (flowers != null && flowers.size() != 0) {
            String nameFormat = "| %1$-15s |";
            String colorFormat = " %2$-10s |";
            String recencyFormat = " %3$-10s |";
            String stemFormat = " %4$-15s |";
            String priceFormat = " %5$-8s |%n";
            String format = nameFormat.concat(colorFormat).concat(recencyFormat).concat(stemFormat).concat(priceFormat);
            String line = new String(new char[74]).replace('\0', '-');

            System.out.println(line);
            System.out.printf("|%s|%s|%s|%s|%s|%n",
                    StringUtils.center(bundle.getString(OUTPUT_TABLE_NAME), 17),
                    StringUtils.center(bundle.getString(OUTPUT_TABLE_COLOR), 12),
                    StringUtils.center(bundle.getString(OUTPUT_TABLE_RECENCY), 12),
                    StringUtils.center(bundle.getString(OUTPUT_TABLE_STEM), 17),
                    StringUtils.center(bundle.getString(OUTPUT_TABLE_PRICE), 10));
            System.out.println(line);
            for (Flower f : flowers) {
                System.out.printf(format, f.getName(), f.getColor(), f.getRecency(), f.getStemLength(), f.getPrice());
            }
            System.out.println(line);
        } else {
            printMessage(BOUQUET_FLOWERS_EMPTY);
        }

    }

    /**
     * Prints bouquet price.
     *
     * @param bouquet bouquet for which the price will be displayed
     */
    public void printBouquetPrice(Bouquet bouquet){
        System.out.println(bundle.getString(BOUQUET_PRICE) + bouquet.getBouquetPrice());
    }

    /**
     * Prints all bouquet accessories in a table form.
     *
     * @param accessories bouquet accessories
     */
    public void printAccessories(List<Accessory> accessories){
        if (accessories != null && accessories.size() != 0){
            String nameFormat = "| %1$-15s |";
            String priceFormat = " %2$-8s |%n";
            String format = nameFormat.concat(priceFormat);
            String line = new String(new char[30]).replace('\0', '-');

            System.out.println(line);
            System.out.printf("|%s|%s|%n",
                    StringUtils.center(bundle.getString(OUTPUT_TABLE_NAME), 17),
                    StringUtils.center(bundle.getString(OUTPUT_TABLE_PRICE), 10));
            System.out.println(line);
            for (Accessory a : accessories) {
                System.out.printf(format, a.getName(), a.getPrice());
            }
            System.out.println(line);
        } else {
            printMessage(BOUQUET_ACCESSORIES_EMPTY);
        }
    }
}

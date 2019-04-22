package model;

import model.entities.Flower;
import model.entities.PreparedFlower;
import model.flowers.*;

/**
 * Responsible for flowers creating
 */
public class FlowerFactory {

    /**
     * Returns one of the ready-made (default) flowers
     *
     * @param flower flower name which will be created
     * @return one of the Flower sub-classes
     */
    public static Flower createDefaultFlower(PreparedFlower flower){
        switch (flower){
            case CHRYSANTHEMUM:
                return new Chrysanthemum(flower.CHRYSANTHEMUM);
            case TULIP:
                return new Tulip(flower.TULIP);
            default:
                return new Lily(flower.LILY);
        }
    }
}

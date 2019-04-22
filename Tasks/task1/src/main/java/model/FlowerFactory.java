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
     * @param f flower name which will be created
     * @return one of the Flower sub-classes
     */
    public static Flower createDefaultFlower(PreparedFlower f){
        switch (f){
            case CHRYSANTHEMUM:
                return new Chrysanthemum(f.getColor(), f.getRecency(), f.getStemLength(), f.getPrice());
            case TULIP:
                return new Tulip(f.getColor(), f.getRecency(), f.getStemLength(), f.getPrice());
            default:
                return new Lily(f.getColor(), f.getRecency(), f.getStemLength(), f.getPrice());
        }
    }
}

package model;

import model.entities.Flower;
import model.entities.PreparedFlower;

import static model.entities.PreparedFlower.*;

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
                return flower.getPreparedFlower(CHRYSANTHEMUM);
            case TULIP:
                return flower.getPreparedFlower(TULIP);
            default:
                return flower.getPreparedFlower(LILY);
        }
    }
}

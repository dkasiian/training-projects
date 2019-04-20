package model;

import model.entities.Flower;
import model.entities.PreparedFlower;
import model.flowers.*;

public class FlowerFactory {

    public static Flower createDefaultFlower(PreparedFlower flower){
        switch (flower){
            case LILY:
                return new Lily(flower.getColor(), flower.getRecency(), flower.getStemLength(), flower.getPrice());
            case TULIP:
                return new Tulip(flower.getColor(), flower.getRecency(), flower.getStemLength(), flower.getPrice());
            case CHRYSANTHEMUM:
                return new Chrysanthemum(flower.getColor(), flower.getRecency(), flower.getStemLength(), flower.getPrice());
            default:
                return new Lily(flower.getColor(), flower.getRecency(), flower.getStemLength(), flower.getPrice());
        }
    }
}

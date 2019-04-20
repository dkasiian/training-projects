package model;

import model.entities.Flower;
import model.entities.PreparedFlower;

import static model.entities.PreparedFlower.*;

public class FlowerFactory {

    public static Flower createDefaultFlower(PreparedFlower flower){
        switch (flower){
            case CHRYSANTHEMUM:
                return flower.getPreparedFlower(CHRYSANTHEMUM);
            case LILY:
                return flower.getPreparedFlower(LILY);
            case TULIP:
                return flower.getPreparedFlower(TULIP);
            default:
                return flower.getPreparedFlower(LILY);
        }
    }
}

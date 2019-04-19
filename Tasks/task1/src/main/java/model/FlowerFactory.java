package model;

import model.characteristics.Color;
import model.characteristics.Recency;
import model.entities.Flower;
import model.entities.PreparedFlower;
import model.flowers.*;

import java.math.BigDecimal;

public class FlowerFactory {

    public static Flower createDefaultFlower(PreparedFlower preparedFlower){
        switch (preparedFlower){
            case LILY:
                return new Lily(Color.WHITE, Recency.RECENT, 10, BigDecimal.valueOf(10));
            case TULIP:
                return new Tulip(Color.RED, Recency.RECENT, 8.5, BigDecimal.valueOf(12.5));
            case CHRYSANTHEMUM:
                return new Chrysanthemum(Color.BLUE, Recency.RECENT, 12, BigDecimal.valueOf(15.5));
            default:
                return new Lily(Color.WHITE, Recency.RECENT, 10, BigDecimal.valueOf(10));
        }
    }
}

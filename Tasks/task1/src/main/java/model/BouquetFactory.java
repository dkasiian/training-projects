package model;

import model.characteristics.Color;
import model.characteristics.Recency;
import model.entities.Bouquet;
import model.entities.Flower;
import model.entities.PreparedBouquet;
import model.entities.PreparedFlower;
import model.flowers.*;

import java.math.BigDecimal;

public class BouquetFactory {
    public static Bouquet createBouquet(Flower ... flowers) {
        Bouquet bouquet = new Bouquet();
        for (Flower flower : flowers) {
            bouquet.addFlower(flower);
        }
        return bouquet;
    }

    public static Bouquet createDefaultBouquet(PreparedBouquet preparedBouquet) {
        Bouquet bouquet = new Bouquet();
        switch (preparedBouquet){
            case LILY_BOUQUET:
                bouquet = BouquetFactory.createBouquet(
//                        new Lily(Color.WHITE, Recency.RECENT, 10, BigDecimal.valueOf(10)),
//                        new Lily(Color.WHITE, Recency.RECENT, 10, BigDecimal.valueOf(10)),
//                        new Lily(Color.WHITE, Recency.RECENT, 10, BigDecimal.valueOf(10))
                        FlowerFactory.createDefaultFlower(PreparedFlower.LILY),
                        FlowerFactory.createDefaultFlower(PreparedFlower.LILY),
                        FlowerFactory.createDefaultFlower(PreparedFlower.LILY)
                );
                break;
            case CHRYSANTHEMUM_BOUQUET:
                bouquet = BouquetFactory.createBouquet(
                        new Chrysanthemum(Color.BLUE, Recency.RECENT, 12, BigDecimal.valueOf(15.5)),
                        new Chrysanthemum(Color.BLUE, Recency.RECENT, 12, BigDecimal.valueOf(15.5)),
                        new Chrysanthemum(Color.BLUE, Recency.RECENT, 12, BigDecimal.valueOf(15.5))
                );
                break;
            case TULIP_BOUQUET:
                bouquet = BouquetFactory.createBouquet(
                        new Tulip(Color.RED, Recency.RECENT, 8.5, BigDecimal.valueOf(12.5)),
                        new Tulip(Color.RED, Recency.RECENT, 8.5, BigDecimal.valueOf(12.5)),
                        new Tulip(Color.RED, Recency.RECENT, 8.5, BigDecimal.valueOf(12.5))
                );
        }
        return bouquet;
    }
}

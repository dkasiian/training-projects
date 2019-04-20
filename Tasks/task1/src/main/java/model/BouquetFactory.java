package model;

import model.entities.*;

import static model.entities.PreparedFlower.*;

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
            case DEFAULT_BOUQUET:
                bouquet = BouquetFactory.createBouquet(
                        FlowerFactory.createDefaultFlower(LILY),
                        FlowerFactory.createDefaultFlower(TULIP),
                        FlowerFactory.createDefaultFlower(CHRYSANTHEMUM)
                );
                break;
            case LILY_BOUQUET:
                bouquet = BouquetFactory.createBouquet(
                        FlowerFactory.createDefaultFlower(LILY),
                        FlowerFactory.createDefaultFlower(LILY),
                        FlowerFactory.createDefaultFlower(LILY)
                );
                break;
            case CHRYSANTHEMUM_BOUQUET:
                bouquet = BouquetFactory.createBouquet(
                        FlowerFactory.createDefaultFlower(CHRYSANTHEMUM),
                        FlowerFactory.createDefaultFlower(CHRYSANTHEMUM),
                        FlowerFactory.createDefaultFlower(CHRYSANTHEMUM)
                );
                break;
            case TULIP_BOUQUET:
                bouquet = BouquetFactory.createBouquet(
                        FlowerFactory.createDefaultFlower(TULIP),
                        FlowerFactory.createDefaultFlower(TULIP),
                        FlowerFactory.createDefaultFlower(TULIP)
                );
        }
        return bouquet;
    }
}

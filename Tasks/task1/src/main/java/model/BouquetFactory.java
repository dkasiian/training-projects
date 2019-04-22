package model;

import model.entities.*;

import static model.entities.PreparedFlower.*;

/**
 * Responsible for bouquets creating
 */
public class BouquetFactory {

    /**
     * Creates the bouquet.
     *
     * @param flowers flowers to be added to the bouquet
     * @return bouquet of flowers
     */
    private static Bouquet createBouquet(Flower ... flowers) {
        Bouquet bouquet = new Bouquet();
        for (Flower flower : flowers)
            bouquet.addFlower(flower);
        return bouquet;
    }

    /**
     * Creates one of the predefined bouquets.
     *
     * @param preparedBouquet name of prepared bouquet to be created
     * @return one of the default bouquets
     */
    public static Bouquet createDefaultBouquet(PreparedBouquet preparedBouquet) {
        switch (preparedBouquet){
            case CHRYSANTHEMUM_BOUQUET:
                return BouquetFactory.createBouquet(
                        FlowerFactory.createDefaultFlower(CHRYSANTHEMUM),
                        FlowerFactory.createDefaultFlower(CHRYSANTHEMUM),
                        FlowerFactory.createDefaultFlower(CHRYSANTHEMUM));
            case LILY_BOUQUET:
                return BouquetFactory.createBouquet(
                        FlowerFactory.createDefaultFlower(LILY),
                        FlowerFactory.createDefaultFlower(LILY),
                        FlowerFactory.createDefaultFlower(LILY));
            case TULIP_BOUQUET:
                return BouquetFactory.createBouquet(
                        FlowerFactory.createDefaultFlower(TULIP),
                        FlowerFactory.createDefaultFlower(TULIP),
                        FlowerFactory.createDefaultFlower(TULIP));
            default:
                return BouquetFactory.createBouquet(
                        FlowerFactory.createDefaultFlower(LILY),
                        FlowerFactory.createDefaultFlower(TULIP),
                        FlowerFactory.createDefaultFlower(CHRYSANTHEMUM));
        }
    }
}

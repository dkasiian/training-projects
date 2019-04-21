package model.entities;

/**
 * Represents ready-made (default) bouquets
 */
public enum PreparedBouquet {
    DEFAULT_BOUQUET, CHRYSANTHEMUM_BOUQUET, LILY_BOUQUET, TULIP_BOUQUET
//    DEFAULT_BOUQUET(new ArrayList<Flower>(){
//        {
//            CHRYSANTHEMUM.getPreparedFlower(CHRYSANTHEMUM);
//            LILY.getPreparedFlower(LILY);
//            TULIP.getPreparedFlower(TULIP);
//        }
//    }),
//
//    TULIP_BOUQUET(new ArrayList<Flower>(){
//        {
//            TULIP.getPreparedFlower(TULIP);
//            TULIP.getPreparedFlower(TULIP);
//            TULIP.getPreparedFlower(TULIP);
//        }
//    }),
//
//    LILY_BOUQUET(new ArrayList<Flower>(){
//        {
//            LILY.getPreparedFlower(LILY);
//            LILY.getPreparedFlower(LILY);
//            LILY.getPreparedFlower(LILY);
//        }
//    }),
//
//    CHRYSANTHEMUM_BOUQUET(new ArrayList<Flower>(){
//        {
//            CHRYSANTHEMUM.getPreparedFlower(CHRYSANTHEMUM);
//            CHRYSANTHEMUM.getPreparedFlower(CHRYSANTHEMUM);
//            CHRYSANTHEMUM.getPreparedFlower(CHRYSANTHEMUM);
//        }
//    });
//
//    private ArrayList<Flower> flowers;
//
//    PreparedBouquet(ArrayList<Flower> flowers){
//        this.flowers = flowers;
//    }
//
//    public Bouquet getPreparedBouquet(PreparedBouquet bouquet){
//        switch (bouquet){
//            case CHRYSANTHEMUM:
//                return BouquetFactory.createBouquet(CHRYSANTHEMUM_BOUQUET.flowers.toArray());
//            case LILY:
//                return new Lily(
//                        LILY.color,
//                        LILY.recency,
//                        LILY.stemLength,
//                        LILY.price);
//            case TULIP:
//                return new Tulip(
//                        TULIP.color,
//                        TULIP.recency,
//                        TULIP.stemLength,
//                        TULIP.price);
//            default:
//                return new Lily(
//                        LILY.color,
//                        LILY.recency,
//                        LILY.stemLength,
//                        LILY.price);
//        }
//    }
}

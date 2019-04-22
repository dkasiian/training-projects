import model.FlowerFactory;
import model.characteristics.*;
import model.entities.*;
import model.flowers.*;
import org.junit.jupiter.api.*;

import java.math.BigDecimal;

import static model.entities.PreparedFlower.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MainTest {

    @Test
    void testFlowerFactory(){
        Flower fc = FlowerFactory.createDefaultFlower(CHRYSANTHEMUM);
        Flower fl = FlowerFactory.createDefaultFlower(LILY);
        Flower ft = FlowerFactory.createDefaultFlower(TULIP);

        assertAll(
                () -> assertEquals(fc.getClass(), Chrysanthemum.class),
                () -> assertEquals(fl.getClass(), Lily.class),
                () -> assertEquals(ft.getClass(), Tulip.class)
        );
    }

    @Test
    void testBouquetAddFlower(){
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(new Chrysanthemum(Color.WHITE, Recency.NEW, 10, BigDecimal.TEN));
        bouquet.addFlower(new Lily(Color.BLUE, Recency.RECENT, 12, BigDecimal.ONE));

        assertEquals(2, bouquet.getFlowers().size());
    }

    @Test
    void testBouquetAddAccessory(){
        Bouquet bouquet = new Bouquet();
        bouquet.addAccessory(Accessory.TAPE);
        bouquet.addAccessory(Accessory.PACKAGING);
        bouquet.addAccessory(Accessory.POT);

        assertEquals(3, bouquet.getAccessories().size());
    }

    @Test
    void testBouquetPrice(){
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(new Chrysanthemum(Color.WHITE, Recency.NEW, 10, BigDecimal.TEN));
        bouquet.addFlower(new Lily(Color.WHITE, Recency.NEW, 10, BigDecimal.ONE));
        bouquet.addAccessory(Accessory.POT); // 35

        assertEquals(BigDecimal.valueOf(46), bouquet.getBouquetPrice());
    }

}

import model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(new Lily(LocalDate.of(2019, 4, 10), 10, 20));
        bouquet.addFlower(new Tulip(LocalDate.of(2019, 4, 20), 11, 10.5f));
        bouquet.addFlower(new Chrysanthemum(LocalDate.of(2019, 3, 7), 12, 15.8f));

        System.out.println(bouquet.calculatePrice());
    }
}

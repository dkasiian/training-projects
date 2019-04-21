package model.characteristics;

import java.math.BigDecimal;

/**
 * Represents possible accessories for a bouquet.
 */
public enum Accessory {
    PACKAGING("Packaging", BigDecimal.valueOf(10)),
    TAPE("Tape", BigDecimal.valueOf(5)),
    POT("Pot", BigDecimal.valueOf(35));

    private final String name;
    private final BigDecimal price;

    Accessory(String name, BigDecimal accessoryPrice){
        this.name = name;
        this.price = accessoryPrice;
    }

    /**
     * Returns the accessory name
     *
     * @return accessory name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the accessory price
     *
     * @return accessory price
     */
    public BigDecimal getPrice() {
        return price;
    }

}

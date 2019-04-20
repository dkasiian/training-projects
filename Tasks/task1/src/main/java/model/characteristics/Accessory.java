package model.characteristics;

import java.math.BigDecimal;

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

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

}

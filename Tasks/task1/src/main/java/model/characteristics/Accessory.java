package model.characteristics;

import java.math.BigDecimal;

public enum Accessory {
    PACKAGING(BigDecimal.valueOf(10)),
    TAPE(BigDecimal.valueOf(5)),
    POT(BigDecimal.valueOf(35));

    private BigDecimal accessoryPrice;

    Accessory(BigDecimal accessoryPrice){
        this.accessoryPrice = accessoryPrice;
    }

    public BigDecimal getAccessoryPrice() {
        return accessoryPrice;
    }
}

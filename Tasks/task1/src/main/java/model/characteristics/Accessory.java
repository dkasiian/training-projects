package model.characteristics;

import java.math.BigDecimal;

public enum Accessory {
    PACKAGING(BigDecimal.valueOf(10)),
    TAPE(BigDecimal.valueOf(5)),
    POT(BigDecimal.valueOf(35));

    private BigDecimal accessoriePrice;

    Accessory(BigDecimal accessoriePrice){
        this.accessoriePrice = accessoriePrice;
    }

    public BigDecimal getAccessoriePrice() {
        return accessoriePrice;
    }
}

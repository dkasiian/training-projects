package model;

import java.math.BigDecimal;

public enum Accessories {
    PACKAGING(BigDecimal.valueOf(10)),
    TAPE(BigDecimal.valueOf(5)),
    POT(BigDecimal.valueOf(35));

    private BigDecimal accessoriePrice;

    Accessories(BigDecimal accessoriePrice){
        this.accessoriePrice = accessoriePrice;
    }

    public BigDecimal getAccessoriePrice() {
        return accessoriePrice;
    }
}

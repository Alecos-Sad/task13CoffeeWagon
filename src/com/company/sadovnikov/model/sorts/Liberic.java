package com.company.sadovnikov.model.sorts;

import com.company.sadovnikov.model.CoffeeSort;
import com.company.sadovnikov.type.CoffeeType;

public class Liberic extends CoffeeSort {
    public Liberic() {
        super("Liberic", 0);
        setPrice();
    }

    public void setPrice() {
        if (getCoffeeType() == CoffeeType.BEANS) {
            super.setPrice(1500.5);
        } else if (getCoffeeType() == CoffeeType.GROUND) {
            super.setPrice(2500.3);
        } else if (getCoffeeType() == CoffeeType.INSTANT_CANS) {
            super.setPrice(3000.5);
        } else if (getCoffeeType() == CoffeeType.INSTANT_BAG) {
            super.setPrice(3100.5);
        }
    }
}

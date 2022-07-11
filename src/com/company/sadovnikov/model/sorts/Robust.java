package com.company.sadovnikov.model.sorts;

import com.company.sadovnikov.model.CoffeeSort;
import com.company.sadovnikov.type.CoffeeType;

public class Robust extends CoffeeSort {

    double[] valuesPrice = new double[]{5600.5,4100.3,3900.5,2200.5};
    public Robust() {
        super("Robust", 0);
        setPrice();
    }

    public void setPrice() {
        if (getCoffeeType() == CoffeeType.BEANS) {
            super.setPrice(valuesPrice[0]);
        } else if (getCoffeeType() == CoffeeType.GROUND) {
            super.setPrice(valuesPrice[1]);
        } else if (getCoffeeType() == CoffeeType.INSTANT_CANS) {
            super.setPrice(valuesPrice[2]);
        } else if (getCoffeeType() == CoffeeType.INSTANT_BAG) {
            super.setPrice(valuesPrice[3]);
        }
    }
}

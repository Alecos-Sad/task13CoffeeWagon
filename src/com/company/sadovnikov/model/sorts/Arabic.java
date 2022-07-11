package com.company.sadovnikov.model.sorts;

import com.company.sadovnikov.model.CoffeeSort;
import com.company.sadovnikov.model.prices.ArabicPrice;
import com.company.sadovnikov.type.CoffeeType;


public class Arabic extends CoffeeSort {

    public Arabic() {
        super("Arabic", 0);
        setPrice();
    }

    public void setPrice() {
        ArabicPrice arabicPrice = new ArabicPrice();
        if (getCoffeeType() == CoffeeType.BEANS) {
            super.setPrice(arabicPrice.getBeans());
        } else if (getCoffeeType() == CoffeeType.GROUND) {
            super.setPrice(arabicPrice.getGround());
        } else if (getCoffeeType() == CoffeeType.INSTANT_CANS) {
            super.setPrice(arabicPrice.getInstantCans());
        } else if (getCoffeeType() == CoffeeType.INSTANT_BAG) {
            super.setPrice(arabicPrice.getInstantBag());
        }
    }
}


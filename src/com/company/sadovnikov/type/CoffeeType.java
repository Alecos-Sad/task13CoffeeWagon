package com.company.sadovnikov.type;

/**
 * Класс перечислений физических состояний сортов кофе
 */
public enum CoffeeType {

    BEANS(50.0),
    GROUND(60.0),
    INSTANT_CANS(70),
    INSTANT_BAG(95);

    double volume;

    CoffeeType(double volume) {
        this.volume = volume;

    }

    public double getVolume() {
        return volume;
    }


//    public static double getMaxPrice() {
//        CoffeeType[] items = CoffeeType.values();
//        double price = 0;
//        for (CoffeeType item : items) {
//            price = Math.max(price, item.getPrice());
//        }
//        return price;
//    }
//
//    public static double getMinPrice() {
//        CoffeeType[] items = CoffeeType.values();
//        double price = items[0].getPrice();
//        for (CoffeeType item : items) {
//            if (item.getPrice() < price) {
//                price = item.getPrice();
//            }
//        }
//        return price;
//    }

    public static double getMinVolume() {
        CoffeeType[] items = CoffeeType.values();
        double volume = items[0].getVolume();
        for (CoffeeType item : items) {
            if (item.getVolume() < volume) {
                volume = item.getVolume();
            }
        }
        return volume;
    }
}

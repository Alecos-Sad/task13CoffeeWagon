package com.company.sadovnikov.model;

import com.company.sadovnikov.type.CoffeeType;

public abstract class CoffeeSort {
    String name;
    double price;
    CoffeeType coffeeType;

    public CoffeeSort(String name, double price) {
        this.name = name;
        this.price = price;
        this.coffeeType = getRandomCoffee();
    }

    private CoffeeType getRandomCoffee() {
        int randomNumber = (int) (Math.random() * 4);
        CoffeeType[] items = CoffeeType.values();
        return items[randomNumber];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }
}

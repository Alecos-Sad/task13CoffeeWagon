package com.company.sadovnikov.model;

import com.company.sadovnikov.type.CoffeeType;

public abstract class CoffeeSort {
    String name;
    double price;
    CoffeeType coffeeType;
    double weight;


    public CoffeeSort(String name, double price) {
        this.name = name;
        this.price = price;
        this.coffeeType = getRandomCoffeeType();
        this.weight = coffeeType.getVolume();


    }

    private CoffeeType getRandomCoffeeType() {
        int randomNumber = (int) (Math.random() * 4);
        CoffeeType[] items = CoffeeType.values();
        return items[randomNumber];
    }

    public void setPrice(double price) {
        this.price = price;
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


    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public double getWeight() {
        return weight;
    }
}

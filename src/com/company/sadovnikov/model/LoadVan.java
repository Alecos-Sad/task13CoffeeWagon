package com.company.sadovnikov.model;

import com.company.sadovnikov.type.CoffeeType;
import java.util.ArrayList;
import java.util.List;

public class LoadVan {
    private double loadSum;
    private double loadVolume;
    List<CoffeeType> cargoList;


    public LoadVan(double loadSum, Van van) {
        this.loadSum = loadSum < 0 ? loadSum = 0 : loadSum;
        this.loadVolume = van.getCapacity();
    }

    public List<CoffeeType> getCargoList() {
        cargoList = new ArrayList<>();
        while (loadSum > 0 && !isCash() && loadVolume > 0 && !isWeight()) {
            CoffeeType item = getRandomCoffee();
            if (loadSum - item.getPrice() > 0 && loadVolume - item.getVolume() > 0) {
                loadSum = loadSum - item.getPrice();
                loadVolume = loadVolume - item.getVolume();
                cargoList.add(item);
            }
        }
       return cargoList;
    }

    public void balance(){
        System.out.println("Balance of unused money: " + loadSum);
        System.out.println("Unused volume balance: " + loadVolume);
    }

    private CoffeeType getRandomCoffee() {
        int randomNumber = (int) (Math.random() * 4);
        CoffeeType[] items = CoffeeType.values();
        return items[randomNumber];
    }

    public boolean isCash() {
        return loadSum < CoffeeType.getMinPrice();
    }

    public boolean isWeight() {
        return loadVolume < CoffeeType.getMinVolume();
    }
}

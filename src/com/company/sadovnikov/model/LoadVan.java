package com.company.sadovnikov.model;

import com.company.sadovnikov.model.sorts.Arabic;
import com.company.sadovnikov.model.sorts.Liberic;
import com.company.sadovnikov.model.sorts.Robust;
import com.company.sadovnikov.type.CoffeeType;

import java.util.ArrayList;
import java.util.List;

public class LoadVan {
    private double loadSum;
    private double loadVolume;
    List<CoffeeSort> cargoList;


    public LoadVan(double loadSum, Van van) {
        this.loadSum = loadSum < 0 ? loadSum = 0 : loadSum;
        this.loadVolume = van.getCapacity();
    }

    public List<CoffeeSort> getCargoList() {
        cargoList = new ArrayList<>();
        while (loadSum > 0 && !isCash() && loadVolume > 0 && !isWeight()) {
            CoffeeSort item = getRandomCoffee();
            if (loadSum - item.getPrice() > 0 && loadVolume - item.getWeight() > 0) {
                loadSum = loadSum - item.getPrice();
                loadVolume = loadVolume - item.getWeight();
                cargoList.add(item);
            }
        }
        return cargoList;
    }

    public void balance() {
        System.out.println("Balance of unused money: " + loadSum);
        System.out.println("Unused volume balance: " + loadVolume);
    }

    private CoffeeSort getRandomCoffee() {
        int randomNumber = (int) (Math.random() * 3);
        if (randomNumber == 0) {
            return new Arabic();
        } else if (randomNumber == 1) {
            return new Robust();
        }
        return new Liberic();
    }

    public double getMinPrice(){
        return 0;
    }

    public boolean isCash() {



        //return loadSum < CoffeeType.getMinPrice();
        return true;
    }

    public boolean isWeight() {
        return loadVolume < CoffeeType.getMinVolume();
    }
}

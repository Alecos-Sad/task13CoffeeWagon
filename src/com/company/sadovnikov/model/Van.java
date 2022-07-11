package com.company.sadovnikov.model;

import com.company.sadovnikov.type.CoffeeType;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Van {
    private final double capacity;
    private List<CoffeeType> range;
    private final String number;

    public Van(String number, double capacity) {
        this.capacity = capacity < 0 ? capacity = 0 : capacity;
        this.range = new ArrayList<>();
        this.number = number;
    }

    public double getCapacity() {
        return capacity;
    }

    public List<CoffeeType> getRange() {
        return range;
    }

    public void setCargo(List<CoffeeType> range) {
        this.range = range;
    }

    public String getNumber() {
        return number;
    }

    public void showCargoList() {
        List<CoffeeType> coffeeTypeList = getRange();
        System.out.println("Item : Price : Value");
        for (CoffeeType type : coffeeTypeList) {
            System.out.println(type + " : " + type.getPrice() + " : " + type.getVolume());
        }
    }

    public void sort() {
        System.out.println("Sorted by price-to-volume ratio");
        getRange().stream()
                .sorted(Comparator.comparing(CoffeeType::getPrice))
                .sorted(Comparator.comparing(CoffeeType::getVolume))
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}

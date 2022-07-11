package com.company.sadovnikov.model.prices;

public class LibericPrice implements Price{
    private double beans = 3200.5;
    private double ground = 4600.3;
    private double instantCans = 2400.5;
    private double instantBag = 3900.5;

    public LibericPrice() {
    }

    public double getBeans() {
        return beans;
    }

    public void setBeans(double beans) {
        this.beans = beans;
    }

    public double getGround() {
        return ground;
    }

    public void setGround(double ground) {
        this.ground = ground;
    }

    public double getInstantCans() {
        return instantCans;
    }

    public void setInstantCans(double instantCans) {
        this.instantCans = instantCans;
    }

    public double getInstantBag() {
        return instantBag;
    }

    public void setInstantBag(double instantBag) {
        this.instantBag = instantBag;
    }
}

package com.company.sadovnikov.model.prices;

public class ArabicPrice implements Price{

    private double beans = 2600.5;
    private double ground = 4500.0;
    private double instantCans = 3700.5;
    private double instantBag = 2100.5;

    public ArabicPrice() {
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

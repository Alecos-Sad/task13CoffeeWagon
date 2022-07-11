package com.company.sadovnikov.model.prices;

public class RobustPrice implements Price{
    private double beans = 1900.5;
    private double ground = 5880.3;
    private double instantCans = 2960.5;
    private double instantBag = 3770.5;

    public RobustPrice() {
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

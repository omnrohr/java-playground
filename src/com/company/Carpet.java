package com.company;

public class Carpet {
    private double coast;

    public Carpet(double coast){
        this.coast = coast >0 ? coast:0;
    }

    public double getCoast() {
        return coast;
    }

}

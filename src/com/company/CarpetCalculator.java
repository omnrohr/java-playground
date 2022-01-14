package com.company;

public class CarpetCalculator {
    private Floor floor;
    private Carpet carpet;

    public CarpetCalculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    public double calculateCost(){
        return (floor.getArea()*carpet.getCoast());
    }
}

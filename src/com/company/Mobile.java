package com.company;

public class Mobile {
    private String manufacturer;
    private int speed;
    private boolean haveCamera;

    public Mobile(String manufacturer,int speed, boolean haveCamera){
        this.manufacturer = manufacturer;
        this.speed = speed;
        this.haveCamera = haveCamera;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isHaveCamera() {
        return haveCamera;
    }
    public String details(){
        return "manufacturer: "+ manufacturer+".\n"+"Speed: "+ speed+".\n"+"Camera: " + (isHaveCamera()?"Yes":"No");
    }
}

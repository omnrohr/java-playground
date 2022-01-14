package com.company;

public class Smart extends Mobile{
    private int model;
    private String name;
    Camera cameraModel;

    public Smart(int model, String name, Camera cameraModel) {
        super("Samsung AX12", 2, true);
        this.model = model;
        this.name = name;
        this.cameraModel = cameraModel;
    }
    public Camera getCameraModel(){
        return cameraModel;
    }
    public int getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    @Override
    public String details() {
        return (super.details()+".\n"+"Model: "+ getModel() + ".\n"+"Name: "+ getName()+ ".\n"+"camera zoom: " + getCameraModel().getZoom()) ;
    }
}

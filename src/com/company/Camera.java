package com.company;

public class Camera {
    private String manufacturer;
    private int zoom;

    public Camera(String manufacturer, int zoom){
        this.manufacturer = manufacturer;
        this.zoom = zoom;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getZoom() {
        return zoom;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
    }
}

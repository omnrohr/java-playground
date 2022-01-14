package com.company;

public class Wall {
    private int width;
    private int height;

    public Wall(int width, int height){
        this.height=height>0?height:0;
        this.width=width>0 ? width:0;
    }
    public Wall(){
        this(0,0);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double getArea(){
        return (width>0&&height>0)?width*height:0;
    }
}

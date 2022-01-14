package com.company;

public class Floor {
    private int width;
    private int height;

    public Floor(int width, int height){
        this.width= width >0 ? width : 0 ;
        this.height = height > 0 ? height : 0;
    }
    public Floor(){
        this(0,0);
    }

    public int getWidth() {
        return width;
    }
    public int getArea(){
        return width * height;
    }


    public int getHeight() {
        return height;
    }

}

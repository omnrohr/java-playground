package com.company;

public class RecTangle {
    int x;
    int y;
    int width;
    int height;
    private static String name;
    public RecTangle(String name){
        RecTangle.name = name;
    }
    public void PrintRectangleName(){
        System.out.println("name= "+ name);
    }

    public RecTangle(){
        this(0,0);
    }
    public RecTangle(int width, int height){
        this(0,0,width,height);
    }
    public RecTangle(int x, int y, int width , int height){
        this.x = x;
        this.y =y;
        this.width = width;
        this.height = height;
    }

}

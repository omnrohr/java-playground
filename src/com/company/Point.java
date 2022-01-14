package com.company;

public class Point {
    private int x;
    private int y;

    public Point(int coordinate1, int coordinate2){
        x=coordinate1;
        y=coordinate2;
    }
    public Point(){
        this(0,0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        return distance(0,0);
    }
    public double distance(int xCoordinate, int yCoordinate){
        return  Math.sqrt( (getX() - xCoordinate) * ( getX() - xCoordinate)  + (getY() - yCoordinate) * (getY() - yCoordinate));
    }
}

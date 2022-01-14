package com.company;

public class Hamburger {
    private String name;
    private double price;

    private String addOn1Name;
    private double addOn1Price;

    private String addOn2Name;
    private double addOn2Price;

    private String addOn3Name;
    private double addOn3Price;

    private String addOn4Name;
    private double addOn4Price;


    public Hamburger(String breadRollType, String meat, double price) {
        this.name = "Basic Hamburger";
        this.price = price;
    }

    //-------------------------------------GETTERS-------------------------------------//
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getAddOn1Name() {
        return addOn1Name;
    }

    public double getAddOn1Price() {
        return addOn1Price;
    }

    public String getAddOn2Name() {
        return addOn2Name;
    }

    public double getAddOn2Price() {
        return addOn2Price;
    }

    public String getAddOn3Name() {
        return addOn3Name;
    }

    public double getAddOn3Price() {
        return addOn3Price;
    }

    public String getAddOn4Name() {
        return addOn4Name;
    }

    public double getAddOn4Price() {
        return addOn4Price;
    }

    //-------------------------------------SETTERS-------------------------------------//
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //-------------------------------------RELATED METHODS-------------------------------------//
    public void addOn1(String addOn1Name, double addOn1Price) {
        this.addOn1Name = addOn1Name;
        this.addOn1Price = addOn1Price;
    }

    public void addOn2(String addOn2Name, double addOn2Price) {
        this.addOn2Name = addOn2Name;
        this.addOn2Price = addOn2Price;
    }

    public void addOn3(String addOn3Name, double addOn3Price) {
        this.addOn3Name = addOn3Name;
        this.addOn3Price = addOn3Price;
    }

    public void addOn4(String addOn4Name, double addOn4Price) {
        this.addOn4Name = addOn4Name;
        this.addOn4Price = addOn4Price;
    }

    public void getBill() {
        System.out.println("\n-------------- Bill for " + name + " ---------------");
        System.out.println("Base price :                                $" + price);

        if(addOn1Name != null) {
            price += addOn1Price;
            System.out.println(addOn1Name + " Add-on :                            $" + addOn1Price);
        }
        if(addOn2Name != null) {
            price += addOn2Price;
            System.out.println(addOn2Name + " Add-on :                            $" + addOn2Price);
        }
        if(addOn3Name != null) {
            price += addOn3Price;
            System.out.println(addOn3Name + " Add-on :                            $" + addOn3Price);
        }
        if(addOn4Name != null) {
            price += addOn4Price;
            System.out.println(addOn4Name + " Add-on :                            $" + addOn4Price);
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("Total Price :                               $" + price);
        System.out.println("-------------------------------------------------------");
    }
}
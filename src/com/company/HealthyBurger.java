package com.company;

public class HealthyBurger extends Hamburger {

    private String healthyAddOn1Name;
    private double healthyAddOn1Price;

    private String healthyAddOn2Name;
    private double healthyAddOn2Price;

    public HealthyBurger(String meat, double price) {
        super("Brown Rye", meat, price);
    }

    public void healthyAddOn1(String healthyAddOn1Name,double healthyAddOn1Price) {
        this.healthyAddOn1Name = healthyAddOn1Name;
        this.healthyAddOn1Price = healthyAddOn1Price;
    }

    public void healthyAddOn2(String healthyAddOn2Name,double healthyAddOn2Price) {
        this.healthyAddOn2Name = healthyAddOn2Name;
        this.healthyAddOn2Price = healthyAddOn2Price;
    }

    @Override
    public void addOn1(String addOn1Name, double addOn1Price) {
        super.addOn1(addOn1Name, addOn1Price);
    }

    @Override
    public void addOn2(String addOn2Name, double addOn2Price) {
        super.addOn2(addOn2Name, addOn2Price);
    }

    @Override
    public void addOn3(String addOn3Name, double addOn3Price) {
        super.addOn3(addOn3Name, addOn3Price);
    }

    @Override
    public void addOn4(String addOn4Name, double addOn4Price) {
        super.addOn4(addOn4Name, addOn4Price);
    }

    @Override
    public void getBill() {
        System.out.println("\n-------------- Bill for " + getName() + " ---------------");
        System.out.println("Base price :                                $" + getPrice());

        if(getAddOn1Name() != null) {
            setPrice(getPrice() + getAddOn1Price());
            System.out.println(getAddOn1Name() + " Add-on :                            $" + getAddOn1Price());
        }
        if(getAddOn2Name() != null) {
            setPrice(getPrice() + getAddOn2Price());
            System.out.println(getAddOn2Name() + " Add-on :                            $" + getAddOn2Price());
        }
        if(getAddOn3Name() != null) {
            setPrice(getPrice() + getAddOn3Price());
            System.out.println(getAddOn3Name() + " Add-on :                            $" + getAddOn3Price());
        }
        if(getAddOn4Name() != null) {
            setPrice(getPrice() + getAddOn4Price());
            System.out.println(getAddOn4Name() + " Add-on :                                     $" + getAddOn4Price());
        }
        if(healthyAddOn1Name != null) {
            setPrice(getPrice() + healthyAddOn1Price);
            System.out.println(healthyAddOn1Name + " Add-on :                            $" + healthyAddOn1Price);
        }
        if(healthyAddOn2Name != null) {
            setPrice(getPrice() + healthyAddOn2Price);
            System.out.println(healthyAddOn2Name + " Add-on :                            $" + healthyAddOn2Price);
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("Total Price :                               $" + getPrice());
        System.out.println("-------------------------------------------------------");
    }
}
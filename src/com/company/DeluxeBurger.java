package com.company;

public class DeluxeBurger extends Hamburger {

    private final String deluxeAddOn1Name;
    private final double deluxeAddOn1Price;

    private final String deluxeAddOn2Name;
    private final double deluxeAddOn2Price;

    public DeluxeBurger(String breadRollType, String meat, double price) {
        super(breadRollType, meat, price);
        this.deluxeAddOn1Name = "Chips";
        this.deluxeAddOn1Price = 2.50;
        this.deluxeAddOn2Name = "Drinks";
        this.deluxeAddOn2Price = 4.00;
    }

    @Override
    public void getBill() {
        System.out.println("\n-------------- Bill for " + getName() + " ---------------");
        System.out.println("Base price :                                $" + getPrice());

        if(deluxeAddOn1Name != null) {
            setPrice(getPrice() + deluxeAddOn1Price);
            System.out.println(deluxeAddOn1Name + " Add-on :                            $" + deluxeAddOn1Price);
        }
        if(deluxeAddOn2Name != null) {
            setPrice(getPrice() + deluxeAddOn2Price);
            System.out.println(deluxeAddOn2Name + " Add-on :                            $" + deluxeAddOn2Price);
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("Total Price :                               $" + getPrice());
        System.out.println("-------------------------------------------------------");
    }
}
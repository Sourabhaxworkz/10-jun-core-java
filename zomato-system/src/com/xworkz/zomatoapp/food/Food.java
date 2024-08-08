package com.xworkz.zomatoapp.food;

public class Food {
    public String foods;
    public String foodName;
    public String hotelName;
    public double foodPrice;
    public String hotelDistance;

    public void foodsDetails() {
        System.out.println("Food Name is "+this.foodName);
        System.out.println("Hotel Name is "+this.hotelName);;
        System.out.println("Price of the food is "+this.foodPrice);
        System.out.println("Hotel Distance is "+this.hotelDistance);

    }
}

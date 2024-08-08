package com.xworkz.zomatoapp.zomato;

import com.xworkz.zomatoapp.food.Food;

public class Zomato {
    Food foods;
    public Zomato(Food food){
        System.out.println("Zomato Constructor is invoked");
        System.out.println("Number of parameter :1");
        System.out.println("Type of parameters : Food type");
        this.foods=foods;
    }
    public void openFood(){
        System.out.println("Food Details");
        if(foods!=null)
            this.foods.foodsDetails();
        else System.out.println("No food found");
        System.out.println("end of Food Details");
    }
}

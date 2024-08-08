package com.xworkz.zomatoapp;

import com.xworkz.zomatoapp.food.Food;
import com.xworkz.zomatoapp.zomato.Zomato;

import java.security.spec.RSAOtherPrimeInfo;

public class ZomatoRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Food food = new Food();
        food.foodName="Biriyani";
        food.hotelName="Appu Biriyani";
        food.foodPrice=300.00;
        food.hotelDistance="1.5 KM";

        Zomato zomato = new Zomato(food);
        food.foodsDetails();
        System.out.println("Main ended");

    }
}

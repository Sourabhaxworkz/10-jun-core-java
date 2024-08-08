package com.xworkz.supermarketapp;

import com.xworkz.supermarketapp.supermarket.SuperMarket;
import com.xworkz.supermarketapp.workers.Workers;

public class SuperMarketRunner {
    public static void main(String[] args) {
        Workers workers = new Workers();
        workers.workerName="Sourabha";
        workers.workerSalary=7500.36;
        workers.workerExperience="2 years";
        workers.workerAge=22;

        SuperMarket superMarket = new SuperMarket(workers);
        workers.workersDetails();
        System.out.println("Main ended");
    }
}

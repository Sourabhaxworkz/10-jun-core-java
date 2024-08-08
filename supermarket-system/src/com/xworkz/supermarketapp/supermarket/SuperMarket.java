package com.xworkz.supermarketapp.supermarket;

import com.xworkz.supermarketapp.workers.Workers;

public class SuperMarket {
    Workers workers;
    public SuperMarket(Workers workers){
        System.out.println("SuperMarket constructor is invoked");
        System.out.println("Number of parameters:1");
        System.out.println("type of parametes : worker type");
    }
    public void openWorkers(){
        System.out.println("worker details");
        if(workers!=null)
            this.workers.workersDetails();
        else System.out.println("workers details not found");
        System.out.println("end of workers details");
    }
}

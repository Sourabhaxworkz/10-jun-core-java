package com.xworkz.supermarketapp.workers;

public class Workers {
    public String workers;
    public String workerName;
    public double workerSalary;
    public String workerExperience;
    public int workerAge;

    public void workersDetails(){
        System.out.println("Worker Name is "+this.workerName);
        System.out.println("worker salary is "+this.workerSalary);
        System.out.println("worker experience is "+this.workerExperience);
        System.out.println("worker age is"+this.workerAge);
    }
}

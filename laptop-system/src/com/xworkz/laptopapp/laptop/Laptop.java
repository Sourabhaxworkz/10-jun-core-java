package com.xworkz.laptopapp.laptop;

import com.xworkz.laptopapp.motherboard.MotherBoard;

public class Laptop {
    MotherBoard motherBoard;
    public Laptop(MotherBoard motherBoard){
        System.out.println("MotherBoard constructor is invoked");
        System.out.println("Number od parameters:1");
        System.out.println("Type of parameters:MotherBoard type");
    }
    public void openMotherBoard(){
        System.out.println("MotherBoard details");
        if(motherBoard!=null)
            this.motherBoard.motherBoardDetails();
        else System.out.println("MotherBoard details not found");
        System.out.println("end of MotherBoard Details");
    }
}

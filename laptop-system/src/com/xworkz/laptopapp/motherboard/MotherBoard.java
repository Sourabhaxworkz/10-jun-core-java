package com.xworkz.laptopapp.motherboard;

public class MotherBoard {
    public String motherBoard;
    public String motherBoardName;
    public double motherBoardPrice;
    public String motherBoardInfo;
    public String motherBoardRating;

    public void motherBoardDetails(){
        System.out.println("MotherBoard Name is"+this.motherBoardName);
        System.out.println("MotherBoard Price is"+this.motherBoardPrice);
        System.out.println("MotherBoard Information is "+this.motherBoardInfo);
        System.out.println("MotherBoard Ratings "+this.motherBoardRating);
    }
}

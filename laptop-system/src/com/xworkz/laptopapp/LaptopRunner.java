package com.xworkz.laptopapp;

import com.xworkz.laptopapp.laptop.Laptop;
import com.xworkz.laptopapp.motherboard.MotherBoard;

public class LaptopRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        MotherBoard motherBoard = new MotherBoard();
        motherBoard.motherBoardName="Micro-ATX - Supports ";
        motherBoard.motherBoardPrice=6099.12;
        motherBoard.motherBoardInfo="12TH GEN CORE READY - The PRO H610M-E DDR4 is a compact micro-ATX motherboard outfitted with the latest Intel H610 chipset (LGA 1700, 12th Gen Core ready); The VRM features MSI Core Boost technology for improved stability & peformance";
        motherBoard.motherBoardRating="4.9star";

        Laptop laptop = new Laptop(motherBoard);
        motherBoard.motherBoardDetails();
        System.out.println("main ended");
    }
}

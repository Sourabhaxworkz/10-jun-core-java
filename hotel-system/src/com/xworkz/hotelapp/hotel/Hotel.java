package com.xworkz.hotelapp.hotel;

import com.xworkz.hotelapp.rooms.Rooms;

public class Hotel {
    Rooms rooms;

    public Hotel(Rooms rooms){
        System.out.println("Hotel Constructor is invoked");
        System.out.println("Number of Parameters:1");
        System.out.println("Type of parameters:Room type");
    }
    public void openRooms(){
        System.out.println("Room Details");
        if(rooms!=null)
            this.rooms.roomsDetails();
        else System.out.println("No Rooms details");
        System.out.println("end of room details");
    }
}

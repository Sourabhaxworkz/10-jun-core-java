package com.xworkz.hotelapp.rooms;

public class Rooms {
    public String rooms;
    public String hotelRooms;
    public double priceOfRooms;
    public boolean isRoomAvailable;

    public void roomsDetails() {
        System.out.println("Hotel Rooms numbers "+this.hotelRooms);
        System.out.println("Price of rooms "+this.priceOfRooms);
        System.out.println("is rooms available "+this.isRoomAvailable);
    }
}

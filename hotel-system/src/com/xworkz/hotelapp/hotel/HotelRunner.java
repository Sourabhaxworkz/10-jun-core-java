package com.xworkz.hotelapp.hotel;

import com.xworkz.hotelapp.rooms.Rooms;

public class HotelRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Rooms rooms = new Rooms();
        rooms.hotelRooms="3 Members in room";
        rooms.priceOfRooms=4594.21;
        rooms.isRoomAvailable=true;

        Hotel hotel = new Hotel(rooms);
        rooms.roomsDetails();
        System.out.println("main ended");
    }
}

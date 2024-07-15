class Flights{
	public static double getFlightPriceByDestinationName(String flightsdestination){
		double flightPrice = 0.0;
		if(flightsdestination == "Kempegowda International Airport") return flightPrice = 4599.35;
		if(flightsdestination == "Visakhapatnam International Airport") return flightPrice = 4688.36;
		if(flightsdestination == "Daporijo Airport") return flightPrice = 4398.24;
		if(flightsdestination == "Lokpriya Gopinath Bordoloi International Airport") return flightPrice = 4587.26;
		if(flightsdestination == "Jay Prakash Narayan Airport") return flightPrice = 5694.24;
		if(flightsdestination == "Swami Vivekananda Airport") return flightPrice = 4569.25;
		if(flightsdestination == "Manohar International Airport") return flightPrice = 5698.36;
		if(flightsdestination == "Sardar Vallabhbhai Patel International Airport") return flightPrice = 4569.56;
		if(flightsdestination == "Hisar Airport") return flightPrice = 4569.25;
		if(flightsdestination == "Kangra Airport") return flightPrice = 4687.24;
		if(flightsdestination == "Deoghar Airport") return flightPrice = 4569.36;
		if(flightsdestination == "Mysore Airport") return flightPrice = 4698.35;
		if(flightsdestination == "Mangalore International Airport") return flightPrice = 3658.35;
		if(flightsdestination == "Cochin International Airport") return flightPrice = 4569.35;
		if(flightsdestination == "Thiruvananthapuram International Airport") return flightPrice = 4236.24;
		if(flightsdestination == "Raja Bhoj Airport") return flightPrice = 4563.24;
		if(flightsdestination == "Jabalpur Airport") return flightPrice = 4236.35;
		if(flightsdestination == "Chhatrapati Shivaji Maharaj International Airport") return flightPrice = 4215.36;
		if(flightsdestination == "Nashik International Airport") return flightPrice = 4569.36;
		if(flightsdestination == "Biju Patnaik International Airport") return flightPrice = 4569.23;
		else{
			System.out.println(flightsdestination + "not found");
		}
		return flightPrice;
	}
	public static double getFlightPriceByDestinationName(String flightsdestination , int noOfSeats){
		double flightPrice = 0.0;
		if(flightsdestination == "Kempegowda International Airport") return flightPrice = 4599.35*noOfSeats;
		if(flightsdestination == "Visakhapatnam International Airport") return flightPrice = 4688.36*noOfSeats;
		if(flightsdestination == "Daporijo Airport") return flightPrice = 4398.24*noOfSeats;
		if(flightsdestination == "Lokpriya Gopinath Bordoloi International Airport") return flightPrice = 4587.26*noOfSeats;
		if(flightsdestination == "Jay Prakash Narayan Airport") return flightPrice = 5694.24*noOfSeats;
		if(flightsdestination == "Swami Vivekananda Airport") return flightPrice = 4569.25*noOfSeats;
		if(flightsdestination == "Manohar International Airport") return flightPrice = 5698.36*noOfSeats;
		if(flightsdestination == "Sardar Vallabhbhai Patel International Airport") return flightPrice = 4569.56*noOfSeats;
		if(flightsdestination == "Hisar Airport") return flightPrice = 4569.25*noOfSeats;
		if(flightsdestination == "Kangra Airport") return flightPrice = 4687.24*noOfSeats;
		if(flightsdestination == "Deoghar Airport") return flightPrice = 4569.36*noOfSeats;
		if(flightsdestination == "Mysore Airport") return flightPrice = 4698.35*noOfSeats;
		if(flightsdestination == "Mangalore International Airport") return flightPrice = 3658.35*noOfSeats;
		if(flightsdestination == "Cochin International Airport") return flightPrice = 4569.35*noOfSeats;
		if(flightsdestination == "Thiruvananthapuram International Airport") return flightPrice = 4236.24*noOfSeats;
		if(flightsdestination == "Raja Bhoj Airport") return flightPrice = 4563.24*noOfSeats;
		if(flightsdestination == "Jabalpur Airport") return flightPrice = 4236.35*noOfSeats;
		if(flightsdestination == "Chhatrapati Shivaji Maharaj International Airport") return flightPrice = 4215.36*noOfSeats;
		if(flightsdestination == "Nashik International Airport") return flightPrice = 4569.36*noOfSeats;
		if(flightsdestination == "Biju Patnaik International Airport") return flightPrice = 4569.23*noOfSeats;
		else{
			System.out.println(flightsdestination + "not found");
		}
		return flightPrice;
	}
}
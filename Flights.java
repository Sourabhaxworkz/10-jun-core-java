class Flights{
	public static double getFlightPriceByDestinationName(String flightsdestination){
		double flightPrice = 0.0;
		if(flightsdestination == "Kempegowda International Airport"){
			flightPrice = 4599.35;
			return flightPrice;
		}
		if(flightsdestination == "Visakhapatnam International Airport"){
			flightPrice = 4688.36;
			return flightPrice;
		}
		if(flightsdestination == "Daporijo Airport"){
			flightPrice = 4398.24;
			return flightPrice;
		}
		if(flightsdestination == "Lokpriya Gopinath Bordoloi International Airport"){
			flightPrice = 4587.26;
			return flightPrice;
		}
		if(flightsdestination == "Jay Prakash Narayan Airport"){
			flightPrice = 5694.24;
			return flightPrice;
		}
		if(flightsdestination == "Swami Vivekananda Airport"){
			flightPrice = 4569.25;
			return flightPrice;
		}
		if(flightsdestination == "Manohar International Airport"){
			flightPrice = 5698.36;
			return flightPrice;
		}
		if(flightsdestination == "Sardar Vallabhbhai Patel International Airport"){
			flightPrice = 4569.56;
			return flightPrice;
		}
		if(flightsdestination == "Hisar Airport"){
			flightPrice = 4569.25;
			return flightPrice;
		}
		if(flightsdestination == "Kangra Airport"){
			flightPrice = 4687.24;
			return flightPrice;
		}
		if(flightsdestination == "Deoghar Airport"){
			flightPrice = 4569.36;
			return flightPrice;
		}
		if(flightsdestination == "Mysore Airport"){
			flightPrice = 4698.35;
			return flightPrice;
		}
		if(flightsdestination == "Mangalore International Airport"){
			flightPrice = 3658.35;
			return flightPrice;
		}
		if(flightsdestination == "Cochin International Airport"){
			flightPrice = 4569.35;
			return flightPrice;
		}
		if(flightsdestination == "Thiruvananthapuram International Airport"){
			flightPrice = 4236.24;
			return flightPrice;
		}
		if(flightsdestination == "Raja Bhoj Airport"){
			flightPrice = 4563.24;
			return flightPrice;
		}
		if(flightsdestination == "Jabalpur Airport"){
			flightPrice = 4236.35;
			return flightPrice;
		}
		if(flightsdestination == "Chhatrapati Shivaji Maharaj International Airport"){
			flightPrice = 4215.36;
			return flightPrice;
		}
		if(flightsdestination == "Nashik International Airport"){
			flightPrice = 4569.36;
			return flightPrice;
		}
		if(flightsdestination == "Biju Patnaik International Airport"){
			flightPrice = 4569.23;
			return flightPrice;
		}
		else{
			System.out.println(flightsdestination + "not found");
		}
		return flightPrice;
	}
}
class FlightsRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
			String destinationName = "Kempegowda International Airport";
			int noOfSeats = 3;
			double priceOfFlights = Flights.getFlightPriceByDestinationName(destinationName);
			System.out.println("Destination name is " + destinationName);
			System.out.println("Number of seats " + noOfSeats);
			System.out.println("Total price is " + noOfSeats*priceOfFlights);
		System.out.println("Main Ended");
	}
}
class FlightsRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
			String destinationName = "Jay Prakash Narayan Airport";
			double price = Flights.getFlightPriceByDestinationName(destinationName);
			System.out.println("The Destination & Price of the flight " +destinationName+   +price);
		System.out.println("Main Ended");
	}
	
}
class BikePurchase{
	static double bikeNamePrice=90000.32;
	static double rgstPrice=4500;
	static double insurancePrice=5236;
	static double servicePrice=3500;
	public static double bike(String bikeName,boolean by)/*, String Pulser , String Honda City, String Dio)*/{
		System.out.println("Bike Purchase Method Started");
		if(bikeName == "KTM"){
			if(by == true){
				return bikeNamePrice + rgstPrice+;
			}else{
				return bikeNamePrice;
			}
		}
		System.out.println("Bike Purchase Method Ended");
		return bikeNamePrice + rgstPrice + insurancePrice + servicePrice;
		/*double bikePrice = 0.0;
		if(KTM == rgstPrice){
			if()
		}
		if(bikeName == "KTM"){
			bikePrice = 90000.00;
			
			return bikePrice;
		}
		if(bikeName == "Pulser"){
			bikePrice = 150000.00;
			return bikePrice;
		}
		if(bikeName == "Honda City"){
			bikePrice = 89000.00;
			return bikePrice;
		}
		if(bikeName == "Dio"){
			bikePrice = 79236.02;
			return bikePrice;
		}
		if(bikeName == "TVS Pepi"){
			bikePrice = 78931.02;
			return bikePrice;
		}
		else{
			System.out.println(bikeName + "not found");
		}
		return bikePrice;
	}*/
}
}
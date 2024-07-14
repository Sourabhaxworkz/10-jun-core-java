class SangeethaMobiles{
	public static double findTheNewBrandPhone(String newPhone){
		double phonePrice = 0.0;
		if(newPhone == "SAMSUNG"){
			phonePrice = 39499.32;
			return phonePrice;
		}
		if(newPhone == "Apple"){
			phonePrice = 89456.21;
			return phonePrice;
		}
		if(newPhone == "VIVO"){
			phonePrice = 35499.12;
			return phonePrice;
		}
		if(newPhone == "realme"){
			phonePrice = 25499.12;
			return phonePrice;
		}
		if(newPhone == "Xiaomi"){
			phonePrice = 24599.24;
			return phonePrice;
		}
		if(newPhone == "Nokia"){
			phonePrice = 35489.26;
			return phonePrice;
		}
		if(newPhone == "OPPO"){
			phonePrice = 36988.24;
			return phonePrice;
		}
		if(newPhone == "OnePluse"){
			phonePrice = 45699.35;
			return phonePrice;
		}
		if(newPhone == "MotoRola"){
			phonePrice = 56899.12;
			return phonePrice;
		}
		if(newPhone == "Infinix"){
			phonePrice = 36988.12;
			return phonePrice;
		}
		if(newPhone == "LG"){
			phonePrice = 15966.25;
			return phonePrice;
		}
		if(newPhone == "Sony"){
			phonePrice = 65899.36;
			return phonePrice;
		}
		if(newPhone == "Vodafone"){
			phonePrice = 15988.36;
			return phonePrice;
		}
		if(newPhone == "Lava"){
			phonePrice = 16988.36;
			return phonePrice;
		}
		if(newPhone == "Google"){
			phonePrice = 25988.24;
			return phonePrice;
		}
		else{
			System.out.println(newPhone + "not found");
		}
		return phonePrice;
	}
}
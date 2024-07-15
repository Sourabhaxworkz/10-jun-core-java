class SangeethaMobiles{
	public static double findTheNewBrandPhone(String newPhone){
		double phonePrice = 0.0;
		if(newPhone == "SAMSUNG") return phonePrice = 39499.32;
		if(newPhone == "Apple") return phonePrice = 89456.21;
		if(newPhone == "VIVO") return phonePrice = 35499.12;
		if(newPhone == "realme") return phonePrice = 25499.12;
		if(newPhone == "Xiaomi") return phonePrice = 24599.24;
		if(newPhone == "Nokia") return phonePrice = 35489.26;
		if(newPhone == "OPPO") return phonePrice = 36988.24;
		if(newPhone == "OnePluse") return phonePrice = 45699.35;
		if(newPhone == "MotoRola") return phonePrice = 56899.12;
		if(newPhone == "Infinix") return phonePrice = 36988.12;
		if(newPhone == "LG") return phonePrice = 15966.25;
		if(newPhone == "Sony") return phonePrice = 65899.36;
		if(newPhone == "Vodafone") return phonePrice = 15988.36;
		if(newPhone == "Lava") return phonePrice = 16988.36;
		if(newPhone == "Google") return phonePrice = 25988.24;
		else{
			System.out.println(newPhone + "not found");
		}
		return phonePrice;
	}
	public static double findTheNewBrandPhone(String newPhone , int qnytOfPhone){
		double phonePrice = 0.0;
		if(newPhone == "SAMSUNG") return phonePrice = 39499.32*qnytOfPhone;
		if(newPhone == "Apple") return phonePrice = 89456.21*qnytOfPhone;
		if(newPhone == "VIVO") return phonePrice = 35499.12*qnytOfPhone;
		if(newPhone == "realme") return phonePrice = 25499.12*qnytOfPhone;
		if(newPhone == "Xiaomi") return phonePrice = 24599.24*qnytOfPhone;
		if(newPhone == "Nokia") return phonePrice = 35489.26*qnytOfPhone;
		if(newPhone == "OPPO") return phonePrice = 36988.24*qnytOfPhone;
		if(newPhone == "OnePluse") return phonePrice = 45699.35*qnytOfPhone;
		if(newPhone == "MotoRola") return phonePrice = 56899.12*qnytOfPhone;
		if(newPhone == "Infinix") return phonePrice = 36988.12*qnytOfPhone;
		if(newPhone == "LG") return phonePrice = 15966.25*qnytOfPhone;
		if(newPhone == "Sony") return phonePrice = 65899.36*qnytOfPhone;
		if(newPhone == "Vodafone") return phonePrice = 15988.36*qnytOfPhone;
		if(newPhone == "Lava") return phonePrice = 16988.36*qnytOfPhone;
		if(newPhone == "Google") return phonePrice = 25988.24*qnytOfPhone;
		else{
			System.out.println(newPhone + "not found");
		}
		return phonePrice;
	}
}
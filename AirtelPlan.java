class AirtelPlan{
	public static double findInternetPack(String internetPack){
		double internetPrice = 0.0;
		if(internetPack == "Ultra Max 9GB"){
			internetPrice = 1149.32;
			return internetPrice;
		}
		if(internetPack == "Ultra Max 15Gb"){
			internetPrice = 1249.21;
			return internetPrice;
		}
		if(internetPack == "Ultra Turbo 15GB"){
			internetPrice = 1349.12;
			return internetPrice;
		}
		if(internetPack == "Ultra Turbo 30GB"){
			internetPrice = 1649.25;
			return internetPrice;
		}
		if(internetPack == "Ultra Rapid 15GB"){
			internetPrice = 1449.24;
			return internetPrice;
		}
		if(internetPack == "Ultra Rapid 30GB"){
			internetPrice = 1849.30;
			return internetPrice;
		}
		if(internetPack == "Turbo 10GB"){
			internetPrice = 1099.21;
			return internetPrice;
		}
		if(internetPack == "Turbo 30GB"){
			internetPrice = 1399.32;
			return internetPrice;
		}
		if(internetPack == "Turbo 75GB"){
			internetPrice = 1699.21;
			return internetPrice;
		}
		if(internetPack == "Turbo 150GB"){
			internetPrice = 2099.21;
			return internetPrice;
		}
		if(internetPack == "VIP 1Gbps"){
			internetPrice = 3999.21;
			return internetPrice;
		}
		if(internetPack == "Premium 300Mbps"){
			internetPrice = 1499.12;
			return internetPrice;
		}
		if(internetPack == "Entertainment 200Mbps"){
			internetPrice = 999.32;
			return internetPrice;
		}
		if(internetPack == "Basic 100Mbps"){
			internetPrice = 799.21;
			return internetPrice;
		}
		else{
			System.out.println(internetPack + " not found");
		}
		return internetPrice;
	}
}
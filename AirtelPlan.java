class AirtelPlan{
	public static double findInternetPack(String internetPack){
		double internetPrice = 0.0;
		if(internetPack == "Ultra Max 9GB") return internetPrice = 1149.32;
		if(internetPack == "Ultra Max 15Gb") return internetPrice = 1249.21;
		if(internetPack == "Ultra Turbo 15GB") return internetPrice = 1349.12;
		if(internetPack == "Ultra Turbo 30GB") return internetPrice = 1649.25;
		if(internetPack == "Ultra Rapid 15GB") return internetPrice = 1449.24;
		if(internetPack == "Ultra Rapid 30GB") return internetPrice = 1849.30;
		if(internetPack == "Turbo 10GB") return internetPrice = 1099.21;
		if(internetPack == "Turbo 30GB") return internetPrice = 1399.32;
		if(internetPack == "Turbo 75GB") return internetPrice = 1699.21;
		if(internetPack == "Turbo 150GB") return internetPrice = 2099.21;
		if(internetPack == "VIP 1Gbps") return internetPrice = 3999.21;
		if(internetPack == "Premium 300Mbps") return internetPrice = 1499.12;
		if(internetPack == "Entertainment 200Mbps") return internetPrice = 999.32;
		if(internetPack == "Basic 100Mbps") return internetPrice = 799.21;
		else{
			System.out.println(internetPack + " not found");
		}
		return internetPrice;
	}
	public static double findInternetPack(String internetPack , int noOfPack){
		double internetPrice = 0.0;
		if(internetPack == "Ultra Max 9GB") return internetPrice = 1149.32*noOfPack;
		if(internetPack == "Ultra Max 15Gb") return internetPrice = 1249.21*noOfPack;
		if(internetPack == "Ultra Turbo 15GB") return internetPrice = 1349.12*noOfPack;
		if(internetPack == "Ultra Turbo 30GB") return internetPrice = 1649.25*noOfPack;
		if(internetPack == "Ultra Rapid 15GB") return internetPrice = 1449.24*noOfPack;
		if(internetPack == "Ultra Rapid 30GB") return internetPrice = 1849.30*noOfPack;
		if(internetPack == "Turbo 10GB") return internetPrice = 1099.21*noOfPack;
		if(internetPack == "Turbo 30GB") return internetPrice = 1399.32*noOfPack;
		if(internetPack == "Turbo 75GB") return internetPrice = 1699.21*noOfPack;
		if(internetPack == "Turbo 150GB") return internetPrice = 2099.21*noOfPack;
		if(internetPack == "VIP 1Gbps") return internetPrice = 3999.21*noOfPack;
		if(internetPack == "Premium 300Mbps") return internetPrice = 1499.12*noOfPack;
		if(internetPack == "Entertainment 200Mbps") return internetPrice = 999.32*noOfPack;
		if(internetPack == "Basic 100Mbps") return internetPrice = 799.21*noOfPack;
		else{
			System.out.println(internetPack + " not found");
		}
		return internetPrice;
	}
}
class AirtelPlanRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
			String packname = "Premium 300Mbps";
			double price = AirtelPlan.findInternetPack(packname);
			System.out.println("The Price of the Internet Pack is " +packname + price);
		System.out.println("Main Ended");
	}
}
class AirtelPlanRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
			String internetPackName = "Ultra Max 9GB";
			int noPackPurchase = 3;
			double priceOfPack = AirtelPlan.findInternetPack(internetPackName);
			System.out.println("Pack name is " + internetPackName);
			System.out.println("Number of Pack Purchase " + noPackPurchase);
			System.out.println("Total price is " + noPackPurchase*priceOfPack);
		System.out.println("Main Ended");
	}
}
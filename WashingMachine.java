class WashingMachine{
	static boolean isConnected = false;
	public static void turnOn(){
		System.out.println("Start of turnOn");
			if(isConnected == false){
				isConnected = true;
			System.out.println("Washing Machine is Trun On..");
			}
		System.out.println("Ended of turnOn");
	return;
	}
	public static void turnOff(){
		System.out.println("Start of turnOff");
			if(isConnected == true){
				isConnected = false;
			System.out.println("Washing Machine is Turn Off..");
			}
		System.out.println("End of turnOff");
	return;
	}
}
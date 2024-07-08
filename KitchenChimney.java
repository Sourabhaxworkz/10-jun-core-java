class KitchenChimney{
	static boolean isConnected = false;
	public static void turnOn(){
		System.out.println("Start of turnOn");
			if(isConnected == false){
				isConnected = true;
			System.out.println("Kitchen Chimney is Turn On...");
			}
		System.out.println("End of turnOn");
	return;
	}
	public static void turnOff(){
		System.out.println("Start of turnOff");
			if(isConnected == true){
				isConnected = false;
			System.out.println("Kitchen Chimney is Turn Off..");
				}
		System.out.println("End of TurnOff");
	return;
	}
}
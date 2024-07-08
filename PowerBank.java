class PowerBank{
	static boolean isConnected = false;
	public static void turnOn(){
		System.out.println("Start turnOn");
			if(isConnected == false){
				isConnected = true;
			System.out.println("Power Bank is Turn On..");
			}
		System.out.println("End turnOn");
	return;
	}
	public static void turnOff(){
		System.out.println("Start turnOff");
			if(isConnected == true){
				isConnected = false;
			System.out.println("Power Bank is Turn Off..");
			}
		System.out.println("End turnOff");
	return;
	}
}
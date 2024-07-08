class MicrowaveOven{
	static boolean isConnected = false;
	
	public static void turnOn(){
		System.out.println("Start of turnOn");
			if(isConnected == false){
				isConnected = true;
				System.out.println("Microwave Oven is Turned Onn...");
			}
		System.out.println("End of turnOn");
	return;
	}
	public static void turnOff(){
	    System.out.println("Start of turnOff");
			if(isConnected == true){
				isConnected = false;
				System.out.println("Microwave Oven is Turned off...");
		}
		System.out.println("End of turnOff");
	return;
	}
}
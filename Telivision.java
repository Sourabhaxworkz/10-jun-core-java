class Telivision{
	static boolean isConnected = false;
		public static void turnOn(){
			System.out.println("Started turnOn");
				if(isConnected == false){
					isConnected = true;
				System.out.println("Telivision is Turn On..");
				}
			System.out.println("Ended turnOn");
		return;
		}
		public static void turnOff(){
			System.out.println("Started turnOff");
				if(isConnected == true){
					isConnected = false;
				System.out.println("Telivision is turnOff..");
				}
			System.out.println("Ended turnOff");
		return;
		}
}
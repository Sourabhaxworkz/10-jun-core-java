class Fan{
	static boolean isConnected = false;
		public static void turnOn(){
			System.out.println("Start turnOn");
				if(isConnected == false){
					isConnected = true;
				System.out.println("Fan is Turn On..");
				}
			System.out.println("end turnon");
		return;
		}
		public static void turnOff(){
			System.out.println("Start turnOff");
				if(isConnected == true){
					isConnected = false;
				System.out.println("Fan is Turn Off..");
				}
			System.out.println("End turnOff");
		return;
		}
}
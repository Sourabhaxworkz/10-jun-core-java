class Refrigerator{
	static boolean isConnected = false;
	public static boolean onOrOff(){
		System.out.println("Start of onOrOff");
		if(isConnected == false){
			isConnected = true;
		}
		else if(isConnected == true){
			isConnected = false;
		}
		System.out.println("End of onOrOff");
		return isConnected;
	}
}
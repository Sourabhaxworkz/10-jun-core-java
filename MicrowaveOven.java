class MicrowaveOven{
	static boolean isOn = false;
	static int maxTemp = 10;
	static int minTemp = 0;
	static int currentTemp;
		public static boolean onOrOff(){
			System.out.println("Start of onOrOff Method");
				if(isOn == false){
					isOn = true;
				}
				else{
				isOn = false;
				}
			System.out.println("End of onOrOff Method");
		return isOn;
		}
		public static void increaseTemp(){
			System.out.println("Start of Increase Temperature Method");
				if(isOn == true){
					if(currentTemp < maxTemp){
						currentTemp = currentTemp  + 1;
						System.out.println("Current Temperature is:" + currentTemp);
					}
					else System.out.println("Maximum Volume reached");
				}else System.out.println("Turn on the Microwave Oven");
			System.out.println("End of Increase Temperature Method");
		return;
		}
		public static void decreaseTemp(){
			System.out.println("Start of Decrease Temperature Method");
				if(isOn == true){
					if(currentTemp > minTemp){
						currentTemp = currentTemp - 1;
						System.out.println("Current Temperature is:" + currentTemp);
					}
					else System.out.println("Minimum Temperature reached");
				}else System.out.println("Turn on the Microwave Oven");
			System.out.println("End of Decrease Temperature Method");
		return;
			}
}
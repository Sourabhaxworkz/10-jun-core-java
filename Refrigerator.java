class Refrigerator{
	static boolean isOn = false;
	static int maxCoolingTemp = 10;
	static int minCoolingTemp = 0;
	static int currentCoolingTemp;
	public static boolean onOrOff(){
		System.out.println("Start of onOrOff Method");
			if(!isOn) isOn = true;
			else isOn = false;
		System.out.println("End of onOrOff Method");
		return isOn;
	}
	public static void increaseCoolingTemp(){
		System.out.println("Start of Increase Cooling Temperature Method");
			if(isOn == true){
				if(currentCoolingTemp < maxCoolingTemp){
					currentCoolingTemp = currentCoolingTemp + 1;
					System.out.println("Current Cooling Temperature is:" + currentCoolingTemp);
				}
				else System.out.println("Maximum Cooling Temperature reached");
				}else System.out.println("Turn on the Refrigerator");
		System.out.println("End of Increase Cooling Temperature");
	return;
	}
	public static void decreaseCoollingTemp(){
		System.out.println("Start of Decrease Cooling Temperature Method");
			if(isOn == true){
				if(currentCoolingTemp > minCoolingTemp){
					currentCoolingTemp = currentCoolingTemp - 1;
					System.out.println("Current Cooling Temperature is:" +currentCoolingTemp);
				}
				else System.out.println("Minimuum Cooling Temperature reached");
				}else System.out.println("Turn on the Refrigerator");
		System.out.println("End of Decrease Cooling Temperature");
	return;
	}
}
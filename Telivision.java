class Telivision{
	static boolean isOn = false;
	static int maxVolume = 15;
	static int minVolume = 0;
	static int currentVolume;
	public static boolean onOrOff(){
		System.out.println("Start onOrOff Method");
			if(isOn == false){
				isOn = true;
			}
			else{
				isOn = false;
			}
		System.out.println("End onOrOff Method");
	return isOn;
	}
	public static void increaseVolume(){
		System.out.println("Start of Increase Volume Method");
			if(isOn = true){
				if(currentVolume < maxVolume){
					currentVolume = currentVolume + 1;
					System.out.println("Current Volume is:" + currentVolume);
				}
				else System.out.println("Maximum Volume reached");
			}else System.out.println("Turn on the Telivision");
		System.out.println("End of Increase Volume Method");
	return;
	}
	public static void decreaseVolume(){
		System.out.println("Start of Decrease Volume Method");
			if(isOn = true){
				if(currentVolume > minVolume){
					currentVolume = currentVolume - 1;
					System.out.println("Current Volume is:" + currentVolume);
				}
				else System.out.println("Minimum Volume reached");
			}else System.out.println("Turn on the Telivision");
		System.out.println("End of Decrease Volume Method");
	return;
	}
}
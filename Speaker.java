class Speaker{
	static boolean isConnected = false;
	static int maxVolume = 7;
	static int minVolume = 0;
	static int currentVolume;
	public static boolean onOrOff(){
		System.out.println("Start of onOrOff Method");
			/*if(!isConnected) isConnected = true;
			else isConnected = false;*/
			if(isConnected == false){
				isConnected = true;
			}
			else {
				isConnected = false;
			}
		System.out.println("End of onOrOff Method");
	return isConnected;
	}
	public static void increaseVolume(){
		System.out.println("Start of Increase Volume Method");
			if(isConnected == true){
				if(currentVolume < maxVolume){
					currentVolume = currentVolume + 1;
					System.out.println("Current Volume is:" + currentVolume);
				}
				else System.out.println("Maximum Volume reached");
			}else System.out.println("Turn on the speaker");
		System.out.println("End of Increase Volume Method");
	return;
			}
	public static void decreaseVolume(){
		System.out.println("Start of Decrease Volume Method");
			if(isConnected == true){
				if(currentVolume > minVolume){
					currentVolume = currentVolume - 1;
					System.out.println("Current Volume is:" + currentVolume);
				}
				else System.out.println("Minimum Volume reached");
			}else System.out.println("Turn on the Speaker");
		System.out.println("End of Decrease Volume Method");
	return;
	}
	}

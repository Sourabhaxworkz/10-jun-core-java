class Grinder{
	static boolean isOn = false;
	static int maxSpeed = 5;
	static int minSpeed = 0;
	static int currentSpeed;
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
	public static void increaseSpeed(){
		System.out.println("Start Increase Speed Method");
			if(isOn == true){
				if(currentSpeed < maxSpeed){
					currentSpeed = currentSpeed + 1;
					System.out.println("Current Speed is:" + currentSpeed);
				}
				else System.out.println("Maximum Speed reached");
			}else System.out.println("Turn on the Grinder");
		System.out.println("End Increase Speed Method");
	return;
	}
	public static void decreaseSpeed(){
		System.out.println("Start Decrease Speed Method");
			if(isOn == true){
				if(currentSpeed > minSpeed){
					currentSpeed = currentSpeed - 1;
					System.out.println("Current Speed is:" + currentSpeed);
				}
				else System.out.println("Minimum Speed reached");
			}else System.out.println("End Decrease Speed Method");
	}
}
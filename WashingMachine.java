class WashingMachine{
	static boolean isOn = false;
	static int maxSpinSpeed = 10;
	static int minSpinSpeed = 0;
	static int currentSpinSpeed;
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
	public static void increaseSpinSpeed(){
		System.out.println("Start of Increase Spin Speed Method");
			if(isOn == true){
				if(currentSpinSpeed < maxSpinSpeed){
					currentSpinSpeed = currentSpinSpeed + 1;
					System.out.println("Current Spin Speed is:" + currentSpinSpeed);
				}
				else System.out.println("Maximum Spin Speed reached");
			}else System.out.println("Turn on the WashingMachine");
		System.out.println("End of Increase Spin Speed Method");
	return;
	}
	public static void decreaseSpinSpeed(){
		System.out.println("Start of Decrease Spin Speed Method");
			if(isOn == true){
				if(currentSpinSpeed > minSpinSpeed){
					currentSpinSpeed = currentSpinSpeed - 1;
					System.out.println("Current Spin Speed is:" + currentSpinSpeed);
				}
				else System.out.println("Minimum Spin Speed reached");
			}else System.out.println("Turn on the WashingMachine");
		System.out.println("End of Decrease Spin Speed Method");
	return;
	}
}
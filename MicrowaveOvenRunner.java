class MicrowaveOvenRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
		boolean on = MicrowaveOven.onOrOff();
		System.out.println("The microwave oven is oned:" +on);
			MicrowaveOven.increaseTemp();
			MicrowaveOven.increaseTemp();
			MicrowaveOven.increaseTemp();
			MicrowaveOven.increaseTemp();
			MicrowaveOven.increaseTemp();
			MicrowaveOven.increaseTemp();
			MicrowaveOven.increaseTemp();
			MicrowaveOven.increaseTemp();
			MicrowaveOven.increaseTemp();
			MicrowaveOven.increaseTemp();
			MicrowaveOven.increaseTemp();
			
			
			MicrowaveOven.decreaseTemp();
			MicrowaveOven.decreaseTemp();
			MicrowaveOven.decreaseTemp();
			MicrowaveOven.decreaseTemp();
			MicrowaveOven.decreaseTemp();
			MicrowaveOven.decreaseTemp();
			MicrowaveOven.decreaseTemp();
			MicrowaveOven.decreaseTemp();
			MicrowaveOven.decreaseTemp();
			MicrowaveOven.decreaseTemp();
			MicrowaveOven.decreaseTemp();
		on = MicrowaveOven.onOrOff();
		System.out.println("The Microwave Oven is oned:" +on);
		System.out.println("Main Ended");
	}
}
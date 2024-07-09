class MicrowaveOvenRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
		boolean connect = MicrowaveOven.onOrOff();
		System.out.println("is Microwave Oven connected:" + connect);
		connect = MicrowaveOven.onOrOff();
		System.out.println("is Microwave Oven connected:" + connect);
		System.out.println("Main Ended");
	}

}
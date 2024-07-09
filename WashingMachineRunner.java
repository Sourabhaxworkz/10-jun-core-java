class WashingMachineRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
		boolean connect = WashingMachine.onOrOff();
		System.out.println("is Washing Machine connected:" + connect);
		connect = WashingMachine.onOrOff();
		System.out.println("is Washing Machine connected:" + connect);
		System.out.println("Main Ended");
	}
}
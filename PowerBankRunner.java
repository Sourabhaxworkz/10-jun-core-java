class PowerBankRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
		boolean connect = PowerBank.onOrOff();
		System.out.println("is Power Bank connected:" + connect);
		connect = PowerBank.onOrOff();
		System.out.println("is Power Bank connected:" + connect);
		System.out.println("Main Ended");
	}
}
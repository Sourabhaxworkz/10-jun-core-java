class IronBoxRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
		boolean connect = IronBox.onOrOff();
		System.out.println("is Iron Box connected:" + connect);
		connect = IronBox.onOrOff();
		System.out.println("is Iron Box connected:" + connect);
		System.out.println("Main Ended");
	}
}
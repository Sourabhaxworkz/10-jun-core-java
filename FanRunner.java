class FanRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
		boolean connect = Fan.onOrOff();
		System.out.println("is Fan connected:" + connect);
		connect = Fan.onOrOff();
		System.out.println("is Fan connected:" + connect);
		System.out.println("Main Ended");
	}
}
class GrinderRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
		boolean connect = Grinder.onOrOff();
		System.out.println("is Grinder connected:" + connect);
		connect = Grinder.onOrOff();
		System.out.println("is Grinder connected:" + connect);
		System.out.println("Main Ended");
	}
}
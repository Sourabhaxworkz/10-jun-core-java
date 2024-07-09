class TelivisionRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
		boolean connect = Telivision.onOrOff();
		System.out.println("is Telivision connected:" + connect);
		connect = Telivision.onOrOff();
		System.out.println("is Telivision connected:" + connect);
		System.out.println("Main Ended");
	}
}
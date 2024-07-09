class RefrigeratorRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
		boolean connect = Refrigerator.onOrOff();
		System.out.println("is Refrigerator connected:" + connect);
		connect = Refrigerator.onOrOff();
		System.out.println("is Refrigerator connected:" + connect);
		System.out.println("Main Ended");
	}
}
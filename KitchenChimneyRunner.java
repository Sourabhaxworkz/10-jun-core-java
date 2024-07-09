class KitchenChimneyRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
		boolean connect = KitchenChimney.onOrOff();
		System.out.println("is Kitchen Chimney connected:" + connect);
		connect = KitchenChimney.onOrOff();
		System.out.println("is Kitchen Chimney connected:" + connect);
		System.out.println("Main Ended");
	}
}
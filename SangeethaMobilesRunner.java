class SangeethaMobilesRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
			String phoneName = "Apple";
			int noOfPhone = 3;
			double priceOfPhone = SangeethaMobiles.findTheNewBrandPhone(phoneName);
			System.out.println("Brand name is " + phoneName);
			System.out.println("Number of Phone Purchase " + noOfPhone);
			System.out.println("Total price is " + noOfPhone*priceOfPhone);
		System.out.println("Main Ended");
	}
}
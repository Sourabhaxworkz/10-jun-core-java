class NandiniParlourRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
			String milkProductName = "Khova";
			int priceOfMilkProduct = NandiniParlour.getProductPriceByName(milkProductName);
			System.out.println("Milk product is " + milkProductName);
			System.out.println("Milk product price " + priceOfMilkProduct);
		System.out.println("Main Ended");
	}
}
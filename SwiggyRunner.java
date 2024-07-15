class SwiggyRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
			String foodName = "Andhra Veg Full Carrier Meal";
			int qnty = 1;
			double priceOfFoodName = Swiggy.search(foodName);
			System.out.println("Food item name is " + foodName);
			//System.out.println("Food item for one product is " + priceOfFoodName);
			System.out.println("The quantity product is " + qnty);
			System.out.println("Food item total price " + qnty*priceOfFoodName);
		System.out.println("Main Ended");
	}
}
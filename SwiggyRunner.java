class SwiggyRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
			String foodItemName = "Chicken Lollipop Dry";
			double priceOfFoodItem = Swiggy.swiggyFoodItems(foodItemName);
			System.out.println("The food item name is "  + foodItemName);
			System.out.println("The food item price is " + priceOfFoodItem);
		System.out.println("Main Ended");
	}
}
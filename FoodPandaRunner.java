class FoodPandaRunner{
	public static void main(String[] args){
		System.out.println("Main started");
			String foodItemName = "Ghee Set Dosa (3 Pcs)";
			double foodItemPrice = FoodPanda.foodPandaFoodItems(foodItemName);
			System.out.println("The food item name is " + foodItemName);
			System.out.println("The food item price is " + foodItemPrice);
		System.out.println("Main ended");
	}
}
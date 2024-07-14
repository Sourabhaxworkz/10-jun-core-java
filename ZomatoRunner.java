class ZomatoRunner{
	public static void main(String[] args){
		System.out.println("Main started");
			String foodItemName = "Paneer Zinger Burger";
			double foodItemPrice = Zomato.zomatoFoodItems(foodItemName);
			System.out.println("The food item name is " + foodItemName);
			System.out.println("The food item price is " + foodItemPrice);
		System.out.println("Main ended");
	}
}
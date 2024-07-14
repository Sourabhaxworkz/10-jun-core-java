class Zomato{
	public static double zomatoFoodItems(String foodItems){
		double foodItemsPrice = 0.0;
		if(foodItems == "Paneer Zinger Burger"){
			foodItemsPrice = 469.32;
			return foodItemsPrice;
		}
		if(foodItems == "Spicy Zinger Burger and Popcorn Meal"){
			foodItemsPrice = 559.36;
			return foodItemsPrice;
		}
		if(foodItems == "Spicy Zinger Burger"){
			foodItemsPrice = 239.63;
			return foodItemsPrice;
		}
		if(foodItems == "Spicy Zinger Burger and Chicken Meal"){
			foodItemsPrice = 364.69;
			return foodItemsPrice;
		}
		if(foodItems == "Zinger Pro Burger & Popcorn Meal"){
			foodItemsPrice = 359.36;
			return foodItemsPrice;
		}
		if(foodItems == "Zinger Pro Burger"){
			foodItemsPrice = 259.36;
			return foodItemsPrice;
		}
		if(foodItems == "Zinger Pro Burger & Chicken Meal"){
			foodItemsPrice = 379.36;
			return foodItemsPrice;
		}
		if(foodItems == "Chicken Burger Buddy Meal"){
			foodItemsPrice = 559.63;
			return foodItemsPrice;
		}
		if(foodItems == "Mixed Chicken Zinger Burger Doubles"){
			foodItemsPrice = 419.56;
			return foodItemsPrice;
		}
		if(foodItems == "Chicken Zinger Burger - Classic with Cheese"){
			foodItemsPrice = 259.23;
			return foodItemsPrice;
		}
		if(foodItems == "Chicken Zinger Burger - Tandoori with Cheese"){
			foodItemsPrice = 309.32;
			return foodItemsPrice;
		}
		if(foodItems == "Veg Zinger Burger with Cheese"){
			foodItemsPrice = 265.32;
			return foodItemsPrice;
		}
		if(foodItems == "Chicken Zinger Burger - Classic"){
			foodItemsPrice = 199.36;
			return foodItemsPrice;
		}
		if(foodItems == "Veg Zinger Burger"){
			foodItemsPrice = 119.36;
			return foodItemsPrice;
		}
		if(foodItems == "Chicken Zinger Burger - Tandoori"){
			foodItemsPrice = 239.65;
			return foodItemsPrice;
		}
		if(foodItems == "2 X Chicken Krisper Burgers"){
			foodItemsPrice = 209.65;
			return foodItemsPrice;
		}
		if(foodItems == "2 X Veg Krisper Burgers"){
			foodItemsPrice = 209.68;
			return foodItemsPrice;
		}
		if(foodItems == "All Chicken Box"){
			foodItemsPrice = 379.23;
			return foodItemsPrice;
		}
		if(foodItems == "BGMI Zinger Box"){
			foodItemsPrice = 479.54;
			return foodItemsPrice;
		}
		if(foodItems == "Rice Box Meal"){
			foodItemsPrice = 379.65;
			return foodItemsPrice;
		}
		if(foodItems == "Paneer Zinger Burger"){
			foodItemsPrice = 359.56;
			return foodItemsPrice;
		}
		else{
			System.out.println(foodItems + "not found");
		}
		return foodItemsPrice;
	}
}
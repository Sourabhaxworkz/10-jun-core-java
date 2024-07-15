class Zomato{
	public static double search(String foodItems){
		double foodItemsPrice = 0.0;
		if(foodItems == "Paneer Zinger Burger") return foodItemsPrice = 469.32;
		if(foodItems == "Spicy Zinger Burger and Popcorn Meal") return foodItemsPrice = 559.36;
		if(foodItems == "Spicy Zinger Burger") return foodItemsPrice = 239.63;
		if(foodItems == "Spicy Zinger Burger and Chicken Meal") return foodItemsPrice = 364.69;
		if(foodItems == "Zinger Pro Burger & Popcorn Meal") return foodItemsPrice = 359.36;
		if(foodItems == "Zinger Pro Burger") return foodItemsPrice = 259.36;
		if(foodItems == "Zinger Pro Burger & Chicken Meal") return foodItemsPrice = 379.36;
		if(foodItems == "Chicken Burger Buddy Meal") return foodItemsPrice = 559.63;
		if(foodItems == "Mixed Chicken Zinger Burger Doubles") return foodItemsPrice = 419.56;
		if(foodItems == "Chicken Zinger Burger - Classic with Cheese") return foodItemsPrice= 259.23;
		if(foodItems == "Chicken Zinger Burger - Tandoori with Cheese") return foodItemsPrice = 309.32;
		if(foodItems == "Veg Zinger Burger with Cheese") return foodItemsPrice = 265.32;
		if(foodItems == "Chicken Zinger Burger - Classic") return foodItemsPrice = 199.36;
		if(foodItems == "Veg Zinger Burger") return foodItemsPrice = 119.36;
		if(foodItems == "Chicken Zinger Burger - Tandoori") return foodItemsPrice = 239.65;
		if(foodItems == "2 X Chicken Krisper Burgers") return foodItemsPrice = 209.65;
		if(foodItems == "2 X Veg Krisper Burgers") return foodItemsPrice = 209.68;
		if(foodItems == "All Chicken Box") return foodItemsPrice = 379.23;
		if(foodItems == "BGMI Zinger Box") return foodItemsPrice = 479.54;
		if(foodItems == "Rice Box Meal") return foodItemsPrice = 379.65;
		if(foodItems == "Paneer Zinger Burger") return foodItemsPrice = 359.56;
		else{
			System.out.println(foodItems + "not found");
		}
		return foodItemsPrice;
	}
	public static double search(String foodItems , int qnty){
		double foodItemsPrice = 0.0;
		if(foodItems == "Paneer Zinger Burger") return foodItemsPrice = 469.32*qnty;
		if(foodItems == "Spicy Zinger Burger and Popcorn Meal") return foodItemsPrice = 559.36*qnty;
		if(foodItems == "Spicy Zinger Burger") return foodItemsPrice = 239.63*qnty;
		if(foodItems == "Spicy Zinger Burger and Chicken Meal") return foodItemsPrice = 364.69*qnty;
		if(foodItems == "Zinger Pro Burger & Popcorn Meal") return foodItemsPrice = 359.36*qnty;
		if(foodItems == "Zinger Pro Burger") return foodItemsPrice = 259.36*qnty;
		if(foodItems == "Zinger Pro Burger & Chicken Meal") return foodItemsPrice = 379.36*qnty;
		if(foodItems == "Chicken Burger Buddy Meal") return foodItemsPrice = 559.63*qnty;
		if(foodItems == "Mixed Chicken Zinger Burger Doubles") return foodItemsPrice = 419.56*qnty;
		if(foodItems == "Chicken Zinger Burger - Classic with Cheese") return foodItemsPrice= 259.23*qnty;
		if(foodItems == "Chicken Zinger Burger - Tandoori with Cheese") return foodItemsPrice = 309.32*qnty;
		if(foodItems == "Veg Zinger Burger with Cheese") return foodItemsPrice = 265.32*qnty;
		if(foodItems == "Chicken Zinger Burger - Classic") return foodItemsPrice = 199.36*qnty;
		if(foodItems == "Veg Zinger Burger") return foodItemsPrice = 119.36*qnty;
		if(foodItems == "Chicken Zinger Burger - Tandoori") return foodItemsPrice = 239.65*qnty;
		if(foodItems == "2 X Chicken Krisper Burgers") return foodItemsPrice = 209.65*qnty;
		if(foodItems == "2 X Veg Krisper Burgers") return foodItemsPrice = 209.68*qnty;
		if(foodItems == "All Chicken Box") return foodItemsPrice = 379.23*qnty;
		if(foodItems == "BGMI Zinger Box") return foodItemsPrice = 479.54*qnty;
		if(foodItems == "Rice Box Meal") return foodItemsPrice = 379.65*qnty;
		if(foodItems == "Paneer Zinger Burger") return foodItemsPrice = 359.56*qnty;
		else{
			System.out.println(foodItems + "not found");
		}
		return foodItemsPrice;
	}
}

class Domninos{
	public static double search(String foodItems){
		double foodItemsPrice = 0.0;
		if(foodItems == "Special Party for 4 (Veg)Pizza") return foodItemsPrice = 969.32;
		if(foodItems == "Pizza Party for 4 (Veg)Pizza") return foodItemsPrice = 959.36;
		if(foodItems == "Party for 4 (Veg)") return foodItemsPrice= 939.63;
		if(foodItems == "Extravaganza Party for 2 (Veg)Pizza") return foodItemsPrice = 564.69;
		if(foodItems == "Dominator Party for 2 (Non-Veg)Pizza") return foodItemsPrice = 559.36;
		if(foodItems == "Special Party for 2 (Veg)Pizza ") return foodItemsPrice = 559.36;
		if(foodItems == "Match Day Veg Combo Pizza") return foodItemsPrice = 579.36;
		if(foodItems == "Special Party for 2 (Non-Veg)Pizza") return foodItemsPrice = 559.63;
		if(foodItems == "Party for 2 (Non-Veg) Pizza") return foodItemsPrice = 419.56;
		if(foodItems == "Party for 2 (Veg) Pizza") return foodItemsPrice = 559.23;
		if(foodItems == "Dominator Party for 4 (Non-Veg) Paneer Pizza") return foodItemsPrice = 1309.32;
		if(foodItems == "Meal for 2: Pepper BBQ Chicken & Spiced Double Chicken Pizza") return foodItemsPrice = 1265.32;
		if(foodItems == "Meal for 4: Veg Extravaganza & Indi Tandoori Paneer Pizza") return foodItemsPrice = 1199.36;
		if(foodItems == "Spicy Non Veg Combo Pizza") return foodItemsPrice = 319.36;
		if(foodItems == "Meal for 4: Margherita & Peppy Paneer Pizza") return foodItemsPrice = 639.65;
		if(foodItems == "Meal for 2: Farmhouse & Veg Extravaganza") return foodItemsPrice = 609.65;
		if(foodItems == "Garlic Breadsticks + Pepsi") return foodItemsPrice = 109.68;
		if(foodItems == "Meal for 4: Veg Cheesy Pizza") return foodItemsPrice = 779.23;
		if(foodItems == "Spicy Veg Party Combo Paneer Pizza") return foodItemsPrice = 679.54;
		if(foodItems == "Margherita") return foodItemsPrice = 179.65;
		if(foodItems == "Tandoori Paneer") return foodItemsPrice = 359.56;
		else{
			System.out.println(foodItems + "not found");
		}
		return foodItemsPrice;
	}
	public static double search(String foodItems , int qnty){
		double foodItemsPrice = 0.0;
		if(foodItems == "Special Party for 4 (Veg)Pizza") return foodItemsPrice = 969.32*qnty;
		if(foodItems == "Pizza Party for 4 (Veg)Pizza") return foodItemsPrice = 959.36*qnty;
		if(foodItems == "Party for 4 (Veg)") return foodItemsPrice= 939.63*qnty;
		if(foodItems == "Extravaganza Party for 2 (Veg)Pizza") return foodItemsPrice = 564.69*qnty;
		if(foodItems == "Dominator Party for 2 (Non-Veg)Pizza") return foodItemsPrice = 559.36*qnty;
		if(foodItems == "Special Party for 2 (Veg)Pizza ") return foodItemsPrice = 559.36*qnty;
		if(foodItems == "Match Day Veg Combo Pizza") return foodItemsPrice = 579.36*qnty;
		if(foodItems == "Special Party for 2 (Non-Veg)Pizza") return foodItemsPrice = 559.63*qnty;
		if(foodItems == "Party for 2 (Non-Veg) Pizza") return foodItemsPrice = 419.56*qnty;
		if(foodItems == "Party for 2 (Veg) Pizza") return foodItemsPrice = 559.23*qnty;
		if(foodItems == "Dominator Party for 4 (Non-Veg) Paneer Pizza") return foodItemsPrice = 1309.32*qnty;
		if(foodItems == "Meal for 2: Pepper BBQ Chicken & Spiced Double Chicken Pizza") return foodItemsPrice = 1265.32*qnty;
		if(foodItems == "Meal for 4: Veg Extravaganza & Indi Tandoori Paneer Pizza") return foodItemsPrice = 1199.36*qnty;
		if(foodItems == "Spicy Non Veg Combo Pizza") return foodItemsPrice = 319.36*qnty;
		if(foodItems == "Meal for 4: Margherita & Peppy Paneer Pizza") return foodItemsPrice = 639.65*qnty;
		if(foodItems == "Meal for 2: Farmhouse & Veg Extravaganza") return foodItemsPrice = 609.65*qnty;
		if(foodItems == "Garlic Breadsticks + Pepsi") return foodItemsPrice = 109.68*qnty;
		if(foodItems == "Meal for 4: Veg Cheesy Pizza") return foodItemsPrice = 779.23*qnty;
		if(foodItems == "Spicy Veg Party Combo Paneer Pizza") return foodItemsPrice = 679.54*qnty;
		if(foodItems == "Margherita") return foodItemsPrice = 179.65*qnty;
		if(foodItems == "Tandoori Paneer") return foodItemsPrice = 359.56*qnty;
		else{
			System.out.println(foodItems + "not found");
		}
		return foodItemsPrice;
	}
}
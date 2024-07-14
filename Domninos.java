class Domninos{
	public static double dominosFoodItems(String foodItems){
		double foodItemsPrice = 0.0;
		if(foodItems == "Special Party for 4 (Veg)Pizza"){
			foodItemsPrice = 969.32;
			return foodItemsPrice;
		}
		if(foodItems == "Pizza Party for 4 (Veg)Pizza"){
			foodItemsPrice = 959.36;
			return foodItemsPrice;
		}
		if(foodItems == "Party for 4 (Veg)"){
			foodItemsPrice = 939.63;
			return foodItemsPrice;
		}
		if(foodItems == "Extravaganza Party for 2 (Veg)Pizza"){
			foodItemsPrice = 564.69;
			return foodItemsPrice;
		}
		if(foodItems == "Dominator Party for 2 (Non-Veg)Pizza"){
			foodItemsPrice = 559.36;
			return foodItemsPrice;
		}
		if(foodItems == "Special Party for 2 (Veg)Pizza "){
			foodItemsPrice = 559.36;
			return foodItemsPrice;
		}
		if(foodItems == "Match Day Veg Combo Pizza"){
			foodItemsPrice = 579.36;
			return foodItemsPrice;
		}
		if(foodItems == "Special Party for 2 (Non-Veg)Pizza"){
			foodItemsPrice = 559.63;
			return foodItemsPrice;
		}
		if(foodItems == "Party for 2 (Non-Veg) Pizza"){
			foodItemsPrice = 419.56;
			return foodItemsPrice;
		}
		if(foodItems == "Party for 2 (Veg) Pizza"){
			foodItemsPrice = 559.23;
			return foodItemsPrice;
		}
		if(foodItems == "Dominator Party for 4 (Non-Veg) Paneer Pizza"){
			foodItemsPrice = 1309.32;
			return foodItemsPrice;
		}
		if(foodItems == "Meal for 2: Pepper BBQ Chicken & Spiced Double Chicken Pizza"){
			foodItemsPrice = 1265.32;
			return foodItemsPrice;
		}
		if(foodItems == "Meal for 4: Veg Extravaganza & Indi Tandoori Paneer Pizza"){
			foodItemsPrice = 1199.36;
			return foodItemsPrice;
		}
		if(foodItems == "Spicy Non Veg Combo Pizza"){
			foodItemsPrice = 319.36;
			return foodItemsPrice;
		}
		if(foodItems == "Meal for 4: Margherita & Peppy Paneer Pizza"){
			foodItemsPrice = 639.65;
			return foodItemsPrice;
		}
		if(foodItems == "Meal for 2: Farmhouse & Veg Extravaganza"){
			foodItemsPrice = 609.65;
			return foodItemsPrice;
		}
		if(foodItems == "Garlic Breadsticks + Pepsi"){
			foodItemsPrice = 109.68;
			return foodItemsPrice;
		}
		if(foodItems == "Meal for 4: Veg Cheesy Pizza"){
			foodItemsPrice = 779.23;
			return foodItemsPrice;
		}
		if(foodItems == "Spicy Veg Party Combo Paneer Pizza"){
			foodItemsPrice = 679.54;
			return foodItemsPrice;
		}
		if(foodItems == "Margherita"){
			foodItemsPrice = 179.65;
			return foodItemsPrice;
		}
		if(foodItems == "Tandoori Paneer"){
			foodItemsPrice = 359.56;
			return foodItemsPrice;
		}
		else{
			System.out.println(foodItems + "not found");
		}
		return foodItemsPrice;
	}
}
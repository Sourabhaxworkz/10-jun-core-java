class Swiggy{
	public static double swiggyFoodItems(String foodItems){
		double foodItemsPrice = 0.0;
		if(foodItems == "Andhra Veg Full Carrier Meal"){
			foodItemsPrice = 530.24;
			return foodItemsPrice;
		}
		if(foodItems == "Andhra Chicken Biryani"){
			foodItemsPrice = 339.21;
			return foodItemsPrice;
		}
		if(foodItems == "Premier Chicken Biryani Boneless"){
			foodItemsPrice = 339.65;
			return foodItemsPrice;
		}
		if(foodItems == "Andhra Mutton Biryani"){
			foodItemsPrice = 409.36;
			return foodItemsPrice;
		}
		if(foodItems == "Andhra Mutton Biryani Family Pack"){
			foodItemsPrice = 1299.36;
			return foodItemsPrice;
		}
		if(foodItems == "Andhra Chicken Biryani Family Pack"){
			foodItemsPrice = 1099.23;
			return foodItemsPrice;
		}
		if(foodItems == "Andhra Mini Veg Meal Box"){
			foodItemsPrice = 269.32;
			return foodItemsPrice;
		}
		if(foodItems == "Andhra Chicken Biryani With Chilly Chicken Box"){
			foodItemsPrice = 369.24;
			return foodItemsPrice;
		}
		if(foodItems == "Andhra Mutton Biryani With Mutton Fry Box"){
			foodItemsPrice = 459.21;
			return foodItemsPrice;
		}
		if(foodItems == "Mushroom Pepper Dry"){
			foodItemsPrice = 309.32;
			return foodItemsPrice;
		}
		if(foodItems == "Chicken Sholay Kebab"){
			foodItemsPrice = 339.24;
			return foodItemsPrice;
		}
		if(foodItems == "Andhra Chicken Kebab"){
			foodItemsPrice = 335.23;
			return foodItemsPrice;
		}
		if(foodItems == "Guntur Chicken Dry"){
			foodItemsPrice = 339.12;
			return foodItemsPrice;
		}
		if(foodItems == "Chicken Manchurian Dry"){
			foodItemsPrice = 339.23;
			return foodItemsPrice;
		}
		if(foodItems == "Paneer Sholay Kebab"){
			foodItemsPrice = 319.36;
			return foodItemsPrice;
		}
		if(foodItems == "Gobi 65"){
			foodItemsPrice = 249.32;
			return foodItemsPrice;
		}
		if(foodItems == "Baby Corn 65"){
			foodItemsPrice = 289.36;
			return foodItemsPrice;
		}
		if(foodItems == "Andhra Chilly Chicken"){
			foodItemsPrice = 329.36;
			return foodItemsPrice;
		}
		if(foodItems == "Nandhini Chicken Roast (Boneless)"){
			foodItemsPrice = 315.32;
			return foodItemsPrice;
		}
		if(foodItems == "Chicken Lollipop Dry"){
			foodItemsPrice = 329.36;
			return foodItemsPrice;
		}
		else{
			System.out.println(foodItems + "not found");
		}
		return foodItemsPrice;
	}
}
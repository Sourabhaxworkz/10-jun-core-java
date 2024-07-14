class FoodPanda{
	public static double foodPandaFoodItems(String foodItems){
		double foodItemsPrice = 0.0;
		if(foodItems == "Ghee Pudi Masala Dosa"){
			foodItemsPrice = 169.32;
			return foodItemsPrice;
		}
		if(foodItems == "Ghee Masala Dosa"){
			foodItemsPrice = 159.36;
			return foodItemsPrice;
		}
		if(foodItems == "Ghee Plain Dosa"){
			foodItemsPrice = 139.63;
			return foodItemsPrice;
		}
		if(foodItems == "Ghee Garlic Masala Dosa"){
			foodItemsPrice = 164.69;
			return foodItemsPrice;
		}
		if(foodItems == "Ghee Saagu Dosa"){
			foodItemsPrice = 159.36;
			return foodItemsPrice;
		}
		if(foodItems == "Ghee Tomato Uttapam (2 Pcs)"){
			foodItemsPrice = 159.36;
			return foodItemsPrice;
		}
		if(foodItems == "Open Butter Masala Dosa"){
			foodItemsPrice = 179.36;
			return foodItemsPrice;
		}
		if(foodItems == "Ghee Garlic Roast Dosa"){
			foodItemsPrice = 159.63;
			return foodItemsPrice;
		}
		if(foodItems == "Ghee Pudi Thatte Idli (1)"){
			foodItemsPrice = 119.56;
			return foodItemsPrice;
		}
		if(foodItems == "Thatte Idli(1)"){
			foodItemsPrice = 59.23;
			return foodItemsPrice;
		}
		if(foodItems == "Ghee Button Idli Sambar"){
			foodItemsPrice = 109.32;
			return foodItemsPrice;
		}
		if(foodItems == "Mini Vada (2 Pcs)"){
			foodItemsPrice = 65.32;
			return foodItemsPrice;
		}
		if(foodItems == "Ghee Ragi Thatte Idli"){
			foodItemsPrice = 99.36;
			return foodItemsPrice;
		}
		if(foodItems == "Ghee Ven Pongal"){
			foodItemsPrice = 119.36;
			return foodItemsPrice;
		}
		if(foodItems == "Poori Saagu (3 Pcs)"){
			foodItemsPrice = 139.65;
			return foodItemsPrice;
		}
		if(foodItems == "Kesaribath"){
			foodItemsPrice = 109.65;
			return foodItemsPrice;
		}
		if(foodItems == "Ghee Pudi Kharabath"){
			foodItemsPrice = 109.68;
			return foodItemsPrice;
		}
		if(foodItems == "Masala Vada (4 Pcs)"){
			foodItemsPrice = 79.23;
			return foodItemsPrice;
		}
		if(foodItems == "Chilli Bajji (4 Pcs)"){
			foodItemsPrice = 79.54;
			return foodItemsPrice;
		}
		if(foodItems == "Capsicum Bajji (4 Pcs)"){
			foodItemsPrice = 79.65;
			return foodItemsPrice;
		}
		if(foodItems == "Ghee Set Dosa (3 Pcs)"){
			foodItemsPrice = 159.56;
			return foodItemsPrice;
		}
		else{
			System.out.println(foodItems + "not found");
		}
		return foodItemsPrice;
	}
}
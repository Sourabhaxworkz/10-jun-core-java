class FoodPanda{
	public static double search(String foodItems){
		double foodItemsPrice = 0.0;
		if(foodItems == "Ghee Pudi Masala Dosa") return foodItemsPrice = 169.32;
		if(foodItems == "Ghee Masala Dosa")return foodItemsPrice = 159.36;
		if(foodItems == "Ghee Plain Dosa") return foodItemsPrice = 139.63;
		if(foodItems == "Ghee Garlic Masala Dosa")return foodItemsPrice = 164.69;
		if(foodItems == "Ghee Saagu Dosa") return foodItemsPrice = 159.36;
		if(foodItems == "Ghee Tomato Uttapam (2 Pcs)") return foodItemsPrice = 159.36;
		if(foodItems == "Open Butter Masala Dosa")return foodItemsPrice = 179.36;
		if(foodItems == "Ghee Garlic Roast Dosa") return foodItemsPrice = 159.63;
		if(foodItems == "Ghee Pudi Thatte Idli (1)") return foodItemsPrice = 119.56;
		if(foodItems == "Thatte Idli(1)") return foodItemsPrice = 59.23;
		if(foodItems == "Ghee Button Idli Sambar") return foodItemsPrice = 109.32;
		if(foodItems == "Mini Vada (2 Pcs)") return foodItemsPrice = 65.32;
		if(foodItems == "Ghee Ragi Thatte Idli") return foodItemsPrice = 99.36;
		if(foodItems == "Ghee Ven Pongal") return foodItemsPrice = 119.36;
		if(foodItems == "Poori Saagu (3 Pcs)") return foodItemsPrice = 139.65;
		if(foodItems == "Kesaribath") return foodItemsPrice = 109.65;
		if(foodItems == "Ghee Pudi Kharabath") return foodItemsPrice = 109.68;
		if(foodItems == "Masala Vada (4 Pcs)") return foodItemsPrice = 79.23;
		if(foodItems == "Chilli Bajji (4 Pcs)") return foodItemsPrice = 79.54;
		if(foodItems == "Capsicum Bajji (4 Pcs)") return foodItemsPrice = 79.65;
		if(foodItems == "Ghee Set Dosa (3 Pcs)") return foodItemsPrice = 159.56;
		else{
			System.out.println(foodItems + "not found");
		}
		return foodItemsPrice;
	}
		public static double search(String foodItems , int qnty){
			double foodItemsPrice = 0.0;
			if(foodItems == "Ghee Pudi Masala Dosa") return foodItemsPrice = 169.32*qnty;
		if(foodItems == "Ghee Masala Dosa")return foodItemsPrice = 159.36*qnty;
		if(foodItems == "Ghee Plain Dosa") return foodItemsPrice = 139.63*qnty;
		if(foodItems == "Ghee Garlic Masala Dosa")return foodItemsPrice = 164.69*qnty;
		if(foodItems == "Ghee Saagu Dosa") return foodItemsPrice = 159.36*qnty;
		if(foodItems == "Ghee Tomato Uttapam (2 Pcs)") return foodItemsPrice = 159.36*qnty;
		if(foodItems == "Open Butter Masala Dosa")return foodItemsPrice = 179.36*qnty;
		if(foodItems == "Ghee Garlic Roast Dosa") return foodItemsPrice = 159.63*qnty;
		if(foodItems == "Ghee Pudi Thatte Idli (1)") return foodItemsPrice = 119.56*qnty;
		if(foodItems == "Thatte Idli(1)") return foodItemsPrice = 59.23*qnty;
		if(foodItems == "Ghee Button Idli Sambar") return foodItemsPrice = 109.32*qnty;
		if(foodItems == "Mini Vada (2 Pcs)") return foodItemsPrice = 65.32*qnty;
		if(foodItems == "Ghee Ragi Thatte Idli") return foodItemsPrice = 99.36*qnty;
		if(foodItems == "Ghee Ven Pongal") return foodItemsPrice = 119.36*qnty;
		if(foodItems == "Poori Saagu (3 Pcs)") return foodItemsPrice = 139.65*qnty;
		if(foodItems == "Kesaribath") return foodItemsPrice = 109.65*qnty;
		if(foodItems == "Ghee Pudi Kharabath") return foodItemsPrice = 109.68*qnty;
		if(foodItems == "Masala Vada (4 Pcs)") return foodItemsPrice = 79.23*qnty;
		if(foodItems == "Chilli Bajji (4 Pcs)") return foodItemsPrice = 79.54*qnty;
		if(foodItems == "Capsicum Bajji (4 Pcs)") return foodItemsPrice = 79.65*qnty;
		if(foodItems == "Ghee Set Dosa (3 Pcs)") return foodItemsPrice = 159.56*qnty;
		else{
			System.out.println(foodItems + "not found");
		}
		return foodItemsPrice;
		}
}
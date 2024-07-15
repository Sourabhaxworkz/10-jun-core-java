class Swiggy{
	public static double search(String foodName){
		double foodPrice = 0.0;
		if(foodName == "Andhra Veg Full Carrier Meal") return foodPrice = 530.24;
		if(foodName == "Andhra Chicken Biryani") return foodPrice = 339.21;
		if(foodName == "Premier Chicken Biryani Boneless") return foodPrice = 339.65;
		if(foodName == "Andhra Mutton Biryani") return foodPrice = 409.36;
		if(foodName == "Andhra Mutton Biryani Family Pack") return foodPrice = 1299.36;
		if(foodName == "Andhra Chicken Biryani Family Pack") return foodPrice = 1099.23;
		if(foodName == "Andhra Mini Veg Meal Box") return foodPrice = 269.32;
		if(foodName == "Andhra Chicken Biryani With Chilly Chicken Box") return foodPrice = 369.24;
		if(foodName == "Andhra Mutton Biryani With Mutton Fry Box") return foodPrice = 459.21;
		if(foodName == "Mushroom Pepper Dry") return foodPrice = 309.32;
		if(foodName == "Chicken Sholay Kebab") return foodPrice = 339.24;
		if(foodName == "Andhra Chicken Kebab") return foodPrice = 335.23;
		if(foodName == "Guntur Chicken Dry") return foodPrice = 339.12;
		if(foodName == "Chicken Manchurian Dry") return foodPrice = 339.23;
		if(foodName == "Paneer Sholay Kebab") return foodPrice = 319.36;
		if(foodName == "Gobi 65") return foodPrice = 249.32;
		if(foodName == "Baby Corn 65") return foodPrice = 289.36;
		if(foodName == "Andhra Chilly Chicken") return foodPrice = 329.36;
		if(foodName == "Nandhini Chicken Roast (Boneless") return foodPrice = 315.32;
		if(foodName == "Chicken Lollipop Dry") return foodPrice = 329.36;
		else {
			System.out.println(foodName + "not found");
		}
		return foodPrice;
		
	}
	public static double search(String foodName , int qnty){
		double foodPrice = 0.0;
		if(foodName == "Andhra Veg Full Carrier Meal") return foodPrice = 530.21*qnty;
		if(foodName == "Andhra Chicken Biryani") return foodPrice = 339.21*qnty;
		if(foodName == "Premier Chicken Biryani Boneless") return foodPrice =  339.65*qnty;
		if(foodName == "Andhra Mutton Biryani") return foodPrice =  409.36*qnty;
		if(foodName == "Andhra Mutton Biryani Family Pack") return foodPrice =  1299.36*qnty;
		if(foodName == "Andhra Chicken Biryani Family Pack") return foodPrice =  1099.23*qnty;
		if(foodName == "Andhra Mini Veg Meal Box") return foodPrice =  269.32*qnty;
		if(foodName == "Andhra Chicken Biryani With Chilly Chicken Box") return foodPrice =  369.24*qnty;
		if(foodName == "Andhra Mutton Biryani With Mutton Fry Box") return foodPrice =  459.21*qnty;
		if(foodName == "Mushroom Pepper Dry") return foodPrice =  309.32*qnty;
		if(foodName == "Chicken Sholay Kebab") return foodPrice =  339.24*qnty;
		if(foodName == "Andhra Chicken Kebab") return foodPrice =  335.23*qnty;
		if(foodName == "Guntur Chicken Dry") return foodPrice =  339.12*qnty;
		if(foodName == "Chicken Manchurian Dry") return foodPrice =  339.23*qnty;
		if(foodName == "Paneer Sholay Kebab") return foodPrice =  319.36*qnty;
		if(foodName == "Gobi 65") return foodPrice =  249.32*qnty;
		if(foodName == "Baby Corn 65") return foodPrice =  289.36*qnty;
		if(foodName == "Andhra Chilly Chicken") return foodPrice =  329.36*qnty;
		if(foodName == "Nandhini Chicken Roast (Boneless") return foodPrice =  315.32*qnty;
		if(foodName == "Chicken Lollipop Dry") return foodPrice =  329.36*qnty;
		else {
			System.out.println(foodName + "not found");
		}
		return foodPrice;
	}
}
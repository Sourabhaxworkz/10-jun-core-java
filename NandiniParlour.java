class NandiniParlour{
	public static int getProductPriceByName(String milkProductName){
		int milkProductPrice = 0;
		if(milkProductName == "Ghee"){
			milkProductPrice = 78;
			return milkProductPrice;
		}
		if(milkProductName == "Butter Salted"){
			milkProductPrice = 265;
			return milkProductPrice;
		}
		if(milkProductName == "Flavoured Milk-Badam"){
			milkProductPrice = 25;
			return milkProductPrice;
		}
		if(milkProductName == "Butter Milk -Spiced"){
			milkProductPrice = 8;
			return milkProductPrice;
		}
		if(milkProductName == "Plain Lassi"){
			milkProductPrice = 20;
			return milkProductPrice;
		}
		if(milkProductName == "Nandini Cream"){
			milkProductPrice = 60;
			return milkProductPrice;
		}
		if(milkProductName == "Peda"){
			milkProductPrice = 140;
			return milkProductPrice;
		}
		if(milkProductName == "Khova"){
			milkProductPrice = 90;
			return milkProductPrice;
		}
		if(milkProductName == "Gulab Jamoon Mix"){
			milkProductPrice = 80;
			return milkProductPrice;
		}
		if(milkProductName == "Coconut Cookies"){
			milkProductPrice = 6;
			return milkProductPrice;
		}
		else{
			System.out.println(milkProductName + "not found");
		}
		return milkProductPrice;
	}
}
class NandiniParlour{
	public static int search(String milkProductName){
		int milkProductPrice = 0;
		if(milkProductName == "Ghee") return milkProductPrice = 78;
		if(milkProductName == "Butter Salted") return milkProductPrice = 265;
		if(milkProductName == "Flavoured Milk-Badam") return milkProductPrice = 25;
		if(milkProductName == "Butter Milk -Spiced") return milkProductPrice = 8;
		if(milkProductName == "Plain Lassi") return milkProductPrice = 20;
		if(milkProductName == "Nandini Cream") return milkProductPrice = 60;
		if(milkProductName == "Peda") return milkProductPrice = 140;
		if(milkProductName == "Khova") return milkProductPrice = 90;
		if(milkProductName == "Gulab Jamoon Mix") return milkProductPrice = 80;
		if(milkProductName == "Coconut Cookies") return milkProductPrice = 6;
		else{
			System.out.println(milkProductName + "not found");
		}
		return milkProductPrice;
	}
	public static int search(String milkProductName , int qnty){
		int milkProductPrice = 0;
		if(milkProductName == "Ghee") return milkProductPrice = 78*qnty;
		if(milkProductName == "Butter Salted") return milkProductPrice = 265*qnty;
		if(milkProductName == "Flavoured Milk-Badam") return milkProductPrice = 25*qnty;
		if(milkProductName == "Butter Milk -Spiced") return milkProductPrice = 8*qnty;
		if(milkProductName == "Plain Lassi") return milkProductPrice = 20*qnty;
		if(milkProductName == "Nandini Cream") return milkProductPrice = 60*qnty;
		if(milkProductName == "Peda") return milkProductPrice = 140*qnty;
		if(milkProductName == "Khova") return milkProductPrice = 90*qnty;
		if(milkProductName == "Gulab Jamoon Mix") return milkProductPrice = 80*qnty;
		if(milkProductName == "Coconut Cookies") return milkProductPrice = 6*qnty;
		else{
			System.out.println(milkProductName + "not found");
		}
		return milkProductPrice;
	}
}
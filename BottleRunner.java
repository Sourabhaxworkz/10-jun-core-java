class BottleRunner{
	public static void main(String[] bottle){
		/*Bottle ref = new Bottle();
		ref.brandName = "Milton";
		ref.price = 120.00;
		System.out.println("Brand Name is "+ref.brandName);
		System.out.println("Price for bottle is " +ref.price);
		
		Bottle ref1= new Bottle();
		ref1.brandName = "Tapperware";
		ref1.price = 130.00;
		System.out.println("Brand Name is "+ref1.brandName);
		System.out.println("Price for bottle is " +ref1.price);
		
		Bottle ref2= new Bottle();
		ref2.brandName = "Avathar";
		ref2.price = 100.00;
		System.out.println("Brand Name is "+ref2.brandName);
		System.out.println("Price for bottle is " +ref2.price);
		
		Bottle ref3= new Bottle();
		ref3.brandName = "Cello";
		ref3.price = 150.00;
		System.out.println("Brand Name is "+ref3.brandName);
		System.out.println("Price for bottle is " +ref3.price);*/
		
		Bottle ref = new Bottle("Milton" , 120.00);
		System.out.println("Brand Name is "+ref.brandName);
		System.out.println("Price for bottle is " +ref.price);
		
		Bottle ref1 = new Bottle("Tapperware" , 130.00);
		System.out.println("Brand Name is "+ref1.brandName);
		System.out.println("Price for bottle is " +ref1.price);
		
		Bottle ref2 = new Bottle("Avathar" , 100.00);
		System.out.println("Brand Name is "+ref2.brandName);
		System.out.println("Price for bottle is " +ref2.price);
		
		Bottle ref3 = new Bottle("Cello" , 150.00);
		System.out.println("Brand Name is "+ref3.brandName);
		System.out.println("Price for bottle is " +ref3.price);
	}
}
class Bottle{
	String brandName;
	double price;
	
	//default Constructor
	public Bottle(){
		System.out.println("Bottle object is created");
	}
	
	//parameterized Constructor
	public Bottle(String bName , double pc){
		brandName = bName;
		price = pc;
	}
	
}
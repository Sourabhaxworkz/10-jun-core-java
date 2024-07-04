class Maggi{
	// we used static variables 
	static String name = "Maggi";
	static int price = 14;
	static int qtyInGmrs = 70;
	static String ingingredients[] = {"Maida" , "Palm oil" , "Iodised salt" , "Wheat gluten" , "Thickeners" , "Acidity Regulators" , "Humectant"};
		public static void main(String[] args){
			System.out.println("Main Started");
			System.out.println("The name of the brand is " +name);
			System.out.println("The Price of item is " +price);
			System.out.println("The Quantity of item is " +qtyInGmrs);
			System.out.println("The Number of Ingingredients in Maggi are :");
			//System.out.println("List of Maggi Ingingredients are:");
			// we are using for condition in this 
					/*for(String ingingredient : ingingredients){
							System.out.println(ingingredient);
			}*/
			for(int ref = 0; ref < 7; ref++){
				String value = ingingredients[ref];
					System.out.println(value);
				
			}
			System.out.println("Main Ended");
		}
}
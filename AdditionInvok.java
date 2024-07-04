class AdditionInvok{

	public static void main(String[] args){
		System.out.println("Main Started");
		add(125 , 523);
		add(45 , 25);
		System.out.println("Main Ended");
		// invoking a method
		//add();
	}
	//method declaration
	public static void add(int num1 , int num2){
		System.out.println("add method started");
			System.out.println(num1 + num2);
		System.out.println("add method ended");
			return;
	
	}
}
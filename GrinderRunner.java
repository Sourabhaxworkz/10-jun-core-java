class GrinderRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
		boolean on = Grinder.onOrOff();
		System.out.println("The grinder is connected:" +on);
			Grinder.increaseSpeed();
			Grinder.increaseSpeed();
			Grinder.increaseSpeed();
			Grinder.increaseSpeed();
			Grinder.increaseSpeed();
			Grinder.increaseSpeed();
			
			Grinder.decreaseSpeed();
			Grinder.decreaseSpeed();
			Grinder.decreaseSpeed();
			Grinder.decreaseSpeed();
			Grinder.decreaseSpeed();
			Grinder.decreaseSpeed();
		on = Grinder.onOrOff();
		System.out.println("The grinder is connected:" +on);
		System.out.println("Main Ended");
	}
}
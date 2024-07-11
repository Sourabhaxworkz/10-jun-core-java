class RefrigeratorRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
		boolean on = Refrigerator.onOrOff();
		System.out.println("The refrigerator is oned:" +on);
			Refrigerator.increaseCoolingTemp();
			Refrigerator.increaseCoolingTemp();
			Refrigerator.increaseCoolingTemp();
			Refrigerator.increaseCoolingTemp();
			Refrigerator.increaseCoolingTemp();
			Refrigerator.increaseCoolingTemp();
			Refrigerator.increaseCoolingTemp();
			Refrigerator.increaseCoolingTemp();
			Refrigerator.increaseCoolingTemp();
			Refrigerator.increaseCoolingTemp();
			Refrigerator.increaseCoolingTemp();
			
			
			Refrigerator.decreaseCoollingTemp();
			Refrigerator.decreaseCoollingTemp();
			Refrigerator.decreaseCoollingTemp();
			Refrigerator.decreaseCoollingTemp();
			Refrigerator.decreaseCoollingTemp();
			Refrigerator.decreaseCoollingTemp();
			Refrigerator.decreaseCoollingTemp();
			Refrigerator.decreaseCoollingTemp();
			Refrigerator.decreaseCoollingTemp();
			Refrigerator.decreaseCoollingTemp();
			Refrigerator.decreaseCoollingTemp();
		on = Refrigerator.onOrOff();
		System.out.println("The Refrigerator is oned:" +on);
		System.out.println("Main Ended");
	}
}
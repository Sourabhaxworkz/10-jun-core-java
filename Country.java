class Country{
	String countryId;
	int noOfStates;
	String pmOfCountry;
	long countryPopulation;
	
	public Country(){
		System.out.println("Country details created");
	}
	
	public Country(String countryId,int noOfStates,String pmOfCountry,long countryPopulation){
			this.countryId=countryId;
			this.noOfStates=noOfStates;
			this.pmOfCountry=pmOfCountry;
			this.countryPopulation=countryPopulation;
	}
	public void displayDetails(){
		System.out.println("Country ID is "+countryId);
		System.out.println("Number of states in country "+noOfStates);
		System.out.println("Name of the PM is "+pmOfCountry);
		System.out.println("Country population is "+countryPopulation);
	}
}
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
}
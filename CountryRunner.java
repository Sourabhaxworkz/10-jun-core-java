class CountryRunner{
	public static void main(String[] args){
		Country ref = new Country("AFG 004",34,"Hasan Akhund",42239854l);
		Country ref1 = new Country("ASM	016",24,"Nikol Pashinyan",43914l);
		Country ref2 = new Country("ARG	032",14,"Juan Luis Manzur",45773884l);
		Country ref3 = new Country("AUS036",34,"Anthony Albanese",26439111l);
		Country ref4 = new Country("BGD	050",34,"Sheikh Hasina",172954319l);
		Country ref5 = new Country("BEL	056",34,"Alexander De Croo",11686140l);
		Country ref6 = new Country("IND	356",30,"Narendra Modi",1428627663l);
		Country ref7 = new Country("PAK	586",34,"Muhammad Shehbaz",240485658l);
		
		ref.displayDetails();
		ref1.displayDetails();
		ref2.displayDetails();
		ref3.displayDetails();
		ref4.displayDetails();
		ref5.displayDetails();
		ref6.displayDetails();
		ref7.displayDetails();
	}
}
class Movie{
	public static int getMoviePriceByName(String movieName){
		int moviePrice = 0;
		if(movieName == "KALKI"){
			moviePrice = 350;
			return moviePrice;
		}
		if(movieName == "INDIAN 2"){
			moviePrice =  450;
			return moviePrice;
		}
		if(movieName == "DEADPOOL & WOLVERINE"){
			moviePrice = 452;
			return moviePrice;
		}
		if(movieName == "SARFIRA"){
			moviePrice =  365;
			return moviePrice;
		}
		if(movieName == "DESPICABLE ME 4"){
			moviePrice =  458;
			return moviePrice;
		}
		if(movieName == "KILL"){
			moviePrice =  523;
			return moviePrice;
		}
		if(movieName == "LONGLEGS"){
			moviePrice =  563;
			return moviePrice;
		}
		if(movieName == "INSIDE OUT 2"){
			moviePrice =  456;
			return moviePrice;
		}
		if(movieName == "FLY ME TO THE MOON"){
			moviePrice =  456;
			return moviePrice;
		}
		if(movieName == "TEENZ"){
			moviePrice =  423;
			return moviePrice;
		}
		if(movieName == "MUNJYA"){
			moviePrice =  569;
			return moviePrice;
		}
		if(movieName == "CHANDU CHAMPION"){
			moviePrice =  695;
			return moviePrice;
		}
		if(movieName == "JATT AND JULIET 3"){
			moviePrice =  456;
			return moviePrice;
		}
		if(movieName == "KAAGAZ KE PHOOL"){
			moviePrice =  365;
			return moviePrice;
		}
		if(movieName == "A QUIET PLACE: DAY ONE"){
			moviePrice =  236;
			return moviePrice;
		}
		if(movieName == "MAHARAJA"){
			moviePrice =  532;
			return moviePrice;
		}
		if(movieName == "MANIKBABUR MEGH"){
			moviePrice =  423;
			return moviePrice;
		}
		if(movieName == "LOVE LI"){
			moviePrice =  698;
			return moviePrice;
		}
		if(movieName == "ROCKSTAR"){
			moviePrice =  236;
			return moviePrice;
		}
		if(movieName == "HANDA"){
			moviePrice =  456;
			return moviePrice;
		}
		if(movieName == "GODZILLA X KONG"){
			moviePrice =  569;
			return moviePrice;
		}
		else{
			System.out.println(movieName + "not found");
		}
		return moviePrice;
	}
}
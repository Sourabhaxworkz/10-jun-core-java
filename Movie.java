class Movie{
	public static int search(String movieName){
		int moviePrice = 0;
		if(movieName == "KALKI") return moviePrice = 350;
		if(movieName == "INDIAN 2") return moviePrice =  450;
		if(movieName == "DEADPOOL & WOLVERINE") return moviePrice = 452;
		if(movieName == "SARFIRA") return moviePrice =  365;
		if(movieName == "DESPICABLE ME 4") return moviePrice =  458;
		if(movieName == "KILL") return moviePrice =  523;
		if(movieName == "LONGLEGS") return moviePrice =  563;
		if(movieName == "INSIDE OUT 2") return moviePrice =  456;
		if(movieName == "FLY ME TO THE MOON") return moviePrice =  456;
		if(movieName == "TEENZ") return moviePrice =  423;
		if(movieName == "MUNJYA") return moviePrice =  569;
		if(movieName == "CHANDU CHAMPION") return moviePrice =  695;
		if(movieName == "JATT AND JULIET 3") return moviePrice =  456;
		if(movieName == "KAAGAZ KE PHOOL") return moviePrice =  365;
		if(movieName == "A QUIET PLACE: DAY ONE") return moviePrice =  236;
		if(movieName == "MAHARAJA") return moviePrice =  532;
		if(movieName == "MANIKBABUR MEGH") return moviePrice =  423;
		if(movieName == "LOVE LI") return moviePrice =  698;
		if(movieName == "ROCKSTAR") return moviePrice =  236;
		if(movieName == "HANDA") return moviePrice =  456;
		if(movieName == "GODZILLA X KONG") return moviePrice =  569;
		else{
			System.out.println(movieName + "not found");
		}
		return moviePrice;
	}
	public static int search(String movieName , int qnty){
		int moviePrice = 0;
		if(movieName == "KALKI") return moviePrice = 350*qnty;
		if(movieName == "INDIAN 2") return moviePrice =  450*qnty;
		if(movieName == "DEADPOOL & WOLVERINE") return moviePrice = 452*qnty;
		if(movieName == "SARFIRA") return moviePrice =  365*qnty;
		if(movieName == "DESPICABLE ME 4") return moviePrice =  458*qnty;
		if(movieName == "KILL") return moviePrice =  523*qnty;
		if(movieName == "LONGLEGS") return moviePrice =  563*qnty;
		if(movieName == "INSIDE OUT 2") return moviePrice =  456*qnty;
		if(movieName == "FLY ME TO THE MOON") return moviePrice =  456*qnty;
		if(movieName == "TEENZ") return moviePrice =  423*qnty;
		if(movieName == "MUNJYA") return moviePrice =  569*qnty;
		if(movieName == "CHANDU CHAMPION") return moviePrice =  695*qnty;
		if(movieName == "JATT AND JULIET 3") return moviePrice =  456*qnty;
		if(movieName == "KAAGAZ KE PHOOL") return moviePrice =  365*qnty;
		if(movieName == "A QUIET PLACE: DAY ONE") return moviePrice =  236*qnty;
		if(movieName == "MAHARAJA") return moviePrice =  532*qnty;
		if(movieName == "MANIKBABUR MEGH") return moviePrice =  423*qnty;
		if(movieName == "LOVE LI") return moviePrice =  698*qnty;
		if(movieName == "ROCKSTAR") return moviePrice =  236*qnty;
		if(movieName == "HANDA") return moviePrice =  456*qnty;
		if(movieName == "GODZILLA X KONG") return moviePrice =  569*qnty;
		else{
			System.out.println(movieName + "not found");
		}
		return moviePrice;
	}
}
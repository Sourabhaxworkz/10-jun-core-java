class MovieRunner{
	public static void main (String[] args){
		System.out.println("Main Started");
			String movieName = "GODZILLA X KONG";
			int price = Movie.getMoviePriceByName(movieName);
			System.out.println("Movie name is:"  +movieName);
			System.out.println("Price of Movie:" +price);
		System.out.println("Main Ended");
	}
}
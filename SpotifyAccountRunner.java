class SpotifyAccountRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
			boolean SpotifyAccountCreated = SpotifyAccount.createSpotifyAccount(8123659940l , "Sourabha Y N" , "Premium" , "sourabha@2002" , "lovesong");
			
			if(SpotifyAccountCreated == true)
			SpotifyAccount.readUserSpotifyAccountDetails();
		System.out.println("Main Ended");
	}
}
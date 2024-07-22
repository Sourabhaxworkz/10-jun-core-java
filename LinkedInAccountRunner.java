class LinkedInAccountRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
			boolean LinkedInAccountCreated = LinkedInAccount.createLinkedInAccount("Sourabha" , "Y N" , "184/123/1 2nd corss Marigowda Layout Mandya" , "184/123/1 2nd corss Marigowda Layout Mysore" , 8123659940l , "sourabhyn@gmail.com" , "20-sep-2002" , "BE" , "VTU" , "State Level tabletennis player" , "Sourabha@2002" , "Sourabha@2002");
			
			if(LinkedInAccountCreated ==true)
			LinkedInAccount.readUserLinkedInAccountDetails();
		System.out.println("Main Ended");
	}
}
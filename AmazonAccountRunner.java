class AmazonAccountRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
			boolean AccountCreated = AmazonAccount.createAmazonAccount("Sourabha" , "Y N" , "184/123/1 2nd corss Marigowda Layout Mandya" , "Cash On Delivary" ,  8123659940l , "Sourabha@2002");
			
			if(AccountCreated == true)
			AmazonAccount.readUserAmazonDetails();
		System.out.println("Main Ended");
	}
}
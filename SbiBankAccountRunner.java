class SbiBankAccountRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
			boolean SbiBankAccountCreated = SbiBankAccount.createSbiBankAccount(8123659940l , "Sourabha Y N" , "Premium" , "sourabha@2002" , "sourabha@2002");
			
			if(SbiBankAccountCreated == true)
			SbiBankAccount.readUserSbiBankAccountDetails();
		System.out.println("Main Ended");
	}
}
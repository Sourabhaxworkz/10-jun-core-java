class XworkzRegistrationRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
			boolean XworkzRegistrationCreated = XworkzRegistration.createXworkzRegistrationForm("sourabha" , "YN" , 8123659940l , "184/123/1 2nd corss Marigowda Layout Mandya" , "BE" , 7.94f , "CSE" , "GMIT");
			
			if(XworkzRegistrationCreated == true)
			XworkzRegistration.readXworkzRegistrationFormDetails();
		System.out.println("Main Ended");
	}
}
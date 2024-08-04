class SocialMedia{
	int id;
	String nameOfPerson;
	String profileName;
	String emailOfPerson;
	
	public SocialMedia(){
		System.out.println("SocialMedia created");
	}
	public SocialMedia(int id,String nameOfPerson,String profileName,String emailOfPerson){
		this.id=id;
		this.nameOfPerson=nameOfPerson;
		this.profileName=profileName;
		this.emailOfPerson=emailOfPerson;
	}
	public void displayDetails(){
		System.out.println("SocialMedia ID is "+id);
		System.out.println("Name of the Person "+nameOfPerson);
		System.out.println("Profile Name is "+profileName);
		System.out.println("Email Id of the person is "+emailOfPerson);
	}
}
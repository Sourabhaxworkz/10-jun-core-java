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
}
class XworkzRegistration{
	static String firstName;
	static String lastName;
	static long contactNumber;
	static String perAddress;
	static String eduType;
	static float percentage;
	static String courseType;
	static String nameOfCollege;
	public static boolean createXworkzRegistrationForm(String givenName , String surName , long phoneNumber , String permanetAddress , String educationType , float cgpa , String streamOfEducation , String collegeName){
		boolean isXworkzRegistrationCreated = false;
		/*boolean isFirstNameValid = false;
		boolean isLastNameValid = false;
		boolean isContactNumberValid = false;
		boolean isPermanetAddressValid = false;
		boolean isEducationTypeValid = false;
		boolean isCgpaValid = false;
		boolean isCourseTypeValid = false;
		boolean isNameOfCollegeValid = false;
		
		if(givenName != null){
			firstName = givenName;
			isFirstNameValid =true;
		}
		else
			System.out.println("First name is invalid");
		
		if(surName != null){
			lastName = surName;
			isLastNameValid=true;
		}
		else
			System.out.println("Last name is invalid");
			
		if(phoneNumber != 0.0){
			contactNumber = phoneNumber;
			isContactNumberValid=true;
		}
		else
			System.out.println("Contact Number is invalid");
		
		if(permanetAddress != null){
			perAddress = permanetAddress;
			isPermanetAddressValid=true;
		}
		else
			System.out.println("Permanet Address is invalid");
			
		if(educationType != null){
			eduType=educationType;
			isEducationTypeValid=true;
		}
		else
			System.out.println("Education type is invalid");
			
		if(cgpa != 0.0){
			percentage=cgpa;
			isCgpaValid=true;
		}
		else
			System.out.println("cgpa is invalid");
			
		if(streamOfEducation != null){
			courseType=streamOfEducation;
			isCourseTypeValid=true;
		}
		else
			System.out.println("course Type is invalid");
			
		if(collegeName != null){
			nameOfCollege=collegeName;
			isNameOfCollegeValid=true;
		}
		else
			System.out.println("college name is invalid");
			
		if(isFirstNameValid==true && isLastNameValid==true && isContactNumberValid==true && isPermanetAddressValid==true && isEducationTypeValid==true && isCgpaValid==true && isCourseTypeValid==true && isNameOfCollegeValid==true)
			isXworkzRegistrationCreated=true;
			firstName=givenName;
			lastName=surName;
			contactNumber=phoneNumber;
			perAddress=permanetAddress;
			eduType=educationType;
			percentage=cgpa;
			courseType=streamOfEducation;
			nameOfCollege=collegeName;*/
		isXworkzRegistrationCreated = validatingXworkzRegisteredDetails(givenName,surName,phoneNumber,permanetAddress,educationType,cgpa,streamOfEducation,collegeName);
		return isXworkzRegistrationCreated =true;
	}
	
	public static boolean validatingXworkzRegisteredDetails(String givenName , String surName , long phoneNumber , String permanetAddress , String educationType , float cgpa , String streamOfEducation , String collegeName){
		boolean isAllFieldValidated = false;
		boolean isFirstNameValid = false;
		boolean isLastNameValid = false;
		boolean isContactNumberValid = false;
		boolean isPermanetAddressValid = false;
		boolean isEducationTypeValid = false;
		boolean isCgpaValid = false;
		boolean isCourseTypeValid = false;
		boolean isNameOfCollegeValid = false;
		
		if(givenName != null){
			firstName = givenName;
			isFirstNameValid =true;
		}
		else
			System.out.println("First name is invalid");
		
		if(surName != null){
			lastName = surName;
			isLastNameValid=true;
		}
		else
			System.out.println("Last name is invalid");
			
		if(phoneNumber != 0.0){
			contactNumber = phoneNumber;
			isContactNumberValid=true;
		}
		else
			System.out.println("Contact Number is invalid");
		
		if(permanetAddress != null){
			perAddress = permanetAddress;
			isPermanetAddressValid=true;
		}
		else
			System.out.println("Permanet Address is invalid");
			
		if(educationType != null){
			eduType=educationType;
			isEducationTypeValid=true;
		}
		else
			System.out.println("Education type is invalid");
			
		if(cgpa != 0.0){
			percentage=cgpa;
			isCgpaValid=true;
		}
		else
			System.out.println("cgpa is invalid");
			
		if(streamOfEducation != null){
			courseType=streamOfEducation;
			isCourseTypeValid=true;
		}
		else
			System.out.println("course Type is invalid");
			
		if(collegeName != null){
			nameOfCollege=collegeName;
			isNameOfCollegeValid=true;
		}
		else
			System.out.println("college name is invalid");
			
		if(isFirstNameValid==true && isLastNameValid==true && isContactNumberValid==true && isPermanetAddressValid==true && isEducationTypeValid==true && isCgpaValid==true && isCourseTypeValid==true && isNameOfCollegeValid==true)
			isAllFieldValidated=true;
	return isAllFieldValidated;
	}
	
	public static void readXworkzRegistrationFormDetails(){
		System.out.println("the user fistname is "+firstName);
		System.out.println("the user last name is " +lastName);
		System.out.println("the user contact number is "+contactNumber);
		System.out.println("the user permanetAddress is " +perAddress);
		System.out.println("the education type is " +eduType);
		System.out.println("the cgps is " +percentage);
		System.out.println("the courseType is " +courseType);
		System.out.println("the collegeName is " +nameOfCollege);
	}
}
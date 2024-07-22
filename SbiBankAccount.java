class SbiBankAccount{
	static long contactNumber;
	static String fullName;
	static String typeOfAccount;
	static String password;
	static String securePwd;
		public static boolean createSbiBankAccount(long phoneNumber , String yourName , String accountType , String pwd , String confirmPwd){
			boolean isSbiBankAccountCreated = false;
			boolean isContactNumberValid = false;
			boolean isFullNameValid = false;
			boolean isTypeOfAccountValid = false;
			boolean isPasswordValid = false;
			boolean isSecurePwdValid = false;
			
			if(phoneNumber != 0.0){
				contactNumber = phoneNumber;
				isContactNumberValid = true;
			}
			else
				System.out.println("The contact number is invalid");
			
			if(yourName != null){
				fullName = yourName;
				isFullNameValid = true;
			}
			else
				System.out.println("The User name is invalid");
			
			if(accountType != null){
				typeOfAccount = accountType;
				isTypeOfAccountValid = true;
			}
			else
				System.out.println("The user account type is invalid");
			
			if(pwd != null){
				password = pwd;
				isPasswordValid =true;
			}
			else
				System.out.println("The user password is invalid");
			
			if(confirmPwd != null){
				securePwd = confirmPwd;
				isSecurePwdValid = true;
			}
			else
				System.out.println("Type user confirm password is invalid");
			
			if(isContactNumberValid == true && isFullNameValid==true && isTypeOfAccountValid==true && isPasswordValid==true && isSecurePwdValid==true)
				isSbiBankAccountCreated = true;
			
				contactNumber = phoneNumber;
				fullName = yourName;
				typeOfAccount = accountType;
				password = pwd;
				securePwd = confirmPwd;
		return isSbiBankAccountCreated;
		}
		public static void readUserSbiBankAccountDetails(){
			System.out.println("The user Phone Number is " +contactNumber);
			System.out.println("The user Name is " +fullName);
			System.out.println("The user Account Type is " +typeOfAccount);
			System.out.println("The user Password is " +password);
			System.out.println("The user song typr is " +securePwd);
		}
}
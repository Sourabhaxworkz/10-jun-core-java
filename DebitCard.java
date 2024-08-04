class DebitCard{
	int debitCardId;
	String debitCardHolderName;
	long debitCardNo;
	String debitCardExpDate;
	int debitCardCvv;
	
	/*public DebitCard(){
		System.out.println("DebitCard generated");
	}*/
	
	public DebitCard(int debitCardId , String debitCardHolderName , long debitCardNo , String debitCardExpDate , int debitCardCvv){
		this.debitCardId = debitCardId;
		this.debitCardHolderName = debitCardHolderName;
		this.debitCardNo = debitCardNo;
		this.debitCardExpDate = debitCardExpDate;
		this.debitCardCvv = debitCardCvv;
	}
	public void displayDetails(){
		System.out.println("DebitCard ID is "+debitCardId);
		System.out.println("DebitCard Holder Name is " +debitCardHolderName);
		System.out.println("DebitCard Number is "+debitCardNo);
		System.out.println("Expery date of DebitCard " +debitCardExpDate);
		System.out.println("DebitCard CVV is " +debitCardCvv);
	}
	
}
class DebitCard{
	int debitCardId;
	String debitCardHolderName;
	long debitCardNo;
	String debitCardExpDate;
	int debitCardCvv;
	
	public DebitCard(){
		System.out.println("DebitCard generated");
	}
	
	public DebitCard(int debitCardId , String debitCardHolderName , long debitCardNo , String debitCardExpDate , int debitCardCvv){
		this.debitCardId = debitCardId;
		this.debitCardHolderName = debitCardHolderName;
		this.debitCardNo = debitCardNo;
		this.debitCardExpDate = debitCardExpDate;
		this.debitCardCvv = debitCardCvv;
	}
	
}
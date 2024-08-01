class Bill{

	int billReferenceId;
	int billSequenceNo;
	String billIssueDate;
	String billDueDate;
	boolean isBillPaid;
	boolean isLatestBill;
	boolean isFinalBill;
	double billAmount;
	boolean istacInclusiveBill;
	
	public Bill(){
		System.out.println("Bill Generated");
	}
	
	public Bill(int billReferenceId , int billSequenceNo , String billIssueDate , String billDueDate , boolean isBillPaid , boolean isLatestBill , boolean isFinalBill , double billAmount , boolean istacInclusiveBill){
		this.billReferenceId = billReferenceId;
		this.billSequenceNo = billSequenceNo;
		this.billIssueDate = billIssueDate;
		this.billDueDate = billDueDate;
		this.isBillPaid = isBillPaid;
		this.isLatestBill = isLatestBill;
		this.isFinalBill = isFinalBill;
		this.billAmount = billAmount;
		this.istacInclusiveBill = istacInclusiveBill;
	}
}
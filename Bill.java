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
		public void displayDetails(){
			System.out.println("Bill Reference ID is " +billReferenceId);
			System.out.println("Bill Sequence Number is " +billSequenceNo);
			System.out.println("Bill Issue Date is " +billIssueDate);
			System.out.println("Bill Due Dtae is "+billDueDate);
			System.out.println("Is Bill Paid " +isBillPaid);
			System.out.println("Is the Bill is Lateset "+isLatestBill);
			System.out.println("Is this Bill is Final "+isFinalBill);
			System.out.println("Amount of the Bill is " +billAmount);
			System.out.println("Is the tax is included " +istacInclusiveBill);
		}
}
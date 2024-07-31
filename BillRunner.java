class BillRunner{
	public static void main(String args[]){
		//className ref = new className();
		
		Bill ref = new Bill();
		ref.billSequenceNo = 1;
		ref.billReferenceId = 4789;
		ref.billIssueDate = "14/07/2024";
		ref.billDueDate = "31/07/2024";
		ref.isLatestBill = true;
		ref.isFinalBill = false;
		ref.isBillPaid = false;
		ref.billAmount = 478.36;
		ref.tacInclusiveBill = true;
		System.out.println("Bill generated is started");
		System.out.println("Bill reference Id is " +ref.billReferenceId);
		System.out.println("Bill sequence No is "+ref.billSequenceNo);
		System.out.println("Bill Issue Dtae is " +ref.billIssueDate);
		System.out.println("Bill Due date is " +ref.billDueDate);
		System.out.println("This is latest bill "+ref.isLatestBill);
		System.out.println("Is this Final bill " +ref.isFinalBill);
		System.out.println("Is the bill amount is paid " +ref.isBillPaid);
		System.out.println("Bill amount is " +ref.billAmount);
		System.out.println("Is Bill include Tax Amount " +ref.tacInclusiveBill);
		System.out.println("Bill generated is Ended");
		
		/*System.out.println(ref.billSequenceNo);
		
		ref.billSequenceNo = 2;
		System.out.println(ref.billSequenceNo);
		
		ref.billSequenceNo = 3;
		System.out.println(ref.billSequenceNo);
		
		ref.billSequenceNo = 4;
		System.out.println(ref.billSequenceNo);
		
		ref.billSequenceNo=5;
		System.out.println(ref.billSequenceNo);
		
		ref.billSequenceNo=6;
		System.out.println(ref.billSequenceNo);
		
		ref.billSequenceNo=7;
		System.out.println(ref.billSequenceNo);
		
		ref.billSequenceNo=8;
		System.out.println(ref.billSequenceNo);
		
		ref.billSequenceNo=9;
		System.out.println(ref.billSequenceNo);
		
		ref.billSequenceNo=10;
		System.out.println(ref.billSequenceNo);
		System.out.println("Bill Sequence number is ended");
		
		Bill ref1 = new Bill();
		System.out.println("Bill Reference ID is Started");
		ref1.billReferenceId = 1236;
		System.out.println(ref1.billReferenceId);
		
		ref1.billReferenceId=1243;
		System.out.println(ref1.billReferenceId);
		
		ref1.billReferenceId=1235;
		System.out.println(ref1.billReferenceId);
		
		ref1.billReferenceId=1258;
		System.out.println(ref1.billReferenceId);
		
		ref1.billReferenceId=1478;
		System.out.println(ref1.billReferenceId);
		
		ref1.billReferenceId=9874;
		System.out.println(ref1.billReferenceId);
		
		ref1.billReferenceId=8521;
		System.out.println(ref1.billReferenceId);
		
		ref1.billReferenceId=8524;
		System.out.println(ref1.billReferenceId);
		
		ref1.billReferenceId=7896;
		System.out.println(ref1.billReferenceId);
		
		ref1.billReferenceId=4523;
		System.out.println(ref1.billReferenceId);
		System.out.println("Bill Reference ID is Ended");
		
		Bill ref2 = new Bill();
		System.out.println("Bill Issue Date is Started");
		ref2.billIssueDate = "12/5/2024";
		System.out.println(ref2.billIssueDate);
		
		ref2.billIssueDate = "12/4/2024";
		System.out.println(ref2.billIssueDate);
		
		ref2.billIssueDate = "12/3/2024";
		System.out.println(ref2.billIssueDate);
		
		ref2.billIssueDate = "12/2/2024";
		System.out.println(ref2.billIssueDate);
		
		ref2.billIssueDate = "12/1/2024";
		System.out.println(ref2.billIssueDate);
		
		ref2.billIssueDate = "12/12/2023";
		System.out.println(ref2.billIssueDate);
		
		ref2.billIssueDate = "12/11/2023";
		System.out.println(ref2.billIssueDate);
		
		ref2.billIssueDate = "12/10/2023";
		System.out.println(ref2.billIssueDate);
		
		ref2.billIssueDate = "12/09/2023";
		System.out.println(ref2.billIssueDate);
		
		ref2.billIssueDate = "12/08/2023";
		System.out.println(ref2.billIssueDate);
		System.out.println("Bill Issue Date is Ended");
		
		Bill ref3 = new Bill();
		System.out.println("Bill Due Date is Started");
		ref3.billDueDate = "22/5/2024";
		System.out.println(ref3.billDueDate);
		
		ref3.billDueDate = "22/4/2024";
		System.out.println(ref3.billDueDate);
		
		ref3.billDueDate = "22/3/2024";
		System.out.println(ref3.billDueDate);
		
		ref3.billDueDate = "22/2/2024";
		System.out.println(ref3.billDueDate);
		
		ref3.billDueDate = "22/1/2024";
		System.out.println(ref3.billDueDate);
		
		ref3.billDueDate = "22/12/2023";
		System.out.println(ref3.billDueDate);
		
		ref3.billDueDate = "22/11/2023";
		System.out.println(ref3.billDueDate);
		
		ref3.billDueDate = "22/10/2023";
		System.out.println(ref3.billDueDate);
		
		ref3.billDueDate = "22/09/2023";
		System.out.println(ref3.billDueDate);
		
		ref3.billDueDate = "22/08/2023";
		System.out.println(ref3.billDueDate);
		System.out.println("Bill Due Date is Ended");
		
		Bill ref4 = new Bill();
		System.out.println("Bill Paid is started");
		ref4.isBillPaid = false;
		System.out.println(ref4.isBillPaid);
		
		ref4.isBillPaid = true;
		System.out.println(ref4.isBillPaid);
		
		ref4.isBillPaid = true;
		System.out.println(ref4.isBillPaid);
		
		ref4.isBillPaid = true;
		System.out.println(ref4.isBillPaid);
		
		ref4.isBillPaid = true;
		System.out.println(ref4.isBillPaid);
		
		ref4.isBillPaid = true;
		System.out.println(ref4.isBillPaid);
		
		ref4.isBillPaid = true;
		System.out.println(ref4.isBillPaid);
		
		ref4.isBillPaid = true;
		System.out.println(ref4.isBillPaid);
		
		ref4.isBillPaid = true;
		System.out.println(ref4.isBillPaid);
		
		ref4.isBillPaid = true;
		System.out.println(ref4.isBillPaid);
		System.out.println("Bill Paid is Ended");
		
		Bill ref5 = new Bill();
		System.out.println("Latest Bill is started");
		ref5.isLatestBill = true;
		System.out.println(ref5.isLatestBill);
		
		ref5.isLatestBill = true;
		System.out.println(ref5.isLatestBill);
		
		ref5.isLatestBill = true;
		System.out.println(ref5.isLatestBill);
		
		ref5.isLatestBill = true;
		System.out.println(ref5.isLatestBill);
		
		ref5.isLatestBill = true;
		System.out.println(ref5.isLatestBill);
		
		ref5.isLatestBill = true;
		System.out.println(ref5.isLatestBill);
		
		ref5.isLatestBill = true;
		System.out.println(ref5.isLatestBill);
		
		ref5.isLatestBill = true;
		System.out.println(ref5.isLatestBill);
		
		ref5.isLatestBill = true;
		System.out.println(ref5.isLatestBill);
		
		ref5.isLatestBill = true;
		System.out.println(ref5.isLatestBill);
		System.out.println("Latest Bill is Ended");
		
		Bill ref6 = new Bill();
		System.out.println("Final Bill Started");
		ref6.isFinalBill = true;
		System.out.println(ref6.isFinalBill);
		
		ref6.isFinalBill = false;
		System.out.println(ref6.isFinalBill);
		
		ref6.isFinalBill = false;
		System.out.println(ref6.isFinalBill);
		
		ref6.isFinalBill = false;
		System.out.println(ref6.isFinalBill);
		
		ref6.isFinalBill = false;
		System.out.println(ref6.isFinalBill);
		
		ref6.isFinalBill = false;
		System.out.println(ref6.isFinalBill);
		
		ref6.isFinalBill = false;
		System.out.println(ref6.isFinalBill);
		
		ref6.isFinalBill = false;
		System.out.println(ref6.isFinalBill);
		
		ref6.isFinalBill = false;
		System.out.println(ref6.isFinalBill);
		
		ref6.isFinalBill = false;
		System.out.println(ref6.isFinalBill);
		System.out.println("Final Bill Ended");
		
		Bill ref7 = new Bill();
		System.out.println("Bill Amount is Started");
		ref7.billAmount = 256.3;
		System.out.println(ref7.billAmount);
		
		ref7.billAmount = 456.6;
		System.out.println(ref7.billAmount);
		
		ref7.billAmount = 789.5;
		System.out.println(ref7.billAmount);
		
		ref7.billAmount = 1236.5;
		System.out.println(ref7.billAmount);
		
		ref7.billAmount = 963.2;
		System.out.println(ref7.billAmount);
		
		ref7.billAmount = 4563.2;
		System.out.println(ref7.billAmount);
		
		ref7.billAmount = 789.3;
		System.out.println(ref7.billAmount);
		
		ref7.billAmount = 456.2;
		System.out.println(ref7.billAmount);
		
		ref7.billAmount = 741.2;
		System.out.println(ref7.billAmount);
		
		ref7.billAmount = 852.3;
		System.out.println(ref7.billAmount);
		System.out.println("Bill Amount is Ended");
		
		Bill ref8 = new Bill();
		System.out.println("Tax Inclusive is Started");
		ref8.tacInclusiveBill = true;
		System.out.println(ref8.tacInclusiveBill);
		
		ref8.tacInclusiveBill = true;
		System.out.println(ref8.tacInclusiveBill);
		
		ref8.tacInclusiveBill = true;
		System.out.println(ref8.tacInclusiveBill);
		
		ref8.tacInclusiveBill = true;
		System.out.println(ref8.tacInclusiveBill);
		
		ref8.tacInclusiveBill = true;
		System.out.println(ref8.tacInclusiveBill);
		
		ref8.tacInclusiveBill = true;
		System.out.println(ref8.tacInclusiveBill);
		
		ref8.tacInclusiveBill = true;
		System.out.println(ref8.tacInclusiveBill);
		
		ref8.tacInclusiveBill = true;
		System.out.println(ref8.tacInclusiveBill);
		
		ref8.tacInclusiveBill = true;
		System.out.println(ref8.tacInclusiveBill);
		
		ref8.tacInclusiveBill = true;
		System.out.println(ref8.tacInclusiveBill);
		System.out.println("Tax Inclusive is Ended");*/
		
		Bill ref1 = new Bill();
		ref1.billSequenceNo = 2;
		ref1.billReferenceId = 4523;
		ref1.billIssueDate = "14/08/2024";
		ref1.billDueDate = "30/08/2024";
		ref1.isLatestBill = true;
		ref1.isFinalBill = false;
		ref1.isBillPaid = false;
		ref1.billAmount = 588.36;
		ref1.tacInclusiveBill = true;
		System.out.println("Bill generated is started");
		System.out.println("Bill reference Id is " +ref1.billReferenceId);
		System.out.println("Bill sequence No is "+ref1.billSequenceNo);
		System.out.println("Bill Issue Dtae is " +ref1.billIssueDate);
		System.out.println("Bill Due date is " +ref1.billDueDate);
		System.out.println("This is latest bill "+ref1.isLatestBill);
		System.out.println("Is this Final bill " +ref.isFinalBill);
		System.out.println("Is the bill amount is paid " +ref1.isBillPaid);
		System.out.println("Bill amount is " +ref1.billAmount);
		System.out.println("Is Bill include Tax Amount " +ref1.tacInclusiveBill);
		System.out.println("Bill generated is Ended");
		
		Bill ref2 = new Bill();
		ref2.billSequenceNo = 3;
		ref2.billReferenceId = 78965;
		ref2.billIssueDate = "14/09/2024";
		ref2.billDueDate = "30/09/2024";
		ref2.isLatestBill = true;
		ref2.isFinalBill = false;
		ref2.isBillPaid = false;
		ref2.billAmount = 963.36;
		ref2.tacInclusiveBill = true;
		System.out.println("Bill generated is started");
		System.out.println("Bill reference Id is " +ref2.billReferenceId);
		System.out.println("Bill sequence No is "+ref2.billSequenceNo);
		System.out.println("Bill Issue Dtae is " +ref2.billIssueDate);
		System.out.println("Bill Due date is " +ref2.billDueDate);
		System.out.println("This is latest bill "+ref2.isLatestBill);
		System.out.println("Is this Final bill " +ref2.isFinalBill);
		System.out.println("Is the bill amount is paid " +ref2.isBillPaid);
		System.out.println("Bill amount is " +ref2.billAmount);
		System.out.println("Is Bill include Tax Amount " +ref2.tacInclusiveBill);
		System.out.println("Bill generated is Ended");
		
		Bill ref3 = new Bill();
		ref3.billSequenceNo = 4;
		ref3.billReferenceId = 45621;
		ref3.billIssueDate = "14/10/2024";
		ref3.billDueDate = "30/10/2024";
		ref3.isLatestBill = true;
		ref3.isFinalBill = false;
		ref3.isBillPaid = false;
		ref3.billAmount = 654.36;
		ref3.tacInclusiveBill = true;
		System.out.println("Bill generated is started");
		System.out.println("Bill reference Id is " +ref3.billReferenceId);
		System.out.println("Bill sequence No is "+ref3.billSequenceNo);
		System.out.println("Bill Issue Dtae is " +ref3.billIssueDate);
		System.out.println("Bill Due date is " +ref3.billDueDate);
		System.out.println("This is latest bill "+ref3.isLatestBill);
		System.out.println("Is this Final bill " +ref3.isFinalBill);
		System.out.println("Is the bill amount is paid " +ref3.isBillPaid);
		System.out.println("Bill amount is " +ref3.billAmount);
		System.out.println("Is Bill include Tax Amount " +ref3.tacInclusiveBill);
		System.out.println("Bill generated is Ended");
		
		Bill ref4 = new Bill();
		ref4.billSequenceNo = 5;
		ref4.billReferenceId = 8741;
		ref4.billIssueDate = "14/11/2024";
		ref4.billDueDate = "30/11/2024";
		ref4.isLatestBill = true;
		ref4.isFinalBill = false;
		ref4.isBillPaid = false;
		ref4.billAmount = 753.36;
		ref4.tacInclusiveBill = true;
		System.out.println("Bill generated is started");
		System.out.println("Bill reference Id is " +ref4.billReferenceId);
		System.out.println("Bill sequence No is "+ref4.billSequenceNo);
		System.out.println("Bill Issue Dtae is " +ref4.billIssueDate);
		System.out.println("Bill Due date is " +ref4.billDueDate);
		System.out.println("This is latest bill "+ref4.isLatestBill);
		System.out.println("Is this Final bill " +ref4.isFinalBill);
		System.out.println("Is the bill amount is paid " +ref4.isBillPaid);
		System.out.println("Bill amount is " +ref4.billAmount);
		System.out.println("Is Bill include Tax Amount " +ref4.tacInclusiveBill);
		System.out.println("Bill generated is Ended");
		
		Bill ref5 = new Bill();
		ref5.billSequenceNo = 6;
		ref5.billReferenceId = 9512;
		ref5.billIssueDate = "14/12/2024";
		ref5.billDueDate = "30/12/2024";
		ref5.isLatestBill = true;
		ref5.isFinalBill = false;
		ref5.isBillPaid = false;
		ref5.billAmount = 842.36;
		ref5.tacInclusiveBill = true;
		System.out.println("Bill generated is started");
		System.out.println("Bill reference Id is " +ref5.billReferenceId);
		System.out.println("Bill sequence No is "+ref5.billSequenceNo);
		System.out.println("Bill Issue Dtae is " +ref5.billIssueDate);
		System.out.println("Bill Due date is " +ref5.billDueDate);
		System.out.println("This is latest bill "+ref5.isLatestBill);
		System.out.println("Is this Final bill " +ref5.isFinalBill);
		System.out.println("Is the bill amount is paid " +ref5.isBillPaid);
		System.out.println("Bill amount is " +ref5.billAmount);
		System.out.println("Is Bill include Tax Amount " +ref5.tacInclusiveBill);
		System.out.println("Bill generated is Ended");
		
		Bill ref6 = new Bill();
		ref6.billSequenceNo = 7;
		ref6.billReferenceId = 7536;
		ref6.billIssueDate = "14/1/2025";
		ref6.billDueDate = "30/1/2025";
		ref6.isLatestBill = true;
		ref6.isFinalBill = false;
		ref6.isBillPaid = false;
		ref6.billAmount = 956.36;
		ref6.tacInclusiveBill = true;
		System.out.println("Bill generated is started");
		System.out.println("Bill reference Id is " +ref6.billReferenceId);
		System.out.println("Bill sequence No is "+ref6.billSequenceNo);
		System.out.println("Bill Issue Dtae is " +ref6.billIssueDate);
		System.out.println("Bill Due date is " +ref6.billDueDate);
		System.out.println("This is latest bill "+ref6.isLatestBill);
		System.out.println("Is this Final bill " +ref6.isFinalBill);
		System.out.println("Is the bill amount is paid " +ref6.isBillPaid);
		System.out.println("Bill amount is " +ref6.billAmount);
		System.out.println("Is Bill include Tax Amount " +ref6.tacInclusiveBill);
		System.out.println("Bill generated is Ended");
		
		Bill ref7 = new Bill();
		ref7.billSequenceNo = 8;
		ref7.billReferenceId = 8632;
		ref7.billIssueDate = "14/2/2025";
		ref7.billDueDate = "30/2/2025";
		ref7.isLatestBill = true;
		ref7.isFinalBill = false;
		ref7.isBillPaid = false;
		ref7.billAmount = 851.36;
		ref7.tacInclusiveBill = true;
		System.out.println("Bill generated is started");
		System.out.println("Bill reference Id is " +ref7.billReferenceId);
		System.out.println("Bill sequence No is "+ref7.billSequenceNo);
		System.out.println("Bill Issue Dtae is " +ref7.billIssueDate);
		System.out.println("Bill Due date is " +ref7.billDueDate);
		System.out.println("This is latest bill "+ref7.isLatestBill);
		System.out.println("Is this Final bill " +ref7.isFinalBill);
		System.out.println("Is the bill amount is paid " +ref7.isBillPaid);
		System.out.println("Bill amount is " +ref7.billAmount);
		System.out.println("Is Bill include Tax Amount " +ref7.tacInclusiveBill);
		System.out.println("Bill generated is Ended");
		
		Bill ref8 = new Bill();
		ref8.billSequenceNo = 9;
		ref8.billReferenceId = 3698;
		ref8.billIssueDate = "14/3/2025";
		ref8.billDueDate = "30/3/2025";
		ref8.isLatestBill = true;
		ref8.isFinalBill = false;
		ref8.isBillPaid = false;
		ref8.billAmount = 853.36;
		ref8.tacInclusiveBill = true;
		System.out.println("Bill generated is started");
		System.out.println("Bill reference Id is " +ref8.billReferenceId);
		System.out.println("Bill sequence No is "+ref8.billSequenceNo);
		System.out.println("Bill Issue Dtae is " +ref8.billIssueDate);
		System.out.println("Bill Due date is " +ref8.billDueDate);
		System.out.println("This is latest bill "+ref8.isLatestBill);
		System.out.println("Is this Final bill " +ref8.isFinalBill);
		System.out.println("Is the bill amount is paid " +ref8.isBillPaid);
		System.out.println("Bill amount is " +ref8.billAmount);
		System.out.println("Is Bill include Tax Amount " +ref8.tacInclusiveBill);
		System.out.println("Bill generated is Ended");
	}
}
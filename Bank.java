class Bank{
	int id;
	String name;
	String branchName;
	String ifscCode;
	String swiftCode;
	int noOfWorker;
	String branchManager;
	
	public Bank(){
		System.out.println("Bank details created");
	}
	public Bank(int id,String name,String branchName,String ifscCode,String swiftCode,int noOfWorker,String branchManager){
		this.id=id;
		this.name=name;
		this.branchName=branchName;
		this.ifscCode=ifscCode;
		this.swiftCode=swiftCode;
		this.noOfWorker=noOfWorker;
		this.branchManager=branchManager;
	}
	public void displayDetails(){
		System.out.println("Bank ID is "+id);
		System.out.println("Bank Branch Name is "+branchName);
		System.out.println("Bank IFSC code is "+ifscCode);
		System.out.println("Bank Swift code is "+swiftCode);
		System.out.println("Number of worker working is the bank "+noOfWorker);
		System.out.println("Branch Manager name is "+branchManager);
	}
}
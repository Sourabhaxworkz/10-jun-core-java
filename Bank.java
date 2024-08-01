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
}
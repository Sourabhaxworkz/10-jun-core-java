class InsurancePackageRunner{
	public static void main(String[] args){
		System.out.println("Main started");
			String name = "Hdfc life insurance"; //, "Hdfc life insurance" , "PNB Life" , "ICIC Life" , "SBI Smart Shield" , "LIC" , "Bajaj Allianz Life  Insurance" , "Tata Life Insurance" , "Kotak Mahindra Life  Insurance" , "Aditya Birla Sun Life Insurance" , "ING VYSYA LIFE INSURANCE" , "Reliance Nippon Life  Insurance" , "Canara HSBC Oriental Bank of Commerce Life  Insurance" , "Bharti AXA Life  Insurance" , "Aviva Life  Insurance"};
			double price = InsurancePackage.search(name);
			System.out.println("The price for life insurance is:" +price);
				/*for(String name : names){
				System.out.pritnln(name);
			}*/
		System.out.println("Main ended");
	}
}
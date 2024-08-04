class BankRunner{
	public static void main(String[] args){
		Bank ref = new Bank(1,"AXIS BANK","BTM LAYOUT","UTIB0001615","SWIFT Code Axis Bank", 6 ,"sdfghj");
		Bank ref1 = new Bank(2,"BANK OF BARODA (BOB)","HAVERI BR-KARNATAKA","BARB0HAVERI","SWIFT Code Bank of Baroda (BOB)",7,"asdfgh");
		Bank ref2 = new Bank(3,"CANARA BANK","NAPOKLU","CNRB0000554","SWIFT Code Canara Bank",5,"sdfghj");
		Bank ref3 = new Bank(4,"STATE BANK OF INDIA (SBI)","KOTHATHI","SBIN0040172","SWIFT Code State Bank of India (SBI)",6,"sdfghj");
		Bank ref4 = new Bank(5,"HDFC BANK","CHANNARAYAPATNA","HDFC0002998","SWIFT Code HDFC Bank",6,"sdfghj");
		Bank ref5 = new Bank(6,"ICICI BANK","BANGALORE M-G-ROAD","ICIC0006561","SWIFT Code ICICI Bank",6,"sdfghj");
		Bank ref6 = new Bank(7,"PUNJAB NATIONAL BANK (PNB)","KOPPAL","PUNB0988600","SWIFT Code Punjab National Bank (PNB)",6,"sdfghj");
		Bank ref7 = new Bank(8,"UNION BANK OF INDIA","DHARWAD","UBIN0536580","SWIFT Code Union Bank of India",6,"sdfghj");
		
		ref.displayDetails();
		ref1.displayDetails();
		ref2.displayDetails();
		ref3.displayDetails();
		ref4.displayDetails();
		ref5.displayDetails();
		ref6.displayDetails();
		ref7.displayDetails();
	}
}
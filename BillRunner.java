class BillRunner{
	public static void main(String[] args){
		Bill ref = new Bill(1 , 4789 , "14/07/2024","31/07/2024",true,false,false,478.36,true);
		Bill ref1 = new Bill(2 , 4658 , "14/08/2024","31/08/2024",true,false,false,563.36,true);
		Bill ref2 = new Bill(3 , 4568 , "14/09/2024","31/09/2024",true,false,false,598.56,true);
		Bill ref3 = new Bill(4 , 7896 , "14/10/2024","30/10/2024",true,false,false,785.45,true);
		Bill ref4 = new Bill(5 , 7854 , "14/11/2024","30/10/2024",true,false,false,563.36,true);
		Bill ref5 = new Bill(6 , 7456 , "14/12/2024","30/10/2024",true,false,false,563.36,true);
		Bill ref6 = new Bill(7 , 4569 , "14/1/2024","30/10/2024",true,false,false,563.36,true);
		Bill ref7 = new Bill(8 , 1596 , "14/2/2024","30/2/2024",true,false,false,563.36,true);
		
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
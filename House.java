class House{
	String houseID;
	int noOfRooms;
	int noOfFloors;
	String houseName;
	String areaInSqrt;
	int noOfMembers;
	
	public House(){
		System.out.println("House details created");
	}
	public House(String houseID,int noOfRooms,int noOfFloors,String houseName,String areaInSqrt,int noOfMembers){
		this.houseID = houseID;
		this.noOfRooms=noOfRooms;
		this.noOfFloors=noOfFloors;
		this.houseName=houseName;
		this.areaInSqrt=areaInSqrt;
		this.noOfMembers=noOfMembers;
	}
	public void displayDetails(){
		System.out.println("House ID is " +houseID);
		System.out.println("Number of rooms available is " +noOfRooms);
		System.out.println("Number of Floors available is "+noOfFloors);
		System.out.println("House Name is "+houseName);
		System.out.println("House areaInSqrt "+areaInSqrt);
		System.out.println("Number of Members "+noOfMembers);
	}
}
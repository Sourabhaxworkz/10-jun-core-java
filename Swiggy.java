class Swiggy{
	static String hotelName = "HooHalli";
	static String nonVegStarters[] = {"Egg Munchuria" , "Egg Spring Rolls" , "Chilly Chicken" , "Chicken65" , "Lemon Chicken" , "Ginger Fish" , "Chicken555" , "Chicken Majestic" , "Peper Chicken" , "Soya Chicken"};
	static String vegStarters[] = {"Crispy Corn" , "Veg Shangrila" , "Dragon Vegtables" , "Veg Manchuria" , "Crispy Veg" , "Veg Spring Roll" , "Chilly Gobi" , "Mushroom PeperDry" , "Panner 65" , "Chilly Panner" , "Gobi Munchiria"};
	static String nonVegMainCourses[] = {"Chicken Stir Fried Veg" , "Chicken Chow Mushroom" , "Chicken Biriyani" , "Chicken Chow Cashew Nutes" , "Chicken Sweet and Saur" , "Chicken Chow Baby Corn" , "Chicken Curry" , "Chicken Masala" , "Mutton Curry" , "Mutton Masala"};
	static String vegMainCourses[] = {"PaneerTikka Butter Masala" , "Paneer Butter Masala" , "Mushroom Masala" , "Mushroom Karahi" , "Palak Paneer" , "Chana Masala" , "Dal Tadka" , "Dal Handi" , "Dum Aloo" , "MixVege"};
	public static void main(String[] itemstodelivery){
		System.out.println("Main Started");
			for(String nonVegMainCourse : nonVegMainCourses){
				System.out.println(nonVegMainCourse);
			}
				for(String vegMainCourse : vegMainCourses){
				System.out.println(vegMainCourse);
			}
				for(String nonVegStarter : nonVegStarters){
					System.out.println(nonVegStarter);
				}
					for(String vegStarter : vegStarters){
						System.out.println(vegStarter);
					}
				//System.out.println("Non Veg Starters list are :" +nonVegStarters[0]+ " \n " +nonVegStarters[1]+ " \n " +nonVegStarters[2]+ " \n " +nonVegStarters[3]+ " \n " +nonVegStarters[4]+ " \n " +nonVegStarters[5]+ " \n " +nonVegStarters[6]+ " \n " +nonVegStarters[7]+ " \n " +nonVegStarters[8]+ " \n " +nonVegStarters[9]);
				//System.out.println("Veg Starters Menu list are :" +vegStarters[0]+ " \n " +vegStarters[1]+ " \n " +vegStarters[2]+ " \n " +vegStarters[3]+ " \n " +vegStarters[4]+ " \n " +vegStarters[5]+ " \n " +vegStarters[6]+ " \n " +vegStarters[7]+ " \n " +vegStarters[8]+ " \n " +vegStarters[9]);
				//System.out.println("Non Veg Main Courses Menu list are :" +nonVegMainCourses[0]+ " \n " +nonVegMainCourses[1]+ " \n " +nonVegMainCourses[2]+ " \n " +nonVegMainCourses[3]+ " \n " +nonVegMainCourses[4]+ " \n " +nonVegMainCourses[5]+ " \n " +nonVegMainCourses[6]+ " \n " +nonVegMainCourses[7]+ " \n " +nonVegMainCourses[8]+ " \n " +nonVegMainCourses[9]);
				//System.out.println("Veg Main Courser Menu list are :" +vegMainCourses[0]+ " \n " +vegMainCourses[1]+ " \n " +vegMainCourses[2]+ " \n " +vegMainCourses[3]+ " \n " +vegMainCourses[4]+ " \n " +vegMainCourses[5]+ " \n " +vegMainCourses[6]+ " \n " +vegMainCourses[7]+ " \n " +vegMainCourses[8]+ " \n " +vegMainCourses[9]);
		System.out.println("Main Ended");
	}
}
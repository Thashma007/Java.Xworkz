class FoodItem{
	public static String menu(String[] fooditems){
		System.out.println("Invoked food items");
		System.out.println(fooditems.length);
		for(int Index=0;Index<fooditems.length;Index++)
		{
			System.out.println(fooditems[Index]);
		}
		
		System.out.println("Invoked first item");
		return fooditems[0];
	}
}
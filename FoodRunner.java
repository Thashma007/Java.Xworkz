class FoodRunner{
	public static void main(String[] values){
		String[] items={"Biryani","KFC","Pizza","Soup"};
		String food=FoodItem.menu(items);
		System.out.println(food);
	}
}
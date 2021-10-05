class Bottle{
	public static void storing(int price,String color,int height,String quality,String[] brands)
	{
		System.out.println("Invoked Bottle");
		System.out.println("Price of Bottle:"+price);
		System.out.println("Color of Bottle:"+color);
		System.out.println("Height of Bottle:"+height);
		System.out.println("Quality of the Bottle:"+quality);
		
		System.out.println("Brands of Bottle:");
		for(int IndexBottle=0;IndexBottle<brands.length;IndexBottle++)
		{
			String bottle=brands[IndexBottle];
			System.out.println(bottle);
		}
		
	}
}
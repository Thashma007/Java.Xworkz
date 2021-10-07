class InverterRunner{
	public static void main(String[] values)
	{
		Inverter inver=new Inverter();
		System.out.println(inver.name);
		System.out.println(inver.price);
		System.out.println(inver.capacity);
		System.out.println(inver.color);
		System.out.println(inver.weight);
		
		inver.name="Luminous";
		inver.price=25000;
		inver.color="White";
		System.out.println(inver.name);
		System.out.println(inver.price);
		System.out.println(inver.capacity);
		System.out.println(inver.color);
		System.out.println(inver.weight);
		
		
	}
}
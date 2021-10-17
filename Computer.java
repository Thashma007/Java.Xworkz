class Computer{

	String brand="DELL";
	String modelNo;
	float price;
	int quantity=3;
	ComputerType type=ComputerType.DESKTOP;
	static double totalOfAll;

	void displayDetails()
	{
		System.out.println("Invoked display details");
		System.out.println(this.brand);
		System.out.println(this.modelNo);
		System.out.println(this.price);
		System.out.println(this.quantity);
		System.out.println(this.type);
	}
	void displayTotalPrice()
	{
		System.out.println("invoked displayTotalPrice");
		double totalPrice=this.price*this.quantity;
		System.out.println(totalPrice);
		Computer.totalOfAll=Computer.totalOfAll+totalPrice;
	}
	void displayTotalOfAll()
	{
		System.out.println("Invoked display total of all");
		System.out.println(Computer.totalOfAll);
	}



} 
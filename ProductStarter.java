class ProductStarter{                         
	public static void main(String[] food)
	{
		Product product=new Product(454.4f,2,"Furnitures");
		product.displayDetails();
		product.displayTotalPrice();
		Product product1=new Product(890.25f,1,"Cars");
		product1.isiMark=true;
		product1.displayDetails();
		product1.displayTotalPrice();
		Product product2=new Product(255.0f,3,"Computers");
		product2.displayDetails();
		product2.displayTotalPrice();
		Product product3=new Product(440.0f,3,"Groceries");
		product3.displayTotalPrice();
		Product product4=new Product(550.0f,1,"Mobile");
		product4.displayTotalPrice();
	}

} 
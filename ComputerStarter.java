class ComputerStarter{
	public static void main(String[] sunday)
	{
		Computer computer1=new Computer();
		computer1.modelNo="py34w4";
		computer1.price=456.9f;
		computer1.displayDetails();
		computer1.displayTotalPrice();
		computer1.displayTotalOfAll();

		Computer computer2=new Computer();
		computer2.brand="HP";
		computer2.modelNo="Ise435";
		computer2.price=563.7f;
		computer2.quantity=2;
		computer2.type=ComputerType.ANALOG;
		computer2.displayDetails();
		computer2.displayTotalPrice();
		computer2.displayTotalOfAll();

		Computer computer3=new Computer();
		computer3.modelNo="ce3061";
		computer3.price=256.5f;
		computer3.type=ComputerType.HYBRID;
		computer3.displayDetails();
		computer3.displayTotalPrice();
		computer3.displayTotalOfAll();

		Computer computer4=new Computer();
		computer4.modelNo="DH5679";
		computer4.price=706.50f;
		computer4.type=ComputerType.MICRO;
		computer4.quantity=4;
		computer4.displayDetails();
		computer4.displayTotalPrice();
		computer4.displayTotalOfAll();

		Computer computer5=new Computer();
		computer5.modelNo="XP-9765";
		computer5.price=62.25f;
		computer5.type=ComputerType.SUPERCOMPUTER;
		computer5.quantity=5;
		computer5.displayDetails();
		computer5.displayTotalPrice();
		computer5.displayTotalOfAll(); 

	}
} 
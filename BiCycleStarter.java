class BiCycleStarter{
	public static void main(String[] food)
	{
		BiCycle cycle=new BiCycle("black",1435.89f,"Herculesss"); 
		cycle.brake();
		cycle.move();
		cycle.displayDetails();
		cycle.price=1345.7f;
		cycle.color="blue";
		cycle.brand="Hero";
		cycle.displayDetails();
	}
} 
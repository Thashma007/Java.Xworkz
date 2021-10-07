class FishTrainChargerRunner{
public static void main(String[] args)
{
	System.out.println("MAIN INVOKED");
	Fish fish=new Fish();
	System.out.println(fish.price);
	System.out.println(fish.kilo);
	System.out.println(fish.length);
	System.out.println(fish.name);
	System.out.println(fish.color);
	
	
	fish.price=200;
	fish.kilo=6;
	fish.length=9;
	fish.name="GoldFish";
	fish.color="Gold";
	System.out.println(fish.price);
	System.out.println(fish.kilo);
	System.out.println(fish.length);
	System.out.println(fish.name);
	System.out.println(fish.color);
	
	
	
	System.out.println("*******************");
	
	Train train=new Train();
	System.out.println(train.name);
	System.out.println(train.price);
	System.out.println(train.ticketNo);
	System.out.println(train.color);
	
	train.name="Shatabdhi Express";
	train.price=250;
	train.ticketNo=2345;
	train.color="Blue";
	System.out.println(train.name);
	System.out.println(train.price);
	System.out.println(train.ticketNo);
	System.out.println(train.color);
	
	
	
	System.out.println("**********************");
	
	Charger charge=new Charger();
	System.out.println(charge.company);
	System.out.println(charge.cost);
	System.out.println(charge.color);
	System.out.println(charge.length);
	
	charge.company="MI";
	charge.cost=450;
	charge.color="Black";
	charge.length=4.5f;
	System.out.println(charge.company);
	System.out.println(charge.cost);
	System.out.println(charge.color);
	System.out.println(charge.length);
	
}
}
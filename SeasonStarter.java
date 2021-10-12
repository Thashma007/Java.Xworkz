class SeasonStarter
	{
	public static void main(String[] value)
	{
	Season season=new Season("Winter","Mysore");
	String seasonName="AUTUMN";
	System.out.println(seasonName);
	int noOfSeasons=5;
	System.out.println(noOfSeasons);
	
	short humidity=980;
	System.out.println(humidity);
	float weatherForecast=765.09f;
	System.out.println(weatherForecast);
	String location="Banglore";
	System.out.println(location);
	float pressure=980.5f;
	System.out.println(pressure);
	
	Season seasons=new Season();
	System.out.println(seasons);
	
	SeasonName name=SeasonName.SPRING;
	System.out.println(name);
	
	SeasonName name1=SeasonName.RAINY;
	System.out.println(name1);
	}
	} 
	
	

class Season
{
	String seasonName;
	int noOfSeasons;
	float weatherForecast ;
	float pressure;
	short humidity;
	String location;
	Season(String seasonName,String location)
	{
		System.out.println("Invoked Season name:"+seasonName);
		System.out.println("Invoked location:"+location);
		this.seasonName=seasonName;
		this.location=location;	
	}
	Season(float weatherForecast,float pressure)
	{
		System.out.println("Invoked weather forecast:"+weatherForecast);
		System.out.println("Invoked pressure:"+pressure);
		this.weatherForecast=weatherForecast;
		this.pressure=pressure;

	}
	Season(int noOfSeasons)
	{
		this();
		System.out.println("Invoked no of seasons:"+noOfSeasons);
		this.noOfSeasons=noOfSeasons;
	}
	Season(short humidity)
	{
		System.out.println("Invoked Humidity:"+humidity);
		this.humidity=humidity;
	}
	Season()
	{
		System.out.println("INVOKED SEASONS");
	}

} 
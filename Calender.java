class Calendar{
	public static int getBirthMOnth(String personName){
		if(personName=="Sanju"){
			System.out.println("Birthday Month is INVOKED");
			int month=6;
			return month;
		}
		else if(personName=="Thashma"){
			System.out.println("Birthday Month is INVOKED");
			int month1=2;
			return month1;
		}
		else if(personName=="Avi"){
			System.out.println("Birthday Month is INVOKED");
			int month2=3;
			return month2;
		}
		else
		{
			System.out.println("Month not found!!!");
			return 0;
		}
	}
	
    public static String getBirthDay(String personName){
		if(personName=="Sanju"){
			System.out.println("Birth day is INVOKED");
			String day="MONDAY";
			return day;
		}
		else if(personName=="Thashma"){
			System.out.println("Birth day is INVOKED");
			String day1="SUNDAY";
			return day1;
		}
		else if(personName=="Avi"){
			System.out.println("Birth day is INVOKED");
			String day2="WEDNESDAY";
			return day2;
		}
		else
		{
			System.out.println("NOT found!!!");
			String day3="DAY NOT FOUND!!";
			return day3;
		}
	}
	

}
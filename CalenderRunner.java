class CalenderRunner{
	public static void main (String[] values){
		String  name="Thashma";
		//Calender.getBirthMonth(name);
		int val=Calender.getBirthMonth(name);
		System.out.println(val);
		
		String  value="Avi";
		Calender.getBirthDay(value);
		String birth=Calender.getBirthDay(value);
		System.out.println(birth);
	}
}
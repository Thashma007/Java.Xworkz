class Converter{
 public static void quantityOfRice (String[] values)
  {
	 String quantityOfRice="25";
	 int convertedQuantityOfRice=Integer.parseInt(quantityOfRice);
	 System.out.println("quantityOfRice: "+convertedQuantityOfRice);
  }
  public static void pincode (String[] values)
  {
	 String pincode="57123";
	 int convertedPincode=Integer.parseInt(pincode);
	 System.out.println("pincode: "+convertedPincode);
  }
   public static void date (String[] values)
  {
	 String date="30";
	 int convertedDate=Integer.parseInt(date);
	 System.out.println("date: "+convertedDate);
  }
   public static void phoneNo (String[] values)
  {
	 String phoneNo="99945420";
	 long convertedPhoneNo=Long.parseLong(phoneNo);
	 System.out.println("phoneNo: "+convertedPhoneNo);
  }
   public static void idNumber (String[] values)
  {
	 String idNumber="103";
	 short convertedIdNumber=Short.parseShort(idNumber);
	 System.out.println("idNumber:"+convertedIdNumber);
  }
   public static void voltage (String[] values)
  {
	 String voltage="true";
	 boolean convertedvoltage=Boolean.parseBoolean(voltage);
	 System.out.println("voltage: "+convertedvoltage);
  }
   public static void salary (String[] values)
  {
	 String salary="4567.25";
	 float convertedsalary=Float.parseFloat(salary);
	 System.out.println("salary: "+convertedsalary);
  }
   public static void accuracy(String[] values)
  {
	 String accuracy="45345.9981";
	 double convertedAccuracy=Double.parseDouble(accuracy);
	 System.out.println("accuracy: "+convertedAccuracy);
  }
   public static void digit(String[] values)
  {
	 String digit="4";
	 byte convertedDigit=Byte.parseByte(digit);
	 System.out.println("byte: "+convertedDigit);
  }
}
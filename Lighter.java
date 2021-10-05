class Lighter{
	public static boolean onMethod(){
		System.out.println("Invoked On Method");
		boolean onMethod=true;
		return true;
		
	}
	public static boolean offMethod(){
		System.out.println("Invoked Off Method");
		boolean offMethod=false;
		return false;
	}
	public static boolean light(int width){
		System.out.println("Invoked Light");
		if(width>0){
			System.out.println("Width is greater");
			return true;
		}
		else
			System.out.println("Width is smaller");
		    return false;
		
	}
}

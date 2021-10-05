class Ornament{
	public static String designs(String[] types){
		System.out.println("Invoked ornament designs");
		int size=types.length;
		System.out.println(types.length);
		for(int Index=0;Index<size;Index++)
		{
			System.out.println(types[Index]);
		}
		
		System.out.println("Invoked last item");
		return types[size-1];
	}
}

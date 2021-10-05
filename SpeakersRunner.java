class SpeakersRunner{
	public static void main(String[] values){
		int level=4;
		Speakers.volume(level);
		String spk=Speakers.volume(level);
		System.out.println(spk);
		
		boolean value=Speakers.turnOn();
		System.out.println(value);
		//System.out.println(Speakers.turnOn());
		boolean val=Speakers.turnOff();
		System.out.println(val);
		//System.out.println(Speakers.turnOff());
	}
}
class AllTaskRunner

{
public static void main(String[] args)
{
	System.out.println("invoked transformer");
	Transformer transformer=new Transformer();
	System.out.println("exit main");
	
	System.out.println("Robot invoked");
	Robot robot=new Robot();
	System.out.println("main terminated");
		
	HardDisk hard=new HardDisk();
	System.out.println("copy executed");
	
	Motor mot=new Motor();
    System.out.println("motor copy success");
}

}
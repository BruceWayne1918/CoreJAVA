// Thread.sleep() may throw one Exception , InterruptedException
// InterruptedException does not have super class as RuntimeException
// InterruptedException ==> Checked category
// so it need to be handled compulsory at the time of program development
// it is compulsory for a developer to write it into try catch block 


public class Day11_7 {

	public static void main(String[] args) 
	{
		System.out.println("Core java Sunbeam");
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
			System.out.println("Trainer : Dr.Akshita Chanchlani");

	}

}

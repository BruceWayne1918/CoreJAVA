// if we write extends Thread
// first way
// To allocate a new Thread object , we use Thread() constructor
// In this case OS automatically assigns thread name as Thread-0, Thread-1 .....

// second way  
//To allocate a new Thread object , we use Thread(String str) constructor
// in this case Thread name is set as "str" (user defined name will be given to thread)

class Even extends Thread
{
	String name;
	
	Even()
	{
		super();
		start();
	}
	
	Even(String name)
	{
		this.setName(name);
		start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<10;i+=2)
			{
				System.out.println("Even Number = "+i+" Name = "+this.getName());
				Thread.sleep(2500);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}


class Odd extends Thread
{
	String name;
	Odd()
	{
		start();
	}
	
	Odd(String name)
	{
		this.setName(name);
		start();
	}
	
	public void run()
	{
		try
		{
			for(int i=1;i<10;i+=2)
			{
				System.out.println("Odd Number = "+i+" Name = "+this.getName());
				Thread.sleep(3000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

public class Day21_4 {

	public static void main(String[] args)
	{
		Even e1 = new Even("EvenThread"); // Thread Name = EvenThread
		Odd o1 = new Odd("OddThread"); // Thread Name = OddThread
		Even e2 = new Even(); // Thread Name : given by jvm "Thread-2"
		Odd o2 = new Odd();// Thread Name : given by jvm "Thread-3"

	}

}

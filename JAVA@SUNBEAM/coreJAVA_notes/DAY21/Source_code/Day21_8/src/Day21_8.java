// stop() stops the currently running thread
// once thread is stopped it can not be restarted

public class Day21_8 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				System.out.println("Value = "+i+" "+this.getName());
				Thread.sleep(1500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		Day21_8 t1 = new Day21_8();
		Day21_8 t2 = new Day21_8();
		Day21_8 t3 = new Day21_8();
		
		t1.start();
		t2.start();
		t3.start();
		t3.stop();
		
	}

}


/*
//suspend
// it suspend the current thread 
// use resume() method to resume the suspended thread
// suspend() and resume() 

public class Day21_8 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				System.out.println("Value = "+i+" "+this.getName());
				Thread.sleep(1500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		Day21_8 t1 = new Day21_8();
		Day21_8 t2 = new Day21_8();
		Day21_8 t3 = new Day21_8();
		
		t1.start();
		t2.start();
		t2.suspend();
		t3.start();
		//t2.resume();
		
	}

}

*/


/*
// yield 
// This method pauses the execution of current thread
// for other thread executions temporarily

public class Day21_8 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				System.out.println("Value = "+i+" "+this.getName());
				Thread.sleep(1500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args)
	{
		Day21_8 t1 = new Day21_8();
		Day21_8 t2 = new Day21_8();
		
		t1.start();
		t2.start();
		
		try
		{
			t1.yield();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		

	}

}

*/


/*

// Join 
// It causes the current thread to block until
// the second thread terminates or specified amount of miliseconds pass

public class Day21_8 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				System.out.println("Value = "+i+" "+this.getName());
				Thread.sleep(1500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args)
	{
		Day21_8 t1 = new Day21_8();
		Day21_8 t2 = new Day21_8();
		Day21_8 t3 = new Day21_8();
		
		t1.start();
		try
		{
			t1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t2.start();
		t3.start();
		

	}

}

*/

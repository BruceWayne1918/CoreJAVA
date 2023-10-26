class Count implements Runnable
{
	Thread th;
	Count()
	{
		System.out.println("Inside Constructor");
		th = new Thread(this); // converting Runnable object into Thread object
		//such that we can call start() method
		
		th.start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Count = "+i);
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
public class Day21_6 {

	public static void main(String[] args) 
	{
		Count cnt = new Count();
		// cnt is object 
		// cnt is Runnable Object (it means its class implements Runnable interface )
		

	}

}

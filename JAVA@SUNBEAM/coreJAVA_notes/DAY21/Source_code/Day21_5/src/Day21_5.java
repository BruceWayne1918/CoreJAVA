

//If we use implements Runnable  then we can use any of the following constructor
//Thread(Runnable target) : Allocates a new Thread object.
// Thread(Runnable target, String name) : Allocates a new Thread object.



class Count implements Runnable
{
	Thread th;
	Count()
	{
		System.out.println("Inside Constructor");
		th = new Thread(this,"MyThread"); // converting Runnable object into Thread object
		//such that we can call start() method
		System.out.println("Thread name = "+th.getName());
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
public class Day21_5 {

	public static void main(String[] args) 
	{
		Count cnt = new Count();
		// cnt is object 
		// cnt is Runnable Object (it means its class implements Runnable interface )
		

	}

}

package p1;

public class Util 
{
	public static void delay(int milli)
	{
		try
		{
			Thread.sleep(milli);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

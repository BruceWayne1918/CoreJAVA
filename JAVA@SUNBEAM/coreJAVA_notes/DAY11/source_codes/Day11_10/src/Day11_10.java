// checked exception is handled through throws 
//delegation of exception occurs

class Demo
{
	void m1() throws InterruptedException
	{
		System.out.println("Example of checked exception");
		Thread.sleep(4000);
		System.out.println("core java programming");
	}
}

public class Day11_10 {

	public static void main(String[] args) throws InterruptedException
	{
		Demo dobj = new Demo();
		dobj.m1();
	}
}




/*
 // checked exception is handled through try-catch
class Demo
{
	void m1()
	{
		System.out.println("Example of checked exception");
		try 
		{
			Thread.sleep(4000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("core java programming");
	}
}

public class Day11_10 {

	public static void main(String[] args) 
	{
		Demo dobj = new Demo();
		dobj.m1();
	}
}

*/



/*
// checked exception is handled through throws keyword

public class Day11_10 {

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Hello everyone!");
			Thread.sleep(4000);
		System.out.println("Core java sunbeam pune");
	}

}
*/



/*
// checked exception is handled through try-catch block
public class Day11_10 {

	public static void main(String[] args) 
	{
		System.out.println("Hello everyone!");
		try
		{
			Thread.sleep(4000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception is handled");
		}
		System.out.println("Core java sunbeam pune");
	}

}
*/
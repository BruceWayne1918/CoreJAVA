// checked VS Unchecked Exception

// If we don't supply command line argument
// ArrayIndexOutOfBoundsException  ==> super class is RuntimeException
// so it comes in ===> Unchecked category
// have we handled it at the time of application development??  YES
// if exception occurs then our application will handle it
// by going to catch block 


public class Day11_6 {

	public static void main(String[] args)
	{
		try
		{
			String str = args[0];
			System.out.println(str);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please supply command line argument");
		}
	}

}

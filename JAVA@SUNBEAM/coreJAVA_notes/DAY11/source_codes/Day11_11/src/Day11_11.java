import java.util.Scanner;

// user defined exception class
// custom exception
// if user enters number >100 throw one exception (Number is greater)

class NumberIsGreaterException extends Exception
{
	NumberIsGreaterException()
	{
		System.out.println("User exception");
	}
}

public class Day11_11 {

	public static void main(String[] args) 
	{
		try
		{
			int num;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter numeric value :");
			num = sc.nextInt();
			if(num>100)
				throw new NumberIsGreaterException();
			else
				System.out.println("Num = "+num);
			
		}
		catch(NumberIsGreaterException e)
		{
			System.out.println("The number is greater than 100 ");
		}
	}

}

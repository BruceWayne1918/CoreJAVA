import java.util.Scanner;

public class Day11_4 {

	public static void main(String[] args) 
	{
		int num1;
		int num2;
		int result;
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter First number");
			num1 = sc.nextInt();
			System.out.println("Enter Second number");
			num2 = sc.nextInt();
			if(num2 == 0)
				throw new ArithmeticException(); // throwing an exception object explicitly
			else
				{
					result = num1 / num2;
					System.out.println("Result = "+result);
				}			
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Second number can not be zero");
		}

	}

}

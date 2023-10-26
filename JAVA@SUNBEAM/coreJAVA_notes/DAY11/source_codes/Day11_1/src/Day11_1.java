import java.util.Scanner;
// try without catch is ok ? YES , provided we must supply finally block
public class Day11_1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int result;
		try
		{
			System.out.println("Enter First number");
			num1 = sc.nextInt();
			System.out.println("Enter Second number");
			num2 = sc.nextInt();
			result = num1 / num2;
			// throw new ArithemeticException()
			System.out.println("Result = "+result);
		}
		finally
		{
			System.out.println("inside finally block");
		}
		
		
	}

}

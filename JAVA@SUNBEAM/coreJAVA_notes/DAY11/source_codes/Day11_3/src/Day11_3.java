import java.util.Scanner;
//methods of Throwable class

public class Day11_3 {

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
			result = num1 / num2;
			System.out.println("Result = "+result);
		}
		catch(Exception e)
		{
			//System.out.println("Get Cause = "+e.getCause());
			//System.out.println("Get Messege  ="+e.getMessage());
			//System.out.println("Get Localized msg = "+e.getLocalizedMessage());
			//System.out.println("To String = "+e.toString());
			//System.out.println("Print Stack Trace ");
			e.printStackTrace();
		}

	}

}

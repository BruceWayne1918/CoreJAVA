import java.util.Scanner;
// finally block
// some statements that we wish to execute compulsory 
// even if exception have occurred or did not occurred
//we put those statements in finally block

public class Day10_10 {

	public static void main(String[] args) 
	{
		int num1;
		int num2;
		int result;
		Scanner sc = new Scanner(System.in);
		
		try
		{
		
		System.out.println("Enter the first number : ");
		num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		num2 = sc.nextInt();
		
		result = num1/num2;
		System.out.println("Num1 = "+num1+" Num2 = "+num2+" Result = "+result);
		
		
		}
		catch(ArithmeticException e)  //Handler 
		{
			System.out.println("Second number can't be zero!");
		}
		finally
		{
			System.out.println("Inside finally block, Resoruces closed!!");
			sc.close();
			
		}
	}

}

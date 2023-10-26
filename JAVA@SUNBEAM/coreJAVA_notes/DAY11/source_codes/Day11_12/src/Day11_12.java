import java.util.Scanner;

// invalid age 
// if age between 0 to 80  valid age
// invalid age

class InvalidAgeException extends Exception
{
	InvalidAgeException()
	{
		
	}
	InvalidAgeException(String s)
	{
		super(s);
	}
}


public class Day11_12 
{
	
	static void validateAge(int age) throws InvalidAgeException
	{
		if(age>0 && age<80)
			System.out.println("Valid age");
		else
			throw new InvalidAgeException("Age is not valid");
	}
	
	public static void main(String[] args) throws InvalidAgeException
	{
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age :");
		age = sc.nextInt();
		
		validateAge(age);

	}

}

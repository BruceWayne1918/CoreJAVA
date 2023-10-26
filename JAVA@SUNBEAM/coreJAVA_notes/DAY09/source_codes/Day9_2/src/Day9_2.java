import java.util.Scanner;

public class Day9_2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter Number :");
		num = sc.nextInt();
		System.out.println("Number = "+num);
		sc.close(); // it is not compulsory to call close() method
		// if we call close() the warning will go
		
		// if we do not call close() on Scanner object
		// it automatically release the resource on its own at the later stage
		
	}

}

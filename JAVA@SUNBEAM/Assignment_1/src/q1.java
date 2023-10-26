
import java.util.Scanner;


public class q1 {

	public static void main(String[] args) 
	
	{
		Scanner sc = new  Scanner (System.in);
		
		System.out.println("Enter The Number");
		int N = sc.nextInt();
		
		System.out.println("Given Number :"+N);
		
		System.out.println("Binary Equivalent :"+Integer.toBinaryString(N));
	
		System.out.println("Octal Equivalent :"+Integer.toOctalString(N));
		
		System.out.println("Hexadecimal Equivalent :"+Integer.toHexString(N));
		
		
		
		
		

	}

}

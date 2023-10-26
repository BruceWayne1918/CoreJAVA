
import java.util.Scanner;

public class Q2
{
	static void calcAvg(Double D1,Double D2) 
	{
		D2= (D1+D2)/2;
		System.out.println("Average : "+ D2);
	}
	
	public static void main(String args [])
	{
		Scanner sc = new  Scanner (System.in);
		
		double D1 = 0,D2;
		
		System.out.println("Enter First Number");
		
        if (sc.hasNextDouble()) 
        {
            D1 = sc.nextDouble();
           
        } 
        
        else {
            System.out.println("Invalid input. Please enter a valid double value.");
        }
		
		System.out.println("Enter Second Number");
		
		if (sc.hasNextDouble()) 
        {
             D2 = sc.nextDouble();
            
            Q2.calcAvg(D1,D2);
            
        } 
        
        else {
            System.out.println("Invalid input. Please enter a valid double value.");
        }
		
		
	}
}

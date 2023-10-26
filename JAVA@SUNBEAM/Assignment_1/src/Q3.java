
import java.util.Scanner;

public class Q3 {
	
	static int billAmount=0;
	
	public static void main(String[] args) 
	
	
	
	{
		
		 while (true) 
		 
		 {
			 System.out.println("-------------------------------------------------------");
			    System.out.println("Enter The choice");
				System.out.println("");
				System.out.println("1. Dosa__60rs.");
				System.out.println("2. Samosa__20rs.");
				System.out.println("3. Idli__40rs.");
				System.out.println("4. Misal__60rs.");
				System.out.println("5. Katwada__45rs.");
				System.out.println("6. Tea__15rs.");
				System.out.println("7. Cofee__20rs.");
				System.out.println("8. Maggie__25rs.");
				
				System.out.println("");
				System.out.println("9. Generate Bill");
				System.out.println("10. EXIT THE MENU");
				
				int choice = (new Scanner(System.in)).nextInt();

	            switch (choice) 
	            {
	                case 1:
	                case 5:
	                case 4:
	                	billAmount=billAmount+60;
	                    
	                    break;
	                case 2:
	                	billAmount=billAmount+20;
	                    break;
	                
	                case 3:
	                	billAmount=billAmount+40;
	                    break;
	                    
	                case 6:
	                	billAmount=billAmount+15;
	                    break;
	                    
	                case 7:
	                	billAmount=billAmount+20;
	                    break;
	       
	                case 8:
	                	billAmount=billAmount+25;
	                    break;
	                    
	                case 9:
	                	System.out.println("");
	                    System.out.println("Total Billing Amount : "+billAmount+"rs.");
	             
	                    System.exit(0);
	                    
	                case 10:
	                    System.exit(0);
	                    break;
	                    
	                default:
	                    System.out.println("Invalid choice. Please select a valid option.");
		
		
	            	}

		 		}
	}
}

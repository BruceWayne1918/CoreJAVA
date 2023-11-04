package q3.menu;


	
	import java.util.Scanner;

import com.sunbeam.menu;



	public class MyMenu 
	{	

		
		public static themenu myMenu() {
			System.out.println("------------------------------------------------------------------------------------------------");
			
			System.out.println("0 : EXIT");
			System.out.println("1 : Add New Employee");
			System.out.println("2 : Display all books");
			System.out.println("3 : Search Employee by id");
			System.out.println("4 : Delete Employee with id");
			System.out.println("5 : Sort Employees by id (ASC)");
			System.out.println("6 : Sort Employees by Salary(Desc)");
			System.out.println("");
			System.out.println("ENTER THE CHOICE : ");
			
			
			int ch = new Scanner(System.in).nextInt();
			
			return themenu.values()[ch];
			
		}

	}



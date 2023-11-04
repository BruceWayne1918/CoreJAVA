package com.sunbeam.q3;

import java.util.Scanner;



enum menu{
	ADD,DISPLAY,FIND,EXIT;
}

enum Gender { MALE, FEMALE; }

public class Q3

{
	public static menu myMenu() 
	{
		System.out.println("ENTER CHOICE ");
		for (menu m : menu.values()) 
		
		{
			System.out.println((m.ordinal()+1)+" : "+m.name());
		}
		
		int choice = new Scanner(System.in).nextInt()-1;
		
		
		
		menu enumConstant= menu.values()[choice];
		
		return enumConstant;
		
	}
	
	
	public static void main(String[]args) 
	{	
		Scanner sc=new Scanner(System.in);
		
		Person []persons=new Person[3];//null
		
		
		persons[0]=new Person("raj",23,"MAlE");
		persons[1]=new Person("ptya",33,"FEmalE");
		persons[2]=new Person("rajdeep",23,"MaLE");
		
		
		 
		
		while(true)
		{
			menu m =myMenu();
			
			switch(m) 
			
			{
			
			case ADD:
				
				
				for(Person each:persons)
				{
					each.accept();
				
				}
				break;
				
			case DISPLAY:
				
				int a=1;
				for(Person each:persons)
				{
					System.out.println("-------------------------------------------------------------------------");
					System.out.println("PERSON "+a);
					System.out.println("");
					System.out.println(each);
					System.out.println("");
				a++;}
				
				break;
				
			case FIND:
				System.out.println("----------------------------------------------------------------------------");
				System.out.println("ENTER NAME TO FIND PERSON");
				String name=sc.nextLine();
				System.out.println("----------------------------------------------------------------------------");
				
				for (Person each : persons) {
					if(each.getName().toUpperCase().equalsIgnoreCase(name))
					{
						System.out.println(each);
						System.out.println("");
						break;
					}
					System.out.println("NO PERSON FOUND ! ");
					
					
				}
				
				
				break;
				
			case EXIT:
				break;
				
				
			}
			
			if(m.name()=="EXIT")
			{
				break;
				
			}
			
		
		}
		
		
	}

}
/*for (MenuOption option : MenuOption.values()) {
                System.out.println(option.ordinal() + 1 + ". " + option);
            }
 * */

/*Declare an enum for Gender (MALE, FEMALE). Create a class Person with ﬁelds name, age and gender. In main(), 
 * create a array of Person. 
 * Write a menu
driven program (using enum), to add new person, display all people, ﬁnd a person by name.
*/

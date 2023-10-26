package com.sunbeam.fruit;

import java.util.Scanner;

public class FruitBasket {
	
	public static int menu() {
		int choice=0;
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("0 : Exit");
		System.out.println("1 : Add Mango");
		System.out.println("2 : Add Orange");
		System.out.println("3 : Add Apple");
		System.out.println("4 : Display names of all fruits in the basket");
		System.out.println("5 : Display Details of all Fruits");
		System.out.println("6 : Display tastes of all stale fruits in the basket");
		System.out.println("7 : Mark a fruit as stale");
		System.out.println("8 : Mark all sour fruits stale");
		choice=new Scanner(System.in).nextInt();
		
		return choice;
	}

	public static void main(String[] args) {
		
		System.out.println("Enter The Basket Size : ");
		int size=new Scanner(System.in).nextInt();
		
		Fruit []fruits= new Fruit[size];
		int i=0;
		
		while(true)
		{
			int choice=menu();
			
			switch(choice) {
			case 0:
				break;
				
			case 1:
				if(i==fruits.length)
				{
					System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("Basket is full !"); 
					System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
					break;
				}

				fruits[i]=new Mango();
				fruits[i++].accept();
				break;

			case 2:
				if(i==fruits.length)
				{
					System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("Basket is full !"); 
					System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
					break;
				}

				fruits[i]=new Orange();
				fruits[i++].accept();
				break;

			case 3:
				if(i==fruits.length)
				{
					System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("Basket is full !"); 
					System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
					break;
				}

				fruits[i]=new Apple();
				fruits[i++].accept();
				break;
				
			case 4:
				
				for(Fruit each:fruits)
				{
//					System.out.println("");
					System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
					System.out.println(each.dispName());		
				}

				break;

			case 5:
					System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
					for(Fruit each :fruits)
					each.dispDetails();

				break;
				
			case 6:
				for(Fruit each:fruits)
				{
					if((each.condition).contentEquals("STALE"))
					{	
						each.dispDetails();
					}
						
				}
				break;
			case 7:
				break;
			case 8:
				break;
			}
			
			if (choice==0)
				break;
		}
		
		

	}

}

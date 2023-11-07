package com.sunbeam.q2;

import java.util.Scanner;



public class Menu 
{	

	
	public static menu myMenu() {
		System.out.println("------------------------------------------------------------------------------------------------");
		
		System.out.println("0 : EXIT");
		System.out.println("1 : Add new book in Lis");
		System.out.println("2 : Display all books");
		System.out.println("3 : Search a book by isbn");
		System.out.println("5 : Delete a book with isbn");
		System.out.println("4 : Delete a book with index");
		System.out.println("6 : Delete a book with given name");
		System.out.println("7 : Sort books by isbn ascending");
		System.out.println("8 : Sort books by price descending");
		System.out.println("9 : Reverse the list");
		System.out.println("10 : Save books in ﬁle");
		System.out.println("11 : Load books from ﬁle");
		
		System.out.println("");
		System.out.println("ENTER THE CHOICE : ");
		
		
		int ch = new Scanner(System.in).nextInt();
		
		return menu.values()[ch];
		
	}

}

package com.sunbeam.q3.menu;

import java.util.Scanner;

public  class MyMenu {

	public static menu Mymenu()
	{	System.out.println("1. Add new book in list.");
		System.out.println("2. Display all books in forward order.");
		System.out.println("3. Delete book of given id");
		System.out.println("3. Delete book of given id");
		System.out.println("4. Check if book with given isbn is in list or not");
		System.out.println("5. Delete all books in list"); 
		System.out.println("6. Display number of books in list");
		System.out.println("0:EXIT");
		int choice=new Scanner(System.in).nextInt();
		
		return menu.values()[choice];
		
	}
}

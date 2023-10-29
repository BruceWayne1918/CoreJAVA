package com.sunbeam.q1.tester;

import java.util.Scanner;

import com.sunbeam.q1.Album;
import com.sunbeam.q1.Book;
import com.sunbeam.q1.Shop;
import com.sunbeam.q1.Toy;

public class Products {
	
	static int x=0;
	static final Scanner sc =new Scanner(System.in);
	
	public static int menu() {
	System.out.println("0 : EXIT");
	System.out.println("1: ADD BOOK TO CART");
	System.out.println("2: ADD ALBUM TO CART");
	System.out.println("3 : ADD TOY TO CART");
	
	System.out.println("4 : CALCULATE BILL");
	int choice = sc.nextInt();
	
	return choice;
	}
	
	public static void tester(Shop objArr[]) {
		int i = 0;

		while (true) {

			int choice = menu();

			switch (choice) {
			case 1: {
				if (i < 5) {
					objArr[i] = new Book();
					i++;
				} else {
					System.out.println("CART FULL !");
					break;
				}

				break;
			}

			case 2:
				if (i < 5) {
					objArr[i] = new Album();
					i++;
				} else {
					System.out.println("CART FULL !");
					break;
				}

				break;

			case 3:
				if (i < 5) {
					objArr[i] = new Toy();
					i++;
				} else {
					System.out.println("CART FULL !");
					break;
				}
				break;

			case 4:
				System.out.println("--------------------------------------------------------------");
				System.out.println("DISPLAYING DETAILED BILL : ");
				System.out.println("--------------------------------------------------------------");

				for (Shop each : objArr) {
					
					
					double totAmountandTax[] = { 0, 0 };

					if (each instanceof Book) {
						totAmountandTax[0] =each.calcAmount()[0]-Shop.discount;
						System.out.println(
								(x+1)+" | BOOK : TotalAmount = " + totAmountandTax[0] + " TotalTax = " + totAmountandTax[1]);
						System.out.println("--------------------------------------------------------------");
						x=x+1;

					}

					if (each instanceof Album) {
						
						double arr[]=each.calcAmount();
						
						totAmountandTax[0] = arr[0];
//						totAmountandTax[1] = totAmountandTax[1] + each.calcAmount()[1];
						totAmountandTax[1] = arr[1];
						System.out.println(
								(x+1)+" | ALBUM : TotalAmount = " + totAmountandTax[0] + " TotalTax = " + totAmountandTax[1]);
						System.out.println("--------------------------------------------------------------");
						x=x+1;
					}

					if (each instanceof Toy) {
						
						double arr[]=each.calcAmount();
						
						totAmountandTax[0] = each.calcAmount()[0];
						totAmountandTax[1] = totAmountandTax[1] + each.calcAmount()[1];

						System.out.println(
								(x+1)+" |  TOY : TotalAmount = " + totAmountandTax[0] + " TotalTax = " + totAmountandTax[1]);
						System.out.println("--------------------------------------------------------------");
						x=x+1;
					}
					
					if (!(each instanceof Toy) && !(each instanceof Album) && !(each instanceof Book) )
						System.out.println("ADD ITEMS TO YOUR CART !");

				}
			case 0:
				break;
			}
			
			if (choice == 0)
				break;

		}
	}

}

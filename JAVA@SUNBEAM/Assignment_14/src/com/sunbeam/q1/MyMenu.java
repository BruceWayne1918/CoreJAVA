package com.sunbeam.q1;

import java.util.Scanner;

public class MyMenu {
public static menu menu1()
{
	System.out.println("-----------------------------------------------------------------------------------------------------");
System.out.println("1: Insert new candidate");
System.out.println("2: Display all candidates");
System.out.println("3: Increment votes of candidate with given id");
System.out.println("4: Delete candidate with given id");
System.out.println("5 : Find candidate of given id");
System.out.println("6: Find candidates of given party");
System.out.println("7: Display total votes for each party");
System.out.println("0 : EXIT");

String ch = new Scanner(System.in).next();

menu m = menu.values()[Integer.parseInt(ch)];



	return m;
	
}

}

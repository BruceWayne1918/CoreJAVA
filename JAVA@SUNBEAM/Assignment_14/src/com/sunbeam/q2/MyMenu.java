package com.sunbeam.q2;

import java.util.Scanner;

public class MyMenu {
public static menu menu1()
{
	System.out.println("-----------------------------------------------------------------------------------------------------");
System.out.println("1: Insert new user");
System.out.println("2: Display all users");
System.out.println("3: delete user with given id");
System.out.println("4: Change Status with given id");
System.out.println("5 : Change name and DOB with given id");

System.out.println("0 : EXIT");

String ch = new Scanner(System.in).next();

menu m = menu.values()[Integer.parseInt(ch)];



	return m;
	
}

}

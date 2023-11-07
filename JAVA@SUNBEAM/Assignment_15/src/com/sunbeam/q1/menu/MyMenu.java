package com.sunbeam.q1.menu;

import java.util.Scanner;

import com.sunbeam.q1.menu;

public class MyMenu {
	public static menu menu() {
		System.out.println("Enter Choice");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("1: INSERT");
		System.out.println("2: UPDATE CANDIDATE BY ID");
		System.out.println("3: DELETE CANDIDATE BY ID");
		System.out.println("4: FIND BY ID");
		System.out.println("5 : FIND ALL ");
		System.out.println("6 : FIND BY PARTY");
		System.out.println("7 : Get partyWise votes");
		System.out.println("0 : EXIT");
		String ch = new Scanner(System.in).next();

		menu m = menu.values()[Integer.parseInt(ch)];



			return m;
		
	}

}

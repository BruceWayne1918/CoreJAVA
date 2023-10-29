package com.sunbeam.sport;

import java.util.Scanner;

public class Player {
	
	int id,age,matchesPlayed;
	String name;
	
	public void accept() {
		
		System.out.println("Enter Player ID :");
		this.id=new Scanner(System.in).nextInt();
		
		System.out.println("Enter Player Name :");
		this.name=new Scanner(System.in).nextLine();
		
		System.out.println("Enter Age :");
		this.age=new Scanner(System.in).nextInt();
		
		System.out.println("Enter Matches Played :");
		this.matchesPlayed=new Scanner(System.in).nextInt();
		
		
	}
	
	@Override
	public
	String toString() {
		return "ID : "+id+"NAME : "+name+" AGE : "+age+" MATCHES PLAYED : "+matchesPlayed ;}
	
/*reate an abstract Player class with id, name, age, and matchesPlayed as ﬁelds.*/
}

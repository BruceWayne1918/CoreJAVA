package com.sunbeam.q3;

import java.util.Scanner;

public class Person

{
	Scanner sc =new Scanner (System.in);

	private String name;
	private Gender gender;//null...e
	private int age;

	public String getName() {
		return this.name;
	}



	public Person(String name, int age, String gen) //mAlE,MALe,MalE.........MALE==
	{
		this.name = name;
		this.age = age;
		gen=gen.toUpperCase();

		if(gen==Gender.valueOf("MALE").name())
			this.gender = Gender.values()[0];

		else
		{if(gen==Gender.valueOf("FEMALE").name())
			this.gender=Gender.valueOf("FEMALE");}

	}

	public void accept() 
	{ 
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("ENTER DETAILS OF PERSON : ");
		System.out.println("");
		System.out.println("ENTER NAME : ");
		this.name=sc.nextLine();
		System.out.println("ENTER AGE : ");
		this.age=sc.nextInt();
		System.out.println("CHOOSE GENDER ['M' / 'F'] : ");
		String str = sc.next();

		char gen =str.charAt(0);


		if(gen==Gender.MALE.name().charAt(0))
			this.gender = Gender.values()[0];

		else
		{
			if(gen==Gender.MALE.name().charAt(0))
				this.gender=Gender.valueOf("FEMALE");
		}


	}

	@Override
	public String toString() {
		return "PERSON DETAILS : name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}


}
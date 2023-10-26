package com.sunbeam.fruit;

import java.util.Scanner;

public abstract class Fruit 
{
	
	String name,color,condition;
	double weight;
	private boolean isFresh;
	
	
	public boolean isfresh() {
		return this.isFresh;
	}


	public void accept() {
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
		System.out.println("ENTER NAME : ");
		this.name=new Scanner(System.in).nextLine();

		System.out.println("ENTER COLOR : ");
		this.color=new Scanner(System.in).nextLine();

		System.out.println("ENTER WEIGHT : ");
		this.weight=new Scanner(System.in).nextDouble();

		System.out.println("IS THIS FRUIT FRESH y/n ?");

		String str = new Scanner(System.in).next();

		if(str.contentEquals("y")||str.contentEquals("Y"))
		{this.isFresh=true; 
		//			System.out.println("it is fresh");
		}
		else
			if(str.contentEquals("n")||str.contentEquals("N"))
			{this.isFresh=false;
			//				System.out.println("it is stale");
			}
	
		
	
		
		
		
		
	}
	
	
//	public String freshness() {
//		if(this.isFresh)
//			return "FRESH";
//		
//		return "STALE";
//	}
	
	@Override
	public String toString() {
		
		return "NAME : " + name +", COLOUR :" + color +", WEIGHT : " + weight;
	}
	
	
	
	public String dispName() 
	{
		Class<?> objClass = this.getClass();
		
		String[]parts= (objClass.getName()).split("\\.");

		return parts[parts.length - 1];
	}
	
	
	public abstract String taste();
	
	public abstract void dispDetails();
	
	

	
}



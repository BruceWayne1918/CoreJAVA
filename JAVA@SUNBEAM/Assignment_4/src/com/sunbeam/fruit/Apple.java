package com.sunbeam.fruit;

public class Apple extends Fruit {
	
	@Override
	public String taste() {return "sweet n sour";}
	
	

	@Override
	public void dispDetails() 
	{

		System.out.println("Displaying Details of "+this.name+" : ");

		System.out.println(super.toString());
		System.out.println("TEST : "+taste());

		if(this.isfresh())
			this.condition="FRESH";
		else
			this.condition="STALE";

		System.out.println("CONDITION : "+this.condition);
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
	}

	

}

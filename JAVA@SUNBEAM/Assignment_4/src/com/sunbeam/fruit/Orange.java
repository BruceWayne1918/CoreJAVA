package com.sunbeam.fruit;

public class Orange extends Fruit {

	@Override
	public String taste() {return "sour";}

	@Override
	public void dispDetails() {
		
		System.out.println("Displaying Details of "+this.name+" : ");

		System.out.println(super.toString());
		System.out.println("TEST : "+taste());
		
		
		if(this.isfresh())
			this.condition="FRESH";
		else
			this.condition="STALE";
		System.out.println("CONDITION : "+this.condition);
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");





		//		System.out.println("NAME : "+this.dispName());
		//		
		//		System.out.println("COLOR : "+this.color);
		//		
		//		System.out.println("WEIGHT : "+this.weight);
		//		

	}

	

}

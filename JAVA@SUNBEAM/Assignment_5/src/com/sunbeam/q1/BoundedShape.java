package com.sunbeam.q1;

public abstract class BoundedShape {
	
	private int x,y;
	
	public abstract double calcArea();
	
	public void display(double result) {
		Class<? extends BoundedShape> name=this.getClass();
		String[] nameArr = (name.getName()).split("\\.");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Area of "+nameArr[nameArr.length-1]+" : "+result);
	}


	
	
	
}



/*
 
 
Create an abstract class BoundedShape with ﬁelds x, y. 
Provide abstract method calcArea().
Inherit it into a Circle class with additional ﬁelds radius and override calcArea() method.
inherit BoundedShape into another abstract class Polygon with additional ﬁeld number of sides.
Inherit BoundedShape into
classes Triangle (ﬁelds: side1, side2, side3), Square (ﬁelds: side), and Rectangle (ﬁelds: length, breadth).
Override calcArea() method in them. 
 
 
*/
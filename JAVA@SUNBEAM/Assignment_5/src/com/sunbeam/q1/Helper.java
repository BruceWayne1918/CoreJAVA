package com.sunbeam.q1;

public class Helper {
	
	static double result;
	
	public static void calculate(BoundedShape ref)
	{
		result= ref.calcArea();
		
		ref.display(result);
		
		
		
	}
}

package com.sunbeam.q1.shapes;

import com.sunbeam.q1.*;

public class Triangle extends BoundedShape {
	
	private int side1,side2,side3,semiPerimeter;
	
	
	
	

	public Triangle(int side1, int side2, int side3) {
//		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.semiPerimeter= ((this.side1 + this.side2 + this.side3) / 2);
	}
	




	@Override
	public double calcArea() {
		
		double x1=this.semiPerimeter - this.side1;
		double x2=this.semiPerimeter-this.side2;
		double x3=this.semiPerimeter-this.side3;
		
		double square = this.semiPerimeter*x1*x2*x3;
		
		double A= Math.sqrt(square);
		
		return A ;

	}

}

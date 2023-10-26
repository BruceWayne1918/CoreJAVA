package com.sunbeam.q1.shapes;

import com.sunbeam.q1.Polygon;

public class Rectangle extends Polygon
{

	private int length,breadth;
	
	
	public Rectangle(int length, int breadth) {
		super.setNoOfSides(4);
		this.length = length;
		this.breadth = breadth;
	}
	

	@Override
	public double calcArea() {
		return this.length*this.breadth;
	}

}

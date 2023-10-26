package com.sunbeam.q1.shapes;

import com.sunbeam.q1.Polygon;

public class Square extends Polygon {

	private final int side=4;
	private int length;

	public Square(int length) 
	{
		super.setNoOfSides(this.side);
		this.length=length;
	}


	@Override
	public double calcArea() {
		
		return side*side;
	}

}

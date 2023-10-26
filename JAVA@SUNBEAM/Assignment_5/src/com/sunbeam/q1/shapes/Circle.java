package com.sunbeam.q1.shapes;

import com.sunbeam.q1.BoundedShape;

public class Circle extends BoundedShape {
	
	private static double pi=3.142;
	
	private int radius;
	

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		
		return pi*(Math.pow(this.radius, 2.0));
	}

	

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
}

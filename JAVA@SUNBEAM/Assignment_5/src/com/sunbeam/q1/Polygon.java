package com.sunbeam.q1;

public abstract class Polygon extends BoundedShape {
	
	private int noOfSides;

	@Override
	public abstract double calcArea();

	public int getNoOfSides() {
		return noOfSides;
	}

	public void setNoOfSides(int noOfSides) {
		this.noOfSides = noOfSides;
	}

}

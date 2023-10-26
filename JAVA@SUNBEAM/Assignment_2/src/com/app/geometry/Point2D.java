package com.app.geometry;
import java.util.Scanner;

public class Point2D {
	double x_axis;
	double y_axis;
	
	
	
	public Point2D() {
		this(0,0);
	}

	public Point2D(int x_axis, int y_axis) {
		this.x_axis = x_axis;
		this.y_axis = y_axis;
		System.out.println("inside parametarized");
	}

	public double getX_axis() {
		return x_axis;
	}

	public void setX_axis(int x_axis) {
		this.x_axis = x_axis;
	}

	public double getY_axis() {
		return y_axis;
	}

	public void setY_axis(int y_axis) {
		this.y_axis = y_axis;
	}
	
	public String getDetails(int i) 
	{	
//		System.out.println("-----------------------------------------");
//		System.out.println("point P"+(i+1));
//		System.out.println("Point2D = ("+x_axis+","+y_axis+")");
//		int x=(int) this.x_axis;
		
		
		return "("+(int)this.x_axis+","+(int)this.y_axis+")";
	}
	
	public void acceptPoint(int i)
	{	
		System.out.println("-----------------------------------------");
		System.out.println("Point P"+(i));
		
		System.out.println("Enter X Co-ordinate");
		this.x_axis= new Scanner(System.in).nextInt();
		
		System.out.println("Enter Y Co-ordinate");
		this.y_axis= new Scanner(System.in).nextInt();
		
	}
	
	
	public boolean isEqual(Point2D p2) {
		
		if(this.x_axis==p2.x_axis && this.y_axis==p2.y_axis)
			return true;
		else
			return false;	
	}

	public double calcDistance(Point2D p2) {
        double deltaX =  p2.x_axis- this.x_axis;
        double deltaY = p2.y_axis- this.y_axis;

        double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);

        return distance;
    }
	
}
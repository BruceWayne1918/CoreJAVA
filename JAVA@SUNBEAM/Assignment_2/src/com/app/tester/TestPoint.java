package com.app.tester;
import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args)
	{
		double dist;
		Point2D p1 =new Point2D ();
		p1.acceptPoint(1);
		Point2D p2 =new Point2D ();
		p2.acceptPoint(2);
		
		
		String details = p1.getDetails(1);
		System.out.println("-----------------------------------------");
		System.out.println("Details : ");
		System.out.println("P1 :"+details);
		details=p2.getDetails(2);
		System.out.println("P2 :"+details);
		
		boolean equality=p1.isEqual(p2);
		
		if(equality==true)
			{System.out.println("--------------------------------------");
			System.out.println("p1 & p2 are located at the same position");}
		else
			 {dist= p1.calcDistance(p2);
			  System.out.println("------------------------------------");
			  System.out.println("Distance between P1 & P2 = "+dist);
			 }
		
		
	}

}

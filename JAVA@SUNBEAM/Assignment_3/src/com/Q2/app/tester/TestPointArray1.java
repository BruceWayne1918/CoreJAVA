package com.Q2.app.tester;
import  com.Q2.app.geometry.Point2D;

import java.util.Scanner;

public class TestPointArray1 {
	
	static Scanner sc=new Scanner(System.in);
	static int index[]=new int[2];
	
	public static int menu() {
		int choice=0;
		System.out.println("1 : DISPLAY DETAILS OF SPECIFIC POINT");
		System.out.println("2 : DISPLAY x & y CO-ORDINATES OF ALL POINTS");
		System.out.println("3 : SELECT 2 INDEXES TO CALCULATE DISTANCE");
		System.out.println("4 : EXIT");
		
		choice=sc.nextInt();
		
		return choice;
	}
	

	public static void main(String[] args) {
		System.out.println("How many no of points you to plot : ");
//		int pts = new Scanner(System.in).nextInt();
		
		Point2D[] points=new Point2D[new Scanner(System.in).nextInt()];
		
		for(int i=0;i<points.length;i++)
		{
			points[i]=new Point2D();
		}
		
		for(int i=0;i<points.length;i++)
		{
			points[i].acceptPoint(i);
		}
		
		
		while(true)
		{int choice=menu();
		System.out.println("----------------------------------------");

		switch(choice) {
		//		System.out.println("----------------------------------------");
		case 1:
			System.out.println("ENTER THE INDEX : ");
			index[0]=sc.nextInt();
			System.out.println(points[index[0]].getDetails(index[0]));
			break;

		case 2:
			int i=0;
			for(Point2D each : points)
				System.out.println(each.getDetails(i));
				i++;
			break;
			
		case 3:
			System.out.println("ENTER THE INDEX FOR POINT 1 : ");
			index[0]=sc.nextInt();
			
			System.out.println("ENTER THE INDEX FOR POINT 2 : ");
			index[1]=sc.nextInt();
			
			if((index[0]<points.length && -1<index[0]) && (index[1]<points.length && -1<index[1]) )// 0 - points.length -1
				
			{
				if(points[index[0]].isEqual(points[index[1]])==true)
				{
					System.out.println("Points are same \n");
				}
				else 
				{
					double dist=points[index[0]].calcDistance(points[index[1]]);
//					System.out.print("DISTANCE = "+dist);
					
					System.out.printf("DISTANCE =%.2f \n",dist);
				}
			}
			
			break;
		case 4:
			break;
		}

		if (choice == 4)
			break;
	}

	}

}

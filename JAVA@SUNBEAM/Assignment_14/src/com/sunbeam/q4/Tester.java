package com.sunbeam.q4;

import java.util.Scanner;

public class Tester  {
	
	class Calculate implements Arithmetic{

		@Override
		public double calc(double n1, double n2) {
			
			return 0;
		}
		
	}

	public static void main(String[] args) 
	{	
		double n1=2.25,n2=5.25;
		
		
		boolean flag=true;
		while(flag) {
			System.out.println("1 : ADD");
			System.out.println("2 : SUB");
			System.out.println("3 : MUL");
			System.out.println("4 : DIV");
			System.out.println("0 : EXIT");
			int choice=new Scanner(System.in).nextInt();
			switch(choice) {
			case 1:
				calculate(n1,n2,(s1,s2)->s1+s2);
				break;
				
			case 2:calculate(n1,n2,(s1,s2)->s1-s2);
				break;
			case 3:calculate(n1,n2,(s1,s2)->s1*s2);
				break;
			case 4:calculate(n1,n2,(s1,s2)->s1/s2);
//			calculate(n1,n2,null); this will give NullPointerException
				break;
			case 0:
				flag=false;
				break;
				
			}
		}

	}
	
	
	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: "+result);
		}
	
	

}

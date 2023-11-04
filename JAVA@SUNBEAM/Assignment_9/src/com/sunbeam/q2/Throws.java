package com.sunbeam.q2;

public class Throws {
	
	public static int  div(int n1,int n2) 
	{
		int res = 0;
		
		try
		{
			res = n1/n2;
		}

		catch(ArithmeticException e){

			res = n1/n2;

		}
		return res;
	}



	public static void main(String[] args) {

		try {
			div(10,0);
			
			
		}
		catch(Exception  e)
		{
			e.printStackTrace();
			System.out.println("failed!!!!!!!");
		}


	}

}

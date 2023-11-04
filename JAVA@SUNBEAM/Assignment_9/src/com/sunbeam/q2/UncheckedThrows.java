package com.sunbeam.q2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UncheckedThrows {
	
	public static void ioexception() throws IOException
	{
//		try {
			FileReader File = new FileReader("sdfggfds");
//		} catch (FileNotFoundException e)
//		
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
	}
	
	public static void main(String []args)
	{
		try {
			
			UncheckedThrows.ioexception();	
			System.out.println("----------------------------");
		}
		catch(Exception e){
			System.out.println("FILE NOT FOUND !!!!!!!!!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("application did'n crash ");
		
	}

}

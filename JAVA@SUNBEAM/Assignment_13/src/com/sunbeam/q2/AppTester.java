package com.sunbeam.q2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class AppTester {

	public static void main(String[] args) 
	{
		Set<BookTester>bookSet=new HashSet<>();
		
		Collections.addAll(bookSet,
				new BookTester("1001","rajiv",500,20),
				new BookTester("1002","nitin",600,25),
				new BookTester("1003","akshita",700,2),
				new BookTester("1005","nilesh",500,5),
				new BookTester("1004","rohan",5200,10),
				new BookTester("1008","vishal",100,110),
				new BookTester("1007","sarang",2500,250),
				new BookTester("1006","mahesh",50,200),
				
				new BookTester("1006","mahesh",50,200)
				);
		
//		for(BookTester each:bookSet)
//		{
//			System.out.println(each);
//			System.out.println("--------------------------------------------------------------------------------------------------");
//		}
		
		
		

	}

}

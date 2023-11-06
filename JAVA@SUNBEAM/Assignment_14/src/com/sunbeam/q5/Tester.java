package com.sunbeam.q5;

public class Tester  {
	
	
	
	public static void main(String[] args) 
	{
		Integer [] arr = {44, 77, 99, 22, 55, 66};
		Integer key = 50;
		int cnt = countIf(arr, key, (x,y)-> x > y);
		System.out.println("Count = " + cnt); // 4 (because 4 elements in array are greater than given key i.e. 50)

	}

	static <T> int countIf(T[] arr, T key, Check<T> c) {
		int count=0;
		for(T each : arr) {
			if(c.compare(each,key)) 
			{
				count++;
			}
		}
		return count;
		
	}

}

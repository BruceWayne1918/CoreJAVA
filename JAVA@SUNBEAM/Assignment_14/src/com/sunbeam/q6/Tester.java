package com.sunbeam.q6;

public class Tester  {
	
	
	
	public static void main(String[] args) 
	{
		Integer [] arr = {44, 77, 99, 22, 55, 66};
		
		Double [] arr2 = {44.25, 77.3645, 99.32500,44.25, 22.25, 55.89, 66.7};
		
		Integer key = 50;
		Double key2 = 44.25;
		
		int cnt = countIf(arr, key, (x,y)-> x > y);
		System.out.println("Count = " + cnt); // 4 (because 4 elements in array are greater than given key i.e. 50)
		
		System.out.println("------------------------------------------------------------------------------------------");
		int cnt2 = countIf(arr2, key2, (x,y)-> x.equals(y));
		System.out.println("Count = " + cnt2);    

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

package com.sunbeam.q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortAlgorithm 

{
	
	
    static <T> void selectionSort(T[] arr, Comparator<T> c) 
    
    {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(c.compare(arr[i], arr[j]) > 0) {
                   T temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                }
            }
        }
    }
    
    
    
    public static void main(String[] args) {
    	
    	int arr[]= {1,3,2,5,3};

    	

    	
    	
    	
        
        System.out.println("Array class name: " + arr.getClass().getName());
        
        
        
        class DoubleComparator implements Comparator<Number> 
        
        {
            public int compare(Number x, Number y) 
            
            {
                return Double.compare(x.doubleValue(),y.doubleValue());
            }
        }
        
        
        System.out.println("Before Sort: " + Arrays.toString(arr));
        
        Comparator<Number> c=new DoubleComparator(); 
        
        arr;
        selectionSort(arr, c);
        
        System.out.println("After Sort: " + Arrays.toString(arr));
    }
}
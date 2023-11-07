package com.sunbeam.q2.comparator;
import com.sunbeam.q2.*;
import java.util.Comparator;

import com.sunbeam.q2.Book;


public class ComparatorPrice implements Comparator<Book> 
{

	@Override
	public int compare(Book B1, Book B2) {
		
		return -Double.valueOf(B1.getPrice()).compareTo(Double.valueOf(B2.getPrice()));
	}

}

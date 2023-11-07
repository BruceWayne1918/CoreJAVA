package com.sunbeam.comparator;

import java.util.Comparator;
import com.sunbeam.Book;

public class ComparatorPrice implements Comparator<Book> 
{

	@Override
	public int compare(Book B1, Book B2) {
		
		return -Double.valueOf(B1.getPrice()).compareTo(Double.valueOf(B2.getPrice()));
	}

}

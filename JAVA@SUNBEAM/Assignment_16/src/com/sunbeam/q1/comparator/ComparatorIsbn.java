package com.sunbeam.q1.comparator;

import java.util.Comparator;
import com.sunbeam.*;
import com.sunbeam.q1.Book;



public class ComparatorIsbn implements Comparator<Book>
{

	@Override
	public int compare(Book B1, Book B2) {
		return - B1.getIsbn().compareTo(B2.getIsbn());
	}

	}



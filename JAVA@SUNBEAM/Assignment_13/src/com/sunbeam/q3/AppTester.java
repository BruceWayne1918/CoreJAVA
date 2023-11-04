package com.sunbeam.q3;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

import com.sunbeam.q2.BookTester;


class Book {

	private String isbn, autherName;
	private double price;
	private int quantity;

	public Book(String isbn, String autherName, double price, int quantity) 
	{
	
		this.isbn = isbn;
		this.autherName = autherName;
		this.price = price;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getAutherName() {
		return autherName;
	}

	public void setAutherName(String autherName) {
		this.autherName = autherName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Book() {

	}

	@Override
	public String toString() {
		
		return "ISBN : " + isbn+"\n"+"Auther Name : " + autherName +"\n"+"Price : " + price +"\n"+"Quantity : " + quantity;
	}

	@Override
	public int hashCode() {
		System.out.println("Inside hashcode !");
		return Integer.parseInt(this.isbn);
	}

	@Override
	public boolean equals(Object obj) 
	
	{System.out.println("inside equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn);
	}

}

public class AppTester {
	
	public static void main(String[] args) 
	{
		Set<Book>bookSet=new LinkedHashSet<>();
		
		Collections.addAll(bookSet,
				new Book("1001","rajiv",500,20),
				new Book("1002","nitin",600,25),
				
				new Book("1006","mahesh",50,200),
				
				new Book("1003","akshita",700,2),
				new Book("1005","nilesh",500,5),
				new Book("1004","rohan",5200,10),
				new Book("1006","mahesh",50,200),
				new Book("1008","vishal",100,110),
				new Book("1007","sarang",2500,250)
				
				
				
				);
		
		for(Book each:bookSet)
		{
			System.out.println(each);
			System.out.println("--------------------------------------------------------------------------------------------------");
		}
		
		
		

	}}
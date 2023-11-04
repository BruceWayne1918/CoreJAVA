package com.sunbeam.q2;

import java.util.Objects;



public class BookTester {

	private String isbn, autherName;
	private double price;
	private int quantity;

	public BookTester(String isbn, String autherName, double price, int quantity) {
	
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

	public BookTester() {

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
	
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookTester other = (BookTester) obj;
		return Objects.equals(isbn, other.isbn) || Objects.equals(autherName.toLowerCase(), other.getAutherName().toLowerCase());
	}

}

package com.sunbeam.q3;

public class Book {
private String isbn,authorName;
int qty;

public Book() {
	this("101","rajiv",20);
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public String getAuthorName() {
	return authorName;
}
public void setAuthorName(String authorName) {
	this.authorName = authorName;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public Book(String isbn, String authorName, int qty) {
	
	this.isbn = isbn;
	this.authorName = authorName;
	this.qty = qty;
}

 
}

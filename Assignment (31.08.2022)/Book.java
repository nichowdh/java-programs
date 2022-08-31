package com.java;

public class Book extends Product {
	int isbn;
	String author;
	String title;
	
	public Book(int p_id,int i,String a,String t) {
		super(10,500);
		this.isbn=i;
		this.author=a;
		this.title=t;
		
	}
	void display() {
		System.out.println(Product_Id+" "+isbn+" "+author+" "+title);
	}

}

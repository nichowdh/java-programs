package com.java;

public class Product extends AbstractProduct {
	double price;
	
	public Product(int p_id,double p) {
		super(10,"Book","Travel map");
		this.price=p;
		
	}
	void display() {
		System.out.println(Product_Id+" "+price);
	}

}

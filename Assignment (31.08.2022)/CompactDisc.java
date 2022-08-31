package com.java;

public class CompactDisc extends Product {
	String artist;
	String Title;
	
	public CompactDisc(int p_id,String b,String T) {
		super(10,600);
		this.artist=b;
		this.Title=T;
	}
	void display() {
		System.out.println(Product_Id+" "+artist+" "+Title);
	}

}

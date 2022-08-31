package com.java;

public class TravelGuide extends Book {
	String Country;
	
	public TravelGuide(int p_id,String c) {
		super(10,50,"Niladri","Journal");
		this.Country=c;
	}
	void display() {
		System.out.println(Product_Id+" "+Country);
	}
	

}

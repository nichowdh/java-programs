package com.java;

public abstract class AbstractProduct {
	int Product_Id;
	String Name;
	String Description;
	
	 AbstractProduct(int p_id, String n, String d){
		this.Product_Id=p_id;
		this.Name=n;
		this.Description=d;
	}
	abstract void display();

}

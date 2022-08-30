package com.java;

public class Rectangle {
	
	 int length;
	 int breadth;
	public Rectangle(int length, int breadth) {
		// TODO Auto-generated constructor stub
		this.length=length;
		this.breadth=breadth;
	}
	public void area(){

		System.out.println(length*breadth);
		
	}
	public void perimeter() {
		
		System.out.println(2*(length+breadth));
		
	}
	

}

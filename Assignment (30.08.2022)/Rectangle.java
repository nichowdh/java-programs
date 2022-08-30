package com.java;

public class Rectangle {
	
	 int length;
	 int breadth;
	public Rectangle(int length, int breadth) {
		// TODO Auto-generated constructor stub
		this.length=length;
		this.breadth=breadth;
	}
	public int area(){
		return length*breadth;
		
	}
	public int perimeter() {
		return (2*(length+breadth));
		
	}
	

}

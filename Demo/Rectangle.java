package com;

public class Rectangle extends Shape {
	int area;

	public void getArea() {

		area = length * breadth;
		System.out.println("the Area is: " + area);
	}

}

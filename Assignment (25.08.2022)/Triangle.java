//Write a java program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor
package com.java;

 class Triangl {
	int a,b,c;
	double getArea() {
		double p=(a+b+c)/2.0;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	double getPerimeter() {
		return (a+b+c)/2.0;
	}
 }
	public class Triangle{
	
	public static void main(String args[])
	{
		Triangl t=new Triangl();
		
		t.a=3;
		t.b=4;
		t.c=5;
		System.out.println("Area \n"+t.getArea());
		System.out.println("Area \n"+t.getPerimeter());
	}
	}



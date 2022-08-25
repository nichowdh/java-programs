//Write a java program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
package com.java;
import java.util.*;

public class Area {
	
	float length,breadth,area;
	void setDim(float length, float breadth) {
		this.length=length;
		this.breadth=breadth;
		area=this.length*this.breadth;
	}
	float getArea()
	{
		return area;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Area ar=new Area();
		float a,b;
		System.out.println("Enther the length: \n");
		a=sc.nextFloat();
		System.out.println("Enter the breadth: \n");
		b=sc.nextFloat();
		ar.setDim(a,b);
		System.out.println("Area: "+ar.getArea());
	}

}

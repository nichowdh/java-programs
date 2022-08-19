package com.java;

public class QuadreticEquation {
	public static void main(String args[])
	{
		double a=1,b=5,c=1;
		double root1,root2;
		
	double value=(b*b-4-a*c);
	if (value>0) {
		root1=(-b+Math.sqrt(value))/(2*a);
		root2=(-b-Math.sqrt(value))/(2*a);
		System.out.println("root1 and root2 is "+root1 +root2);
	}
	else if (value==0) {
		root1=root2=-b/(2*a);
		System.out.println(root1);
	}
	else {
		double realvalue=-b/(2*a);
		double imgvalue=Math.sqrt(-value)/(2*a);
		System.out.println("Root1 is "+realvalue+imgvalue);
		System.out.println("Root2 is "+realvalue+imgvalue);
	}
	}

}

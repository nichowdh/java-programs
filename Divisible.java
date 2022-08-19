package com.java; //Java Program to check whether a number is divisible by 5 as well as 3

public class Divisible {
	public static void main(String args[])
	{
		int a=77;
		if (a%5==0 && a%3==0) {
			System.out.println("Divisible by 5 and 3 ");
		}
		else if (a%5==0) {
			System.out.println("Divisible by 5 ");
		}
		else if (a%3==0) {
			System.out.println("Divisible by 3 ");
		}
		else {
			System.out.println("Not Divisible by 5 or 3 ");
		}
			
	}

}

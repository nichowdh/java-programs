package com.java; //Amstrong number

import java.util.*;
public class WhileLoop {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		int sum=0, rem,temp=num;
		while (num!=0) {
			
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if (temp==sum)
		{
			System.out.println("Amstrong Number");
		}
		else {
			System.out.println("Not a Amstrong Number");
		}
	}

}

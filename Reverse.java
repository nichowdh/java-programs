package com.java;
import java.util.*;

public class Reverse {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a new number: ");
		int num= sc.nextInt();
		int rev=0;
		
		while(num!=0) {
			int d=num%10;
			rev=rev*10+d;
			num/=10;
		}
		
		
		System.out.println("reversed number is: "+rev);	
		}

}

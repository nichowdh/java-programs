package com.java;
import java.util.*;

public class PrimeNumber {
	public static void main(String args[])
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a new number: ");
		int a= sc.nextInt();
		boolean flag=false;
		
		if(a==1)
		{
			System.out.println("Not a prime number");
		}
		else {
		for (int i=2;i<a;i++)
		{
			if(a%i==0) {
				System.out.println("Not a prime number");
				flag=true;
				break;
			}
		}
		
		if(flag==false)
		{
			System.out.println("Prime number");
			}
		}
	}

}

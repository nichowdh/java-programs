package com.java;
import java.util.*;
public class GCD {
	public static void main(String[] args) 
	{
	   int gcd = 1;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number 1 \n");
		int n1=sc.nextInt();
		System.out.println("Enter the number 2 \n");
		int n2=sc.nextInt();
	   for (int i = 1; i <= n1 && i <= n2; ++i) 
	   {
		  if(n1%i == 0 && n2%i==0)
	       gcd = i;
	   }
	    System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
	  }

}

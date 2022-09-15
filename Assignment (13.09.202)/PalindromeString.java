/*WAP to input a string and check whether it is palindrome or not.*/
package com.java;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string to check: ");
		String s=sc.next();
		String rev = "" ;
		int length=s.length();
		for(int i=length-1;i>=0;i--)
			rev=rev+s.charAt(i);
		if(s.equals(rev)) 
			System.out.println("string is palindrome");
		else
			System.out.println("string is not palindrome");	
	}


}

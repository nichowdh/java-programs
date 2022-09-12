/*Write a program to throw a user-defined exception "String Mismatch Exception",
 if two strings are not equal (ignore the case).*/
package com.java;

import java.util.Scanner;

public class StringMismatch {
	public static void main(String[] args) {
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter the string : ");
		  String s = sc.next();
		  
		  try {
		   if(s.equals("Niladri"))
		    System.out.println("String matched");
		   else
		    throw new StringMismatchException("String Mismtch");
		  }
		  catch (StringMismatchException e) {
		   System.out.println(e);
		  }
		 }

}

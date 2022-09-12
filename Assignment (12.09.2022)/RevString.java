/*WAP to input a string and reverse it without using any inbuilt method.*/
package com.java;

import java.util.Scanner;

public class RevString {
	public static void main(String args[]) {
		String s;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter A string: ");
		s=sc.next();
		System.out.println("Reverse String: ");
		for(int i=s.length()-1;i>=0;i--){
			System.out.println(s.charAt(i));
		}
		
	}

}

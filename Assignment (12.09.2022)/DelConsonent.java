/*Write a program to delete all consonents from the string "Hello, have a good day".*/
package com.java;

import java.util.Scanner;

public class DelConsonent {
	public static void main(String args[]) {
		String s;
		int j=0;
		System.out.println("Enter A string : ");
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		char ch[]=new char[10];
		for (int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				ch[j++]=s.charAt(i);
			}
			else {
				continue;
			}
		}
		for(int i=0;i<j;i++) {
			System.out.println(ch[i]);
		}
		System.out.println();
	}

}

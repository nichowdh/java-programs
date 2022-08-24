package com.java;
//4. Write a Java program to multiply two given integers without using the multiply operator(*).
import java.util.*;
public class MultiplyWithout {
		public static void main(String args[])
		{
			int sum=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number 1 \n");
			int n1=sc.nextInt();
			System.out.println("Enter the number 2 \n");
			int n2=sc.nextInt();
			
			for(int i=1;i<=n1;i++) {
				sum=sum+n2;
			}
			System.out.println("Result: "+sum);
			
		}
	
}

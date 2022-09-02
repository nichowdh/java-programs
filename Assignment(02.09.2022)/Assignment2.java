package com.java;
import java.util.*;
public class Assignment2 {
	public static void main(String[] args) {

		int roll_no, student1, student2, student3;
		Scanner I = new Scanner(System.in);
		for(int i=0; i<=8; i++){

		for(int j=i; j<=8; j++){
		System.out.print("Enter the Roll number :");
		roll_no = I.nextInt();

		System.out.print("Enter First subject number :");
		student1 = I.nextInt();

		System.out.print("Enter second subject number :");
		student2 = I.nextInt();

		System.out.print("Enter third subject number :");
		student3 = I.nextInt();

		int avg = ((student1 +student2 + student3)/3) ;
		System.out.println(" Roll No of Student " +roll_no + " get Avarage mark of "+avg);
		}
		}
		}

		}



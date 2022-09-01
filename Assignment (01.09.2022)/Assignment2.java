package com.java;

public class Assignment2 {
	public static void main(String args[]) {
		String a[][]=new String[3][3];
		a[0][0]="sun";
		a[0][1]="mon";
		a[0][2]="tues";
		
		a[1][0]="wed";
		a[1][1]="thrus";
		a[1][2]="fry";
		
		a[2][0]="sat";
		a[2][1]="day";
		a[2][2]="night";
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(a[i][j]);
			}
		}
		
	}
}

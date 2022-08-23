package com.java;
import java.util.*;
public class SumOfSeries {
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number;  
        double sum = 0;
        System.out.print("Enter number :\n ");
        number = sc.nextInt();
        for(int i=1; i<=number; i++)
    {
            sum += 1.0/i;
    }
 
        System.out.println("sum: " + sum);
    }  

}

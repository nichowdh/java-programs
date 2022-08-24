package com.java;
import java.util.*;

public class Pattern2 {
	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
	    System.out.print("Input number of rows : \n");
	 	int k = sc.nextInt();
	 	int l=1;

	    for(int i=1;i<=k;i++)
	    {
	 	for(int j=1;j<=i;j++)
	 	System.out.print(" "+l++);
	 	
	 	System.out.println();
	     }
	 }

}

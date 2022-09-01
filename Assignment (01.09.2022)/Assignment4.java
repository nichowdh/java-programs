package com.java;

public class Assignment4 {
	String code;
	int price;
	Assignment4(String c, int p){
		code=c;
		price=p;
	}
	
	public static void main(String args[]) {
		Assignment4[] A=new Assignment4[5];
		String a;
		int b,Total_Cost=0;
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter item code: "+(i+1));
			a="abcd";
			System.out.println("Enter item price: "+(i+1));
			b=500;
			A[i]=new Assignment4(a,b);
		}
		System.out.println("item code & item price");
		System.out.println(" ");
		for(int i=0;i<5;i++) {
			 System.out.print(A[i].code);
		      System.out.println(A[i].price);
		      Total_Cost = Total_Cost + A[i].price;
		    }
		    System.out.print("Total Price = "+Total_Cost);
		
 	}

}

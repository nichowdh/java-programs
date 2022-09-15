/*Write a Java Program to Search a Particular Word in a String.*/
package com;

public class SearchStr {
	public static void main(String[] args) {
	String s = "i am learning java";
	String str="java";
	boolean flag=s.contains(str);
	if(flag){
		System.out.println(str+ " is present");
	}
	
	else  {
		System.out.println(str+ " is not present");
	}
}

}

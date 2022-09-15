/*WAP to input an array of strings and find the largest string from the array*/
package com.java;

public class LargestString {
	public static void main(String[] args) { 
        String[] str = {"niladri", "chowdhury"}; 
        System.out.println(longestString(str)); 
    } 
 
    public static String longestString(String[] str) { 
        String longest = ""; 
        for (int i = 0; i < str.length; i++) { 
            if (str[i].length() > longest.length()) { 
                longest = str[i]; 
            } 
        } 
        return longest; 
    } 

}

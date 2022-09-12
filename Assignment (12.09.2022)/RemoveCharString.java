/*write a java program to remove the characters at even indexes and then
  print the new string without using any method for removing*/
package com.java;

public class RemoveCharString {
	public static void main(String[] args) {
		String s="niladri";
		String s2="";
		for(int i=0;i<s.length();i++) {
			if(i%2!=0)
			{
				s2=s2+s.charAt(i);
			}
		}
		System.out.println(s2);
	}

}

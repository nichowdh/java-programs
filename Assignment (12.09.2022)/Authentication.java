/*Write a program to accept a password from the user and throw
  'Authentication Failure' exception if the password is incorrect.*/

package com.java;
import java.util.*;

public class Authentication {
	public static void main(String args[]) {
		String pass;
		Scanner sc=new Scanner (System.in);
		try {
			System.out.println("Enter A password: ");
			pass=sc.next();
			
			if(!pass.equals("nil"))
				throw new AuthenticationException("incorrect password");
			else
				System.out.println("Correct password");
		}
		
		catch (AuthenticationException e) {
			System.out.println(e);
		}
		
	}

}

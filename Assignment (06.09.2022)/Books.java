/*Consider a Library Management System, where a user wants to find a book. 
 If the book is present in Library (Hint: Use predefined array), 
 then it will print the book. Otherwise it will throw an exception 
 “BookNotFoundException”.*/

package com;
import java.util.*;
public class Books {
	public static void book(String store[], String book_name,int size) throws BookNotFoundException{
		int i, flag=0;
		for(i=0;i<size;i++) {
			if(book_name.equals(store[i])) {
				flag=1;
				break;
			}
		}
		if (flag==1) {
			System.out.println("The book is present");
		}
		else {
			throw new BookNotFoundException("Book is not Available");
		}
	}
	public static void main(String args[]) {
		String store[]= {"Math","English","Biology","Physics"};
		int size=store.length;
		System.out.println("The books are present: ");
		for(String val:store) {
			System.out.println(val);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Book name: ");
		String b_name=sc.nextLine();
		
		try {
			Books.book(store,b_name,size);
		}
		catch(BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	

}

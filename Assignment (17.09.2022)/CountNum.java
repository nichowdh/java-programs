/*WAP to count the number of letters in a file*/
package com;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class CountNum {
	public static void main(String args[]) throws IOException {
		FileInputStream fin=new FileInputStream("test.txt");
		BufferedInputStream bout=new BufferedInputStream(fin);
		int count=0;
		int line;
		while((line=bout.read())!=-1) {
			if(line!=' ') {
				count+=1;
			}
			
		}
		System.out.println("Total count is: "+count);
	}

}

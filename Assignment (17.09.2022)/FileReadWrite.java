/*WAP to read the data from two files and write it into another file*/
package com;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class FileReadWrite {
	public static void main(String args[]) throws IOException {
		FileInputStream fin=new FileInputStream("test.txt");
		FileInputStream fin2=new FileInputStream("test1.txt");
		SequenceInputStream inst=new SequenceInputStream(fin,fin2);
		int i;
		while((i=inst.read())!=-1) {
			System.out.println((char)i);
		}
	}

}

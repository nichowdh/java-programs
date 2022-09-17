package com;

import java.io.FileInputStream;

import java.io.IOException;

public class FileVowel {
	public static void main(String args[]) throws IOException {
		FileInputStream fin=new FileInputStream("test.txt");
		int i=0;
		while((i=fin.read())!=-1) { 
			if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u')
			System.out.println((char)i);
		}
		fin.close();
	}

}

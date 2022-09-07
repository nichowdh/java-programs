package com.javaunit.JUnit;

public class Maxvalue {
	int max=0;
	int maximum(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	 

}

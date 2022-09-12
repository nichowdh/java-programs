/*WAP to input an array in random order and then sort it using bubble sort and 
 then search for a given element from that sorted array*/
package com;

public class BubbleSort {
	public static void main(String args[]) {
	int[] arr={5,6,4,2,1};
	int n=arr.length;
	int temp=0;
	for (int i=0;i<n;i++) {
		for (int j=0;j<n-1;j++) {
			if (arr[j]>arr[j+1]){
				temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		
	}
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}
	
	}
}



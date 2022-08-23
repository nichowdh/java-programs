package com.java;

public class PrimeNumber2 {
	public static void main(String Args[])
	{
		int a=15,b=30;
		while(a<b){
			boolean flag=false;
			for(int i=2; i<= b/2; ++i) {
				if(a%i ==0) {
					flag=true;
					break;
				}
			}
			if (!flag && a !=0 && a !=1)
				System.out.println(a+ " ");
			a++;
		}
	}

}

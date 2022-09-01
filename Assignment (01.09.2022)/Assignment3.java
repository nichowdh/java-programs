package com.java;

enum Month{
	Jan,Feb,March,April,May,June
}
public class Assignment3 {
	Month m[];
	Assignment3(Month m[]){
		this.m=m;
	}
	
	void disp()
	{
		for(Month mo:m) {
			System.out.println(mo);
		}
	}
	
	
	public static void main(String args[])
	{
		
		
	    Assignment3 a=new Assignment3(Month.values());
	    switch (Month mo:m ) {
	    case 1:
	    	System.out.println("jan");
	    	break;
	    case 2:
	    	System.out.println("feb");
	    	break;
	    case 3:
	    	System.out.println("march");
	    	break;
	    case 4:
	    	System.out.println("april");
	    	break;
	    case 5:
	    	System.out.println("may");
	    	break;
	    case 6:
	    	System.out.println("june");
	    	break;
	    	default:
	    		System.out.println("No Month");
	    }
	}

}

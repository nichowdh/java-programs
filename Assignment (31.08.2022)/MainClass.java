package com.java;

public class MainClass {
	public static void main(String args[]) {
		TravelGuide s=new TravelGuide(25,"India");
		s.display();
		CompactDisc u=new CompactDisc(25,"Niladri","journal");
		u.display();
		Book v=new Book (25,25,"Niladri","Travel Map");
		v.display();
		Product w=new Product(25,500);
		w.display();
		
	}

}

//Add two distances in inch-feet by creating a class named 'AddDistance'.
package com.java;

class Distance{
	int ft,inch;
	Distance(int f, int i)
	{
		ft=f;
		inch=i;
	}
	Distance addDist(Distance ob1, Distance ob2)
	{
		int f=0,i=0;
		i=inch+ob1.inch+ob2.inch;
		if (i>=12) {
			f=i/12;
			i=i%12;
		}
		f=ft+ob1.ft+f+ob2.ft;
		Distance ob=new Distance(f,i);
		return ob;
	}
	void dispDist()
	{
		System.out.println(ft+"ft "+inch+" inch");
	}
}
 class AddDistance {
	public static void main(String args[]) {
		Distance ob1= new Distance(12,22);
		Distance ob2= new Distance(13,12);
		Distance ob= new Distance(11,11);
		Distance ob3;
		ob3=ob.addDist(ob1, ob2);
		
		ob.dispDist();
		ob1.dispDist();
		ob2.dispDist();
		ob3.dispDist();
		
		
	}

}

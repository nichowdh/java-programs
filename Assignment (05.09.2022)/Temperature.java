/*Create two user-defined exceptions named “TooHot” and “TooCold” to check the temperature (in Celsius) given by the user passed is too hot or too cold.
If temperature > 35, throw exception “TooHot”.
 If temperature <5, throw exception “TooCold”.
Otherwise, print “Normal” and convert it to Farenheit.*/
package com.java;

public class Temperature {
	public static void checktemp(double temp) throws TooHot,TooCold{
		if (temp>35)
			throw new TooHot("Too Hot");
		else if (temp<5)
			throw new TooCold("Too Cold");
		else {
			System.out.println("Normal");
			Double f=(temp*9/5)+32;
			System.out.println("Temp In Farenhite: "+f);
		}
	}
	public static void main(String args[]) {
		try {
			Temperature.checktemp(4);
		}
		catch (TooHot e) {
			System.out.println(e.getMessage());
		}
		catch (TooCold e) {
			System.out.println(e.getMessage());
		}
	}

}

/*Create a super class called Car. The Car class has the following fields and methods.
◦int speed;
◦doubl eregularPrice;
◦String color;
◦doublegetSalePrice();

Create a sub class of Car class and name it as Truck. The Truck class has the following fields and methods.
◦int weight;
◦doublegetSalePrice();//If weight>2000,10%discount.Otherwise 20%discount.

Create a subclass of Car class and name it as Ford. The Ford class has the following fields and methods
◦int year;
◦intmanufacturerDiscount;
◦doublegetSalePrice();//FromthesalepricecomputedfromCarclass,subtractthemanufacturerDiscount.*/

package com.second;

public class MainClass {
	public static void main(String args[]) {
		Ford f=new Ford(200,200,"red",2000,10);
		System.out.println(f.getSalePrice());
		Truck t=new Truck(50,500,"white",1000);
		System.out.println(t.getSalePrice());
		Car c=new Car(150,1000,"Black");
		System.out.println(c.getSalePrice());
	}

}

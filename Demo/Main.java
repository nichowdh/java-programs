package com;

public class Main {
	public static void main(String[] args) {
		// creating an object of the sub class

		Dog d = new Dog();
		// access field of super class
		d.name = "Labrador";
		d.display();
		// call method of super class using object of sub-class
		d.eat();
	}

}

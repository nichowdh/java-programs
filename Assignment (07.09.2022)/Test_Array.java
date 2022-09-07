/*create a junit test case for finding the maximum value in an array*/
package com.javaunit.JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_Array {

	@Test
	void test() {
		Maxvalue ob=new Maxvalue();
		int arr[]= {60,30,80,10};
		int actual=ob.maximum(arr);
		int expected=80;
		assertEquals(expected,actual);
	}

}

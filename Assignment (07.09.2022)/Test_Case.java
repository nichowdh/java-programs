package com.javaunit.JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_Case {

	@Test
	void test() {
		Addition a=new Addition();
		int actual=a.sum(5, 10);
		int expected=15;
		assertEquals(expected,actual);
	}

}

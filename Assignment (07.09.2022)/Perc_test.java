/*Create a class having student details like name,marks in 3 subjects and a percentage variable,

create a student business logic which should return the percentage of three subjects, and then test the business logic using junit.*/
package com.javaunit.JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Perc_test {
	Student st=new Student();
	StudentBusinessLogic sg=new StudentBusinessLogic();

	@Test
	void test_perc() {
		st.setM1(45);
		st.setM2(56);
		st.setM3(78);
		double p=sg.calc_perc(st);
		assertEquals(59.66666666666667,p);
	}

}

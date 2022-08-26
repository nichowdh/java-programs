package com.java;

public class EmpRes {
	public static void main(String args[])
	{
	Employee e1=new Employee("john","paul",12300.90);
	System.out.println("Yearly salary for first employee"+e1.YearlySal());
	System.out.println("Yearly salary after giving 10% raise"+e1.YearlySal()+0.1*e1.YearlySal());
	
	Employee e2=new Employee("rohan","malhotra",45000.789);
	System.out.println("Yearly salary for second employee"+e2.YearlySal());
	System.out.println("Yearly salary after giving 10% raise"+e2.YearlySal()+0.1*e2.YearlySal());
}

}

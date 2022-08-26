/*Create a class called Employee that includes three pieces of information as instance variables—a first name
(typeString), a last name (typeString) and a monthly salary (double). Your class should have a constructor that
initializes the three instance variables. If the monthly
salary is not positive, set it to 0.0. Write a test application named EmployeeTest that demonstrates class
Employee’s capabilities. Create two Employee objects and display each object’s yearly salary. Then give each
Employee a 10% raise and display each Employee’s yearly salary again.*/

package com.java;

public class Employee {
	String firstname;
	String lastname;
	double monthlysal;

	Employee(String firstname,String lastname,double monthlysal)
	{
	
	this.firstname=firstname;
	this.lastname=lastname;
	this.monthlysal=monthlysal;
	if(this.monthlysal<0) 
	{
		this.monthlysal=0.0;
	}
	
	
}



	double YearlySal() {
	double yearly=this.monthlysal*12;
	return yearly;
	
}

}

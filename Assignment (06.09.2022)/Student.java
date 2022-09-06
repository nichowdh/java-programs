package src;

public class Student {
	String name;
	int roll_no;
	double marks1,marks2;
	Student(String n, int rn, double m1, double m2){
		name=n;
		roll_no=rn;
		marks1=m1;
		marks2=m2;
	}
	void show() {
		System.out.println("Student name: "+name);
		System.out.println("Roll_no: "+roll_no);
		System.out.println("Student name: "+marks1);
		System.out.println("Student name: "+marks2);
		
	}

}

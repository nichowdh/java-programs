package src;

public class Result extends Student implements Exam {
	float per;
	 Result(String n,int rn,double m1,double m2) {
	  
	  super(n,rn,m1,m2);
	 }
	 
	 public void Percent_cal() {
	  
	  double total = marks1 + marks2;
	  per = (float)total / 2;
	 }
	 
	 void display() {
	  
	  show();
	  System.out.println("Percentage = "+per);
	 } 

}

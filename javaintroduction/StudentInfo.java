package com.javaintroduction;

public class StudentInfo {
	
	// Declaration of Instance variables
	String collegeName="Aditya University";
	String student_Name;
	int age;
	
	//showing the result using display method
	void display()
	{
		System.out.println("College Name:"+collegeName);
		System.out.println("Student Name:"+student_Name);
		System.out.println("Student Age:"+age);
		System.out.println();
	}
	public static void main(String[] args) {
		
		// object creation for class Studentinfo
		StudentInfo s1=new StudentInfo();
		StudentInfo s2=new StudentInfo();
		StudentInfo s3=new StudentInfo();
		
		//Initializing the values to variables using object reference variable
		s1.age=21;
		s1.student_Name="Sunil Reddy";
		
		s2.age=22;
		s2.student_Name="Jagadeeswari";
		s2.collegeName="Pydah Pharmacy College";
		s3.student_Name="Hari sai";
		s3.age=18;
		
		//calling the method display() to display the result
		s1.display();
		s2.display();
		s3.display();

	}

}

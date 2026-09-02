package com.javaintroduction;

public class Student {
	// Declaration of static variable
	static int count=0;
	
	// Increment the count when the object is created
	public Student()
	{
		count++;
	}
	
	//Static method to display the Object count
	public static void show()
	{
		System.out.println("Total Objects Created:"+count);
	}
	
	// Main Method
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		// Creating Objects
		Student s=new Student();
		Student s1=new Student();
		Student s2=new Student();
		//Display the show method for result of count
		Student.show();
		System.out.println("Main Method Ended");
	}

}

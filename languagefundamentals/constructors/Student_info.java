package com.languagefundamentals.constructors;

// no-arg constructor display the student information

public class Student_info {
	int sid;
	String sname;
	
	// no-arg constructor
	Student_info()
	{
		
		System.out.println(sid);
		System.out.println(sname);
	}
	public static void main(String[] args) {
		Student_info s1=new Student_info(); // object created using new that calls the no-arg constructor 
		System.out.println(s1);

	}

}

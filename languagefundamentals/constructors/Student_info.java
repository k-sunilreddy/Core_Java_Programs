package com.languagefundamentals.constructors;

// no args constructor display the student information
public class Student_info {
	int sid;
	String sname;
	
	Student_info()
	{
		
		System.out.println(sid);
		System.out.println(sname);
	}
	public static void main(String[] args) {
		Student_info s1=new Student_info(); // object created using new
		System.out.println(s1);

	}

}

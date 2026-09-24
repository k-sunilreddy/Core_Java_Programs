package com.languagefundamentals.constructors;

//Create a Java class Student and count how many objects are created without using an instance block.

public class Student1 {
	static int count;
	/*
	 * static { count++; }
	 */
	Student1()
	{
		count++;
	}
	
	public static void main(String[] args) {
		Student1 s1= new Student1();
		Student1 s2=new Student1();
		
		System.out.println("Number of Objects : "+count);
		
		
	}

}

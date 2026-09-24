package com.languagefundamentals.constructors;

public class Student {
	
	// No - args  Constructor
	// if the constructor does not contain any parameters inside it, it is called automatically when object is created.
	// first it will return default values then JVM initialize assign values to instance variables using object. 
	Student()
	{
		System.out.println("Constructor Called");
	}
	
	
	public static void main(String[] args) {
		
		// object created using new.
		Student s=new Student();	
		
	}

}

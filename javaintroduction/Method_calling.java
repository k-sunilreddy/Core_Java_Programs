package com.javaintroduction;

public class Method_calling {

	//Create 4 methods – 2 static and 2 instance methods. Write a statement inside each method to identify which method is called.
	//Call only one method inside main(), but the output should display statements from all 4 methods.

	// declaration of static methods
	static void staticmethod1()
	{
		System.out.println("Static Method1 Called");
	}
	static void staticmethod2()
	{
		staticmethod1();
		System.out.println("Static method2  called");
	}
	
	//declaration of instance methods
	
	void instancemethod1()
	{
		staticmethod2();
		System.out.println("Instance method1 called");
	}
	
	void instancemethod2()
	{
		instancemethod1(); 
		System.out.println("Instance method2 called");
		
	}
	
	public static void main(String[] args) {
		//Object creation to call instance method
		Method_calling m=new Method_calling();
		m.instancemethod2();
	}

}

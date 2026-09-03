// In java, before main method, JVM checks static block first, if present and load into the memory with the help prepare from linking.
// Can we execute static block without main method..?
// yes --> before 1.5 version
// no --> after 1 version

package com.javaintroduction;

public class Test {
	static int a;
	int b;
	// static block declaration
	static 
	{
		System.out.println("Static Block Called");
		System.out.println("Welcome to JVM Architecture");
		System.out.println(a);
		
//		System.out.println(b); // we cannot make static reference to non static field
	}
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		System.out.println("Main Method Ended");;
		

	}

}

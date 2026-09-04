package com.javaintroduction;

public class Test3 {
	void show()
	{
		System.out.println("Show Method Called");
	}
	
	// JVM creates objects automatically when method is declared with static in class level.
	// Therefore there no need to create object for welcome method in main method or class level.
	public static void welcome()
	{
		System.out.println("Welcome to Vcube Family");
		System.out.println("Welcome to Vcube Family");
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		welcome();// we can call static method directly in static area, but cannot call instance method directly in static area.
		System.out.println("Main Method Ended");
	}

}

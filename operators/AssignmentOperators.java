package com.operators;

// Assignment Operator is a type of Operator that assigns some values to operands(i.e) variables.
// Assignment Operator are: +=,-=,*=,/=,%=

public class AssignmentOperators {

	public static void main(String[] args) {
		int result=10;
		
//		result = result + 5.5; // here it raises an compile time error 
		//because of explicit type of conversion(argument that doesn't support double to int directly).
		// here we can this with compound operator (i.e) assignment operator.
		
		result+=5.5; // this means it's actually performs as result + 5.5 and stores it in result variable.
		
		System.out.println("Assignment operation with Addition :"+result);
		
		result-=2.5;
		System.out.println("Assignment operation with Subtraction :"+result);
		
		result*=10;
		System.out.println("Assignemnt operation with Multiplication :"+result);
		
		result/=5;
		System.out.println("Assignment operation with Division :"+result);
		
		result%=10;
		System.out.println("Assignment operation with Modulus :"+result);
	}

}

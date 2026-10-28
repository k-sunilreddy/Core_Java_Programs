package com.operators;

import java.util.Scanner;

// Arithmetic Operators are operators that some operations/tasks like addition(+),subtraction(-),multiplication(*),division(/),modulus(%).

public class ArthimeticOperators {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value A :");
		int a=sc.nextInt();
		System.out.print("Enter the value B :");
		int b=sc.nextInt();
		
		System.out.println("Addition of two numbers :"+(a+b));
		System.out.println("Subtraction of two numbers :" +(a-b));
		System.out.println("Multiplication of two numbers :"+(a*b));
		System.out.println("Division of two numbers :"+(a/b));
		System.out.println("Modulus of two numbers :"+(a%b));
		
		System.out.println("Main Method Ended");
		sc.close();
	}

}

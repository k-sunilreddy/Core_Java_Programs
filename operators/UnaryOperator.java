package com.operators;

// Unary Operator is an operator that performs operation on unique element.
// Unary Operator are in form of: +variable_name

public class UnaryOperator {

	public static void main(String[] args) {
		int a=10;
		int b=30;
		
		System.out.println(+a);
		System.out.println(+b);
		
		// by using pre-increment and pre-decrement and post increment and post-decrement.
		
		System.out.println(a++);
		System.out.println(a++);
		System.out.println(--a);
		System.out.println(++b);
		System.out.println(b--);
		System.out.println(--b);
		System.out.println(b++);
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(++b);
		
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
	}

}

package com.conditionalstatements.loops;

import java.util.Scanner;

// Printing the Fibonacci series 
// A Fibonacci series is a number term where each number is sum of two numbers before it.
// 
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n=sc.nextInt();
		int n1=0;
		int n2=1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(+n1+ " "); 
			int n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		sc.close();
	}

}

package com.conditionalstatements.loops;

import java.util.Scanner;

// Printing the Factorial of Number

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n=sc.nextInt();
		
		int fact=1;
		for(int i=n;i>=1;i--)
		{
			fact*=i;
		}
		System.out.println("Factorial of Number :"+fact);
		sc.close();
	}

}

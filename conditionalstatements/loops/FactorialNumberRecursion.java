package com.conditionalstatements.loops;

import java.util.Scanner;

// printing the factorial of number using recursion.
public class FactorialNumberRecursion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		
		int f=fact(n);
		System.out.println("Factorial of a number " +n+"! :"+f);
		sc.close();
	}
	static int fact(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		return n* fact(n-1);
	}
}

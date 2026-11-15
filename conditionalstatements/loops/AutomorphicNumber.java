package com.conditionalstatements.loops;

import java.util.Scanner;

// A number is said to be Automorphic Number when the square of number is ends with exact same digits as the number itself.
// Automorphic Number --> 1-->1,5^2-->25,6^2-->36...

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		
		int sq=n*n;
		
		if( n%10 == sq%10)
		{
			System.out.println("Given Number is an Automorphic Number ");
		}
		else
		{
			System.out.println("Given Number is not an Automorphic Number ");
		}
	}

}

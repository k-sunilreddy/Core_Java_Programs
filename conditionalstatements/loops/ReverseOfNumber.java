package com.conditionalstatements.loops;

import java.util.Scanner;

// Reverse of Number

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n=sc.nextInt();
		int reverse=0;
		int originalnumber=n;
		while(n!=0)
		{
			int digit=n%10; //here it % performs to extract the last digit
			reverse=reverse*10+digit; 
			n=n/10; // here the / performs to remove the last digit. 
		}
		System.out.println("Original Number :"+originalnumber);
		System.out.println("Reversed Number :"+reverse);
		sc.close();
	}

}

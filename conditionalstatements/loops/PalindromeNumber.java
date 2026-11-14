package com.conditionalstatements.loops;

import java.util.Scanner;

// A number is said to be a palindrome number when it reads backward and forward is same.  
public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n=sc.nextInt();
		int reverse=0;
		int temp=n;
		while(n!=0)
		{
			int digit=n%10;
			reverse=reverse*10+digit;
			n=n/10;
		}
		if(reverse==temp)
		{
			System.out.println("Given number is a palindrom number ");
		}
		else
		{
			System.out.println("Given number is not a palidrome number");
		}
		sc.close();
	}

}

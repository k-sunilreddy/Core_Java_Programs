package com.conditionalstatements.loops;

import java.util.Scanner;

// Printing the Happy Number using recursion.
// Happy Number is a number that it returns 1,where it is repeatedly calculated sum of the square of its digits.
public class HappyNumberRecursion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			
		System.out.println("Enter a Number :");
		int n=sc.nextInt();
		if (happynumber(n) == 1)	
		{
			System.out.println("Given number " +n+ " is a Happy number");
		}
		else
		{
			System.out.println("Given number " +n+ " is not a Happy number");
		}
	}
	static int happynumber(int n)
	{
		if(n==1 || n==4)
		{
			return n;
		}
		int sum=0;
		while(n>0)
		{
			int digit=n%10;
			sum+=digit*digit;
			n/=10;
		}
		return happynumber(sum);
	}

}

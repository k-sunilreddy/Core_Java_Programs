package com.conditionalstatements.loops;

import java.util.Scanner;

// A number is said to be Neon Number if it returns sum of digits of square number is equal to original number.
// 9--> 9^2 --> 8+1-->9
public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int sq=n*n;
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			int digit=sq%10;
			sum+=digit;
			sq/=10;
		}
		if(sum==n)
		{
			System.out.println("Given number is Neon Number");
		}
		else
		{
			System.out.println("Given number is not a Neon Number");
		}
		sc.close();
	}

}

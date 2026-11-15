package com.conditionalstatements.loops;

import java.util.Scanner;

// Harshad Number is a Number that is divisible by sum of its own digits
// 18 --> 1+8 = 9--> 18%2 == 0
public class HarshadNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		while(n>0)
		{
			int digit=n%10;
			sum+=digit;
			n/=10;
		}
		if(temp%sum == 0 ) // 1/10--> ,1+1 --> 2/11 --> 2==0,4/13-->4==0, 5/14, 6/15, 7/16, 8/17, 9/18 
		{
			System.out.println("Harshad Number");
		}
		else
		{
			System.out.println("Not a Harshad Number");
		}
	}

}

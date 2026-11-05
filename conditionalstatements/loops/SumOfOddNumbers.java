package com.conditionalstatements.loops;

import java.util.Scanner;

// printing the sum of odd numbers
public class SumOfOddNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		int n=sc.nextInt();
		int sum=0;
		for(int i=0; i<=n;i++)
		{
			if(i%2!=0)
			{
				sum+=i;
			}
		}
		System.out.println("Sum of Odd Numbers :"+sum);
		sc.close();
	}

}

package com.conditionalstatements.loops;

import java.util.Scanner;

public class SumOfDivisibleNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		int sum=0;
		
		for(int i=0;i<=n;i++)
		{
			if(i%3 ==0 && i%5 ==0) // --> 3/3 ==0 && 3/5 ==0
			{
				sum+=i;
			}
		}
		System.out.println("Sum of Numbers divisible by 3 and 5 :"+sum);
		sc.close();
		
	}

}

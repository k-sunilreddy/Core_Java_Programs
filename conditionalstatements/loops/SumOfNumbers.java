package com.conditionalstatements.loops;

// printing the sum of programs using for loop.
import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		int sum=0;
		
//		n=n*(n+1)/2;
		
//		System.out.println("Sum of Numbers :"+n);
		
		for(int i=0;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("Sum of the Numbers :"+sum);
		sc.close();
	}

}

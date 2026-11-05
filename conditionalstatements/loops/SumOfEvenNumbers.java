package com.conditionalstatements.loops;

// printing the sum of even numbers
import java.util.Scanner;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		
		int n=sc.nextInt();
		int sum =0;
		for (int i=0; i<=n; i++)
		{
			if(i%2==0 && i!=0)
			{
				sum+=i;
			}
		}
		System.out.println("Sum Of the Even Numbers :"+sum);
		sc.close();
	}

}

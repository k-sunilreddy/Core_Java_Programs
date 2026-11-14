package com.conditionalstatements.loops;

import java.util.Scanner;

//checking the given number is prime or not
public class PrimeNumberCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println("given number is prime");
		}
		else
		{
			System.out.println("given number is not a prime");
		}
		sc.close();
	}

}

package com.conditionalstatements.loops;

import java.util.Scanner;

//printing the prime numbers from 1 to 10
// prime number is a number that is divisible by 1 and itself of number.which is mainly contains two factors.

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number you want print the prime number upto range:");
		int n=sc.nextInt();
		
		for(int i=2; i<=n; i++)
		{	int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j == 0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println(i + " Prime number ");
			}
		}
	}

}

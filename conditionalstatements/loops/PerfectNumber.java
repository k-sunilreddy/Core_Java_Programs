package com.conditionalstatements.loops;

import java.util.Scanner;

//Perfect Number is said to perfect number where the sum of the proper divisors of that number is equal to the original number, excluding the original number.
// 6 --> 1 + 2+ 3 =6,28 --> 1+2+4+7+14 = 28. 
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i ==0)
			{
				sum+=i;
			}
		}
		if(sum == n)
		{
			System.out.println("Given number " +n+ " is Perfect Number ");
		}
		else
		{
			System.out.println("Given number " +n+ " is not a Perfect Number ");

		}
	}

}

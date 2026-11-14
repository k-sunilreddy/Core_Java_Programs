package com.conditionalstatements.loops;

import java.util.Scanner;

//A number is said to be a strong number where the sum of factorials of its individual digits is equal to the number itself.
// 145 --> 1! + 4! + 5! --> 1+24+120 = 145, therefore in this case it is an strong number.

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(n!=0)
		{
			int digit=n%10;
			int fact=1;
			for(int i=1;i<=digit;i++)
			{
				fact*=i;
			}
			sum+=fact;
			n/=10;
		}
		if (sum == temp)
		{
			System.out.println("Given number is a Strong Number");
		}
		else
		{
			System.out.println("Given number is a not Strong Number");
		}
		sc.close();
	}

}

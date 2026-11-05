package com.conditionalstatements.loops;

import java.util.Scanner;

// printing the sum of count of numbers

public class SumOfCountNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int c=0;
		int sum=0;
		while(n>0)
		{
			int digit=n%10;
			c+=1;
			sum+=c;
			n/=10;
		}
		System.out.println(sum);
		sc.close();
	}

}

package com.conditionalstatements.loops;

import java.util.Scanner;

// Printing the given number is Armstrong Number 
// Armstrong Number is a Number that equals to the sum of its own digits where each digit is raised to the power of total number of digits in the number.
// 153 --> 1^3 + 5^3 + 3^3 --> 1+125+27, 371 --> 3^3+7^3+1^3--> 27+343+1 --> 371
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter a Number :");
		int n=sc.nextInt();
		
		int sum=0;
		int temp=n;
		while(n>0)
		{
			int digit = n%10;
			sum=sum+digit*digit*digit;
			n=n/10;
		}
		if (sum == temp)
		{
			System.out.println("Given Number is an Armstrong Number");
		}
		else
		{
			System.out.println("Given number is not an Armstrong Number ");
		}
		sc.close();
	}

}

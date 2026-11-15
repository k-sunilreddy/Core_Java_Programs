package com.conditionalstatements.loops;

import java.util.Scanner;

//A number is said to be a Happy Number where it returns the 1 when you repeatedly calculate the sum of the square of its digits.
// 19 --> 1^2 + 9^2 --> 1+81 = 82 --> 8^2 + 2^2 --> 64 + 4= 68 --> 6^2+8^2--> 36+64=100--> 1^2 + 0^2 + 0^2--> 1.
// 7 --> 7^2--> 49--> 4^2+9^2 --> 16+81=97-->9^2+7^2-->81+49=130-->1^2+3^2+0^2-->1+9+0=10-->1^2+0^2-->1

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n=sc.nextInt();
		int temp=n;
		while(n!=1)
		{
			int sum=0;
			while(n>0)
			{
				int digit=n%10;
				sum=sum+(digit*digit);
				n/=10;
			}
			n=sum;
		}
		if(n == 1)
		{
			System.out.println("Given number "+temp+ " is Happy Number ");
		}
		else
		{
			System.out.println("Given number " +temp+ " is Not a Happy Number");
		}
	}

}

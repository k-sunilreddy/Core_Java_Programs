package com.conditionalstatements.loops;

import java.util.Scanner;

// printing the count of digits of number
public class CountofDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int c=0;
		while(n>0)
		{
			int digit=n%10;
			c+=1;
			n/=10;
		}
		System.out.println(c);
	}

}

package com.conditionalstatements.loops;

import java.util.Scanner;

// Count of Even Numbers
// 
public class CountOfEvenNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		int c=0;
		while(n>0) {
			int digit=n%10;
			if(digit%2==0)
			{
				c+=1;
			}
			n/=10;
		}
		System.out.println(c);
	}

}

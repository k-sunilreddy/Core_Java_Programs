package com.conditionalstatements.loops;

import java.util.Scanner;

// printing the odd numbers
public class OddNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n=sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			if(i%2!=0 && i!=0)
			{
				System.out.println("Odd Numbers :"+i);
			}
		}
		sc.close();
	}

}

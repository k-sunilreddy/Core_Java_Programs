package com.conditionalstatements.loops;

import java.util.Scanner;

// printing the numbers 1 to 20 using for loop.

public class Natural_Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		
		for(int i=1; i <=n; i++)
		{
			System.out.print (i + " ");
		}
		sc.close();
	}

}

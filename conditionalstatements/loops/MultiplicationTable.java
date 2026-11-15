package com.conditionalstatements.loops;

import java.util.Scanner;

// Write a Java program to print the multiplication table of a given number.
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number you want to print table :");
		int n=sc.nextInt();
		
		for(int i=1;i<=12;i++)
		{
			System.out.println(+n+ " X " +i+ " = "+ n*i);
		}
		sc.close();
	}

}

package com.array;

import java.util.Scanner;

// printing the total count of even and odd numbers of an array.

public class CountOfEvenandOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.print("Enter the number of elements of an array:");
		for(int i =0; i< size;i++)
		{
			array[i]=sc.nextInt();
		}
		int evencount=0;
		int oddcount=0;
		for (int i=0;i<array.length;i++)
		{
			if(array[i]%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
		}
		System.out.println("Total Even Number Count in an array "+evencount);
		System.out.println("Total Odd Number COunt in an array "+oddcount);
		
	}

}

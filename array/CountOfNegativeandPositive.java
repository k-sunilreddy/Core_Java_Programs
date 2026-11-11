package com.array;

import java.util.Scanner;

public class CountOfNegativeandPositive {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.print("Enter the number of elements of an array:");
		for(int i =0; i< size;i++)
		{
			array[i]=sc.nextInt();
		}
		int positivecount=0;
		int negativecount=0;
		for (int i=0;i<array.length;i++)
		{
			if(array[i]>=0)
			{
				positivecount++;
			}
			else if(array[i]<0)
			{
				negativecount++;
			}
		}
		System.out.println("Total Negative Number Count in an array "+negativecount);
		System.out.println("Total Positive Number COunt in an array "+positivecount);
		
	}
}


package com.array;

import java.util.Arrays;

// java program to print each element is the sum of the previous and next element of the given array.
//  i/p : {10,20,30,40,50,60}
// o/p : {30,40,60,80,100,110}

public class SumOfPreNextElement {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		System.out.println("Original elements in an array :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		int arr2[]=new int[arr.length];
		
		System.out.println("\nSum of previous and next element in an array :");
		int num=0;
		for (int i=0; i<arr.length;i++)
		{
			if(i==0)
			{
				num=arr[i]+arr[i+1];
				arr2[i]=num;
			}
			else if(i==arr.length-1)
			{
				num=arr[i]+arr[i-1];
				arr2[i]=num;
			}
			else
			{
				num=arr[i-1]+arr[i+1];
				arr2[i]=num;
			}
		}
		System.out.println(Arrays.toString(arr2));

	}

}

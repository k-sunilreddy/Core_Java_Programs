package com.array;

import java.util.Arrays;
import java.util.Scanner;

// printing the K-th Smallest element from an array.
public class KthSmallestElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int n=sc.nextInt();
		System.out.println("Enter the Kth Value :");
		int k=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Elements in an array :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted Array :"+Arrays.toString(arr));
		if(k>=1 && k<=arr.length)
		{
			System.out.println("Kth - smallest element in an array :"+arr[k-1]);
		}
		else
		{
			System.out.println("Kth Value does not contain element in an array");
		}
		sc.close();
	}

}

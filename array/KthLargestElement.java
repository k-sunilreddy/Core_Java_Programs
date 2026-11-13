package com.array;

import java.util.Arrays;

// java program to print the Kth-Largest Element in an array.
public class KthLargestElement {

	public static void main(String[] args) {
		int arr[]= {4,5,7,1,3};
		int k=3;
		System.out.println("Original Array :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nKth value : "+k);
		int temp=0;
		for (int i=0;i<arr.length;i++)
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
		System.out.println("\nSorted Array :"+Arrays.toString(arr));
		if(k>=1 && k <= arr.length)
		{
			System.out.println("Kth-Largest Element : "+arr[arr.length-k]);
		}
	}

}

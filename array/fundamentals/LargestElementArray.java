package com.array.fundamentals;

import java.util.Arrays;

// finding or printing the largest array of element.
public class LargestElementArray {

	public static void main(String[] args) {
		int arr[]= {12,33,45,17,19,22,9};
		
		System.out.println("Original Array :"+Arrays.toString(arr));
		
		int largest=0;
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]>arr[largest])
			{
				largest=i;
			}	
		}
		System.out.println("largest element in given array :"+arr[largest]);
	}

}

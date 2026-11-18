package com.array.fundamentals;

import java.util.Arrays;

// finding or printing the smallest element in given array. 
public class SmallestElementArray {

	public static void main(String[] args) {
		int arr[]= {7,4,13,44,22,1,66,21,2,56,58,9};
		
		System.out.println("Elements in an original array :"+Arrays.toString(arr));
		
		int smallest=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<arr[smallest])
			{
				smallest=i;
			}
		}
		System.out.println("Smallest Element in given array :"+arr[smallest]);
	}

}

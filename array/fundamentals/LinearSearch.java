package com.array.fundamentals;

import java.util.Arrays;

// linear search is searching based mechanism that search one by one element in the array until the target element found.
// finding an element in the given array.
public class LinearSearch {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6,7,8,9};
		boolean status=false;
		int target=3;
		
		System.out.println("Elements in an given array :"+Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				status=true;
				System.out.println("Element in given array is found at index :"+i);
				break;
			}
		}
		if(!status)
		{
			System.out.println("Element is not available in given array");
		}
	}

}

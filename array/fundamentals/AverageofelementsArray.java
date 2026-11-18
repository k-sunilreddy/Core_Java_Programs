package com.array.fundamentals;

import java.util.Arrays;

// Calculate or printing the average of an Array Elements.
public class AverageofelementsArray {

	public static void main(String[] args) {
		int arr[]= {5,10,15,20,25,30,35,40,45,50};
		
		System.out.print("Original Elements in an array :"+Arrays.toString(arr));
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("\nAverage of an array of all elements :"+(sum/2));
	}

}

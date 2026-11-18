package com.array.fundamentals;

import java.util.Arrays;

// printing the sum of all array elements.
public class SumofArrayElements {

	public static void main(String[] args) {
		// declaration and initialization an array
		int arr[]= {10,20,30,40,50};
		
		System.out.println("Elements in array :"+Arrays.toString(arr));
		
		int sum=0; // taking sum as 0 at initial stage.
		System.out.print("Sum of all array elements :");
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.print(sum);
		
	}

}

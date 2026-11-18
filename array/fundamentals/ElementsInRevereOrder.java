package com.array.fundamentals;

import java.util.Arrays;

// Printing array elements in reverse order
public class ElementsInRevereOrder {

	public static void main(String[] args) {
		
		//declaration and initialization elements of an array
		int arr[]= {11,22,33,44,55,66};
		
		// printing the elements in array
		System.out.println("Elements in array :");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("\nElements in array in reverse order :");
		int[] revarr=new int[6];
		
		// Printing the elements in an array in reverse order
		for(int i=arr.length-1,j=0;i>=0;i--,j++)
		{
			revarr[j]=arr[i]; // stores the first element revarr and increment and repeat until condition.
		}
		System.out.println(Arrays.toString(revarr));
	}

}

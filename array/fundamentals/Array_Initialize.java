package com.array.fundamentals;

// Declare and initialize an integer array.
public class Array_Initialize {

	public static void main(String[] args) {
		int arr[]=new int[5]; // This is declaring array.
		
		// initializing data in array.
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		// accessing the elements in array.
		
		System.out.println("Elements in array :");
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println(arr[i]);
		}
	}

}

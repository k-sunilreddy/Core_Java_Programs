package com.array.fundamentals;

import java.util.Arrays;

//printing/finding the length of an array.
public class LengthOfArray {

	public static void main(String[] args) {
		
		// declaration and initialization of an array.
		int arr[]= {10,20,30,40,50,60};
		System.out.println("Elements in an array :"+Arrays.toString(arr));
		// printing the length of an array.
		System.out.print("Length of an current array is :");
		System.out.println(arr.length);
	}

}

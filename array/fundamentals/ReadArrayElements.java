package com.array.fundamentals;

import java.util.Arrays;
import java.util.Scanner;

// Read the elements in an array using scanner class.
public class ReadArrayElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int arr[]= new int[5]; // declaring the array
		
		System.out.println("Initialize elements in array :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt(); // initialize the elements in an array
		}
		
		//printing the elements in array
		System.out.println("Elements in an array :"+Arrays.toString(arr));
	}

}

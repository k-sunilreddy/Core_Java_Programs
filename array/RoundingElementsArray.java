package com.array;

import java.util.Arrays;

public class RoundingElementsArray {

	public static void main(String[] args) {
		int arr[]= {99,95,71,84,81,75,60};
		
		System.out.println("original Elements in an array:"+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i]=Math.round(arr[i]/10.0f)*10;
			
		}
		System.out.println("\nOutput:");
		System.out.println("\nRound of Elements array :" +Arrays.toString(arr));
	}

}

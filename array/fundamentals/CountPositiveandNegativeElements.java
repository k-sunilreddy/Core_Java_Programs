package com.array.fundamentals;

import java.util.Arrays;

//Counting the Positive and Negative Elements in given array.
public class CountPositiveandNegativeElements {

	public static void main(String[] args) {
		int[] arr= {-1,2,-3,4,5,6,7,8,9,-10,1,-5,3};
		
		System.out.println("Elements in original array :"+Arrays.toString(arr));
		int positive=0;
		int negative=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				positive++;
			}
			else
			{
				negative++;
			}
		}
		System.out.println("length of an Array :"+arr.length);
		System.out.println("Positive Elements in given array :"+positive);
		System.out.println("Negative elements in given array :"+negative);
	}

}

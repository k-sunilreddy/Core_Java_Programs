package com.array.fundamentals;

import java.util.Arrays;

// counting the even elements and odd elements sum separately.
public class CountEvenandOddElementsSum {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Elements in an Original Array :"+Arrays.toString(arr));
		int evensum=0;
		int oddsum=0;
		int even=0;
		int odd=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even=arr[i];
				evensum+=even;
			}
			else
			{
				odd=arr[i];
				oddsum+=odd;
			}
		}
		System.out.println("Count the even elements sum :"+evensum);
		System.out.println("Odd the odd elements sum :"+oddsum);
	}

}

package com.array.fundamentals;

import java.util.Arrays;

public class CountEvenandOddElements {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Elements in an Original Array :"+Arrays.toString(arr));
		int evencount=0;
		int oddcount=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evencount+=1;
			}
			else
			{
				oddcount+=1;
			}
		}
		System.out.println("Even elements count :"+evencount);
		System.out.println("Odd elements count :"+oddcount);
	}

}

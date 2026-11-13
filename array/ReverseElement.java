package com.array;

// Java Program to print the reverse of element in a given array.
//i/p : int arr[]={11,12,13,14,15,16}
//o/p : {11,21,31,41,51,61}

public class ReverseElement {

	public static void main(String[] args) {
		int arr[]= {11,12,13,14,15,16};
		
		System.out.println("Original Array :" );
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\nReverse of an element in an array :");
		for (int i=0; i<arr.length;i++)
		{
			int num=arr[i];
			int rev=0;
			while(num!=0)
			{
				int digit=num%10;
				rev=rev*10+digit;
				num/=10;
			}
			System.out.print(rev + " ");
		}
		
		
	}

}

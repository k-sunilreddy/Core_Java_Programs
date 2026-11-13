package com.array;

// find the distinct second largest element from given array.
// i/p : {7,5,8,26,26,13}
// o/p : 13

public class DistinctSecondLargestEle {

	public static void main(String[] args) {
		int arr[]= {7,5,8,26,26,13};
		System.out.println("Elements in an Array :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " "); // 7 5 8 26 26 13
		}
		
		// sorting in descending order.
		int temp=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for (int j=0;j<arr.length-1-i;j++)
			{
				if (arr[j]<arr[j+1]) 
				{
					temp=arr[j]; 	
					arr[j]=arr[j+1];
					arr[j+1]=temp;		
				}
				
			}
		}
		System.out.println("\nSorted Array :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +" ");
		}
		int res=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[0])
			{
				res=arr[i];
				break;
			}
		}
		System.out.println("\nDistinct Second Largest Element :" +res);
		
	}

}

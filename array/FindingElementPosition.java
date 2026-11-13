package com.array;

import java.util.Scanner;

// finding the element position in an array
public class FindingElementPosition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements in an array :");
		for(int i=0; i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		boolean status=false;
		System.out.println("Enter the Key element");
		int key=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
				status=true;
				System.out.println("Index of an array is found at an array :"+i);
			}
		}
		if(!status)
		{
			System.out.println("Element is not available :");
		}
		sc.close();
	}

}

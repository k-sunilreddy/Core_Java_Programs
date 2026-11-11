package com.array;

import java.util.Scanner;

// Finding the target element in an array
public class FindingElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of an array :");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target element :");
		int target=sc.nextInt();
		boolean status=false;
		for(int i=0;i<arr.length;i++)
		{
			
			if(target==arr[i])
			{
				status=true;
				System.out.println("Element is available");
				break;
			}
		}
		if(!status)
		{
			System.out.println("Element is not found");
		}
		sc.close();
	}

}

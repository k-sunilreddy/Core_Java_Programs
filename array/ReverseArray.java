package com.array;

import java.util.Arrays;
import java.util.Scanner;

// Printing the elements in an array in reverse order
public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the elements in an array :");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("Original Array :"+Arrays.toString(arr));
		int revarr[]=new int[n];
		for(int i=arr.length-1, j=0;i>=0;i--,j++)
		{
			revarr[j]=arr[i];
		}
		System.out.println("Reverse of an array :"+Arrays.toString(revarr));
		sc.close();
	}

}

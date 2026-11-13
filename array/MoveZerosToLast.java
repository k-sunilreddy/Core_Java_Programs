package com.array;

// printing an array where the array is moved to the last.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoveZerosToLast {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of an array :");
		for(int i=0; i < n; i++)
		{
			arr[i]=sc.nextInt();
		}
		List<Integer> list= new ArrayList<>();
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				list.add(arr[i]);
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				list.add(arr[i]);
			}
		}
		System.out.println("List after moving the zeros to last :");
		System.out.println(list +" ");
		
		sc.close();
	}
}

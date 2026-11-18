package com.array;

import java.util.Arrays;

// program to copy the elements of one array to another array.
public class ArrayCopy {

	public static void main(String[] args) {
		int [] oldarr= {1,2,3,4,5,6,7,8};
		int [] newarr;
		newarr=Arrays.copyOf(oldarr, oldarr.length);
		
		System.out.println("Original Array elements :"+Arrays.toString(oldarr));
		System.out.println("Copied Array Elements :"+Arrays.toString(newarr));
		
	}

}

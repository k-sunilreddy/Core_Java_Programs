package com.array;

// remove the duplicate elements in the given array.
public class DuplicateElements {

	public static void main(String[] args) {
		int [] arr= {1,2,5,7,1,3,7,4,2};
		
		for(int i=0;i<arr.length;i++)
		{
			boolean status=false;
			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					status=true;
					break;
				}
			}
			
			if(!status)
			{
				System.out.print(arr[i] + " ");
			}
		}
		
	}

}

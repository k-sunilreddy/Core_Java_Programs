package com.array;

public class FrequentCountOfElements {

	public static void main(String[] args) {
		int [] arr= {1,2,1,3,1,2,3,4,5,6,1,4,2}; // count 1--> 4, 2-->3,3-->2,4-->2,5-->1,6-->1
		
		boolean [] array=new boolean[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(array[i]==true)
			{
				continue;
			}
			int c=0;
			for (int j=i;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					c++;
					array[j]=true;
				}
			}
			System.out.println("Count of number "+arr[i]+" is :"+c);
		}
		
	}

}

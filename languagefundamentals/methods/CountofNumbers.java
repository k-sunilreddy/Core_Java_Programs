package com.languagefundamentals.methods;

public class CountofNumbers {
	static int a=733070893;
	static int count=0;
	
	static int countofdigits()
	{
		while(a>0)
		{
			a=a/10; // removes the last digit of the number that is 3 from 733070893 and assign the 73307089 to a
			count++; // every time incrementing count until loop runs 
			
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println("Main method started:");
		System.out.println("Total Count Of Numbers:"+countofdigits());
		
	}

}

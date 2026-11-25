package com.conditionalstatements;

// program to print the square pattern 
public class SquarePattern {

	public static void main(String[] args) {
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=5;j++)
			{
				System.out.print("* "); // here inner loop executes five times for every outer loop
			}
			System.out.println();
		}
	}

}

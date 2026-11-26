package com.conditionalstatements.loops;

import java.util.Scanner;

//Write a Java program using a for loop and if-else-if statements to print numbers from 1 to 50.  "Fizz" for numbers divisible by 5, 
//"Buzz" for numbers divisible by 3, and "Fizz & Buzz" for number which divisible by  both 3&5
public class TestDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to range :");
		int n=sc.nextInt();
		
		for(int i=1;i<=50;i++)
		{
			if(i%3 ==0 && i%5==0)
			{
				System.out.println("number " +i+ " is divisible by 3 and 5 : Fizz and Buzz");
			}
			else if(i%3 ==0 && i%5 !=0)
			{
				System.out.println("number " +i+ " is divisible by 3 : Fizz");
			}
			else if(i%5 ==0 && i%3 !=0)
			{
				System.out.println("number " +i+ " is divisible by 5 : Buzz");
			}
			else
			{
				System.out.println("number " +i+ " is not divisible by 3 and 5");
			}
		}
		sc.close();
	}

}

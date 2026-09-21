package com.languagefundamentals.methods;


// calculating sum of numbers from 1 to 10
public class SumofNumbers {
	static int a=1;
	static int sum=0;
	static int totalCountOfNum()
	{
		while(a<=10)
		{
			sum+=a;
			a++;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Main Method Started:");
		System.out.println("Sum of Total Numbers:"+totalCountOfNum());

	}

}

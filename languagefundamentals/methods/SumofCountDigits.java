package com.languagefundamentals.methods;

// calculating sum of count of digits of a number.
public class SumofCountDigits {

	static int a=733070893;
	static int count=0;
	static int sum=0;
	
	// declaration of static method with return type and no parameters
	static int sumofCount()
	{
		while (a>0)
		{
			a=a/10;
			int c=count++;
			System.out.println("Digit count:"+c);
			sum+=c;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("Sum of count digits of a Number:" +sumofCount());

	}

}

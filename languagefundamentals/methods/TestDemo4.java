package com.languagefundamentals.methods;

public class TestDemo4 {

	static int a=10, b=20;
	// Method with return type and no parameters
	static double sumOfTwonumbers()
	{
		System.out.println("*******ADDITION OF NUMBERS********");
		double sum=a+b;
		System.out.println("Value of A:"+a+"\nValue of B:"+b+"\nSum Of Two Numbers:");
		return sum;
		
	}
	
	static double differenceOfnumbers()
	{
		System.out.println("*******DIFFERENCE BETWEEN NUMBERS********");
		double diff=a-b;
		System.out.println("Value Of A:"+a+"\nValue Of B:"+b+"\nDifference Between Numbers:");
		return diff;
	}
	static double multiplicationOfmethods()
	{
		System.out.println("*******MULTIPLICATION OF NUMBERS********");
		double product=a*b;
		System.out.println("Value Of A:"+a+"\nValue Of B:"+b+"\nProduct Of Numbers:");
		return product;
	}
	static double division()
	{
		System.out.println("*******DIVISION OF NUMBERS********");
		double result=a/b;
		System.out.println("Value Of A:"+a+"\nValue Of B:"+b+"\nResult:");
		return result;
	}
	static int modulus()
	{
		System.out.println("*******MODULUS OF NUMBERS********");
		int result=a%b;
		System.out.println("Value Of A:"+a+"\nValue Of B:"+b+"Remainder:");
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result=sumOfTwonumbers();
		System.out.println(result);
		System.out.println(differenceOfnumbers());
		System.out.println(multiplicationOfmethods());
		System.out.println(division());
		System.out.println(modulus());
	}

}

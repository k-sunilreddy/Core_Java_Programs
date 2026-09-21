package com.languagefundamentals.methods;


// Determining the Even and Odd Numbers
public class EvenAndOddNumbers {
	
	long n;
	String numberIs;
	String numberIs()
	{
		// even number is divisible by 2 where odd numbers are divisible 1.
		
		if (n%2==0)
		{
			numberIs=n+" is Even Number";
		}
		else
		{
			numberIs=n+"is Odd Number";
		}
		return numberIs;
	}
	public static void main(String[] args) {
		EvenAndOddNumbers e=new EvenAndOddNumbers();
		e.n=7496;
		System.out.println(e.numberIs());

	}

}

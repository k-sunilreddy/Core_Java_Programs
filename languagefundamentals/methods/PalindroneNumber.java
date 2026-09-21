package com.languagefundamentals.methods;

// check the number is palindrone number or not using method with return type and no parameters.
import java.util.Scanner;

// method with return type and no parameters.
public class PalindroneNumber {
	
	// declaration of static variables
	static int a;
	static String palindrone()
	{
		int res=0;
		int temp=a;
		
		// using while loop to iterate until the condition satisfies.
		while(a>0)
		{	
			int digit=a%10;
			res=res*10 + digit;
			a=a/10;
		}
		
		// if - else conditional statement to check condition.
		if (res==temp)
		{
			return temp+" is Palindrone Number";
		}
		else
		{
			return temp+" is not Palindrone Number";
		}
		
	}
	public static void main(String[] args) {
		
		// declaration of scanner class to take input from console.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number:");
		a=sc.nextInt();
		System.out.println(palindrone());
		sc.close();
	}

}

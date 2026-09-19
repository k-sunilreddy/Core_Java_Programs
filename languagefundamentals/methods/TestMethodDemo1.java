package com.languagefundamentals.methods;

//Take 4 instance methods as addition,Subtraction , multiplication, division with two parameters in each method 
//call the only one method in main and pass two arguments that match method signature and perform arithmetic operation with arguments and print the result.
//result value  of each method should be first argument of next method we call 
//at last execute the program and display the results . 

public class TestMethodDemo1 {
	// method addition
	void addition(int a, int b)
	{
		int sum = a + b;
		System.out.println("Addition of two values is:"+sum);//30
		
		//calling the subtraction method passing values to subtraction method with previous method result and new value
		subtraction(sum,10);
		
	}
	
	//method subtraction
	void subtraction(int sum,int b)
	{
		int difference=sum - b;
		System.out.println("Difference of two values is:"+difference);//20
		
		// calling the multiplication method passing values to multiplication method with previous method result and new value
		multiplication(difference,5);
	}
	
	//method multiplication
	void multiplication(int difference, int b)
	{
		int product = difference * b;
		System.out.println("Product of two values is:"+product);//100
		
		// calling the division passing values to division method with previous method result and new value
		division(product,10);
	}
	
	//method division
	void division(int product, int b)
	{
		int division=product/b;
		System.out.println("Division of two values:"+division);//10
	}
	public static void main(String[] args) {
		
		// creating object for class to call instance methods
		TestMethodDemo1 t= new TestMethodDemo1();
		
		// calling the addition method using object t.
		t.addition(10, 20);

	}

}

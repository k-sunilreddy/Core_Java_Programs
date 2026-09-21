package com.languagefundamentals.methods;

// calculating the product of numbers up to a range.
public class ProductOfNumbers {
	int a;
	int product=1;
	int product()
	{
		// returning total product of numbers from 1 to 10. 
		while(a<10)
		{
			product*=a;
			a++;
		}
		return product;
	}
	public static void main(String[] args) {
		ProductOfNumbers p=new ProductOfNumbers();
		p.a=1;
		System.out.println("Product Of Number 1 to 10 :"+p.product());

	}

}

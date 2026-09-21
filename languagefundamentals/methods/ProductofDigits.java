package com.languagefundamentals.methods;

// calculating the product of digits of a number.
public class ProductofDigits {
	int a;
	int product=1;
	int product()
	{
		while (a>0)
		{
			int digit=a%10;
			product*=digit;
			a=a/10;
			
		}
		return product;
	}
	public static void main(String[] args) {
		ProductofDigits p=new ProductofDigits();
		p.a=733;
		System.out.println(p.product());

	}

}

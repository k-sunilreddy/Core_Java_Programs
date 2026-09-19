package com.languagefundamentals.methods;

public class Bank_Account {
	static double Balance=1000;
	void deposit(int amount)
	{
		System.out.println("Place your deposit amount:"+amount);
		Balance+=amount;
		System.out.println("your final balance:"+Balance);
	}
	void withdraw(int amount)
	{
		System.out.println("Enter your withdrawal amount:"+amount);
		Balance-=amount;
		System.out.println("your final balance:"+Balance);
	}
	
	
	public static void main(String[] args) {
		Bank_Account b=new Bank_Account();
		System.out.println("Initial Balance:"+Balance);
		b.deposit(500);
		//b.withdraw(200);
	}

}

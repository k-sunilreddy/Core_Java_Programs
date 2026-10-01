package com.languagefundamentals.constructors;

// Created Bank Account class with instance variables
// create Parameterized constructor and copy constructor and initialize values in copy constructor.

public class BankAccount {
	
	// instance variables to bank account
	long accountNumber;
	String accountHolderName;
	double balance;
	String branch;
	
	// parameterized constructor

	BankAccount(long accountNumber,String accountHolderName, double balance, String branch)
	{
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
		this.branch=branch;
	}
	
	// copy constructor --> copying the same parameters of parameterized constructor to copy constructor.
	BankAccount(BankAccount account)
	{
		this.accountNumber=account.accountNumber;
		this.accountHolderName=account.accountHolderName;
		this.balance=account.balance;
		this.branch=account.branch;
	}
	
	
	// display method to display the details of bank account
	
	void displaybankaccountdetails()
	{
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Account Holder Name : "+accountHolderName);
		System.out.println("Account Holder Balance : "+balance);
		System.out.println("Account Holder branch : "+branch);

	}
	
	// main method 
	public static void main(String[] args) {
		
		// object created
		BankAccount c1=new BankAccount(38846272405l,"Sunil Reddy",38000,"Kakinada");
		System.out.println("\n ******** Original Account Details ****** \n ");
		c1.displaybankaccountdetails();
		
		// new object created that calls the copy constructor
		BankAccount c2=new BankAccount(c1);
		c2.branch="Hyderabad";
		c2.balance=50000;
		
		System.out.println("\n ********* Copied Account Details ********** \n ");
		c2.displaybankaccountdetails();
		
	}

}

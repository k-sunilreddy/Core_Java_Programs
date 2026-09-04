package com.javaintroduction;

public class BankAccount {
	// static variable as Bank Account Number is shared to across all instance classes in class.
	static int Bank_Account_Number=388462;
	// instance variable variable declaration
	long BankAccountNumber;
	String Bank_Holder_Name;
	double Bank_Balance;
	//instance block runs automatically when object is created 
	{
		Bank_Account_Number++;
	}
	
	// show method is to display all related data of instance variables
	void show() 
	{
		BankAccountNumber=Bank_Account_Number;
		System.out.println("Customer Account Number: "+ BankAccountNumber);
		System.out.println("Bank Account Holder Name: "+ Bank_Holder_Name);
		System.out.println("Customer Bank Balance: "+Bank_Balance);
		System.out.println();
	}
	public static void main(String[] args) {
		
		// Creating Object1
		// instance variables are invoke when object is created.
		BankAccount b=new BankAccount();
		b.Bank_Holder_Name="Sunil Reddy";
		b.Bank_Balance=35000.50;
		b.show();
		
		// Object2 creation
		BankAccount b2=new BankAccount();
		b2.Bank_Holder_Name="Jagadeeswari";
		b2.Bank_Balance=29000.95;
		b2.show();
		
		// Object3 Creation
		BankAccount b3=new BankAccount();
		b.Bank_Holder_Name="Venkata Ramana";
		b.Bank_Balance=25000;
		b.show();
		
		// Object4 Creation
		BankAccount b4=new BankAccount();
		b4.Bank_Holder_Name="Lakshmi";
		b4.Bank_Balance=10000;
		b4.show();
	}

}

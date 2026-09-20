package com.languagefundamentals.methods;

// creating methods without return type and with parameters for user bank account.

public class User_BankAccount {

	static String bankAccount="SBI";
	static int accountNumber=123456789;
	static String accountName="Sunil Reddy";
	static double balance;
	static String address="Kakinada";
	
	// deposit method without return type and with parameters
	static void deposit(double damount)
	{
		balance+=damount;
		System.out.println("Your Deposit amount:"+damount);
		System.out.println("After Deposit your Current Balance:"+balance);
	}
	// withdraw method without return type and with parameters
	static void withdraw(double wamount)
	{
		if (wamount > 0 && wamount <= balance)
		{
			System.out.println("Your Withdraw amount:"+wamount);
			balance-=wamount;
			System.out.println("After Withdraw your current balance :"+balance);
		}
		else if(wamount > balance)
		{
			System.out.println("Trasaction Failed ! Insufficient Funds in your Bank account!");
		}
		else
		{
			System.out.println("Invalid Withdraw Amount");
		}
	}
	// method check balance without return type and with parameters
	static void checkbalance()
	{
		System.out.println("Your Current Balance in Bank account:"+balance);
	}
	
	// method update address without return type and with parameters
	static void updateAddress(String newaddress)
	{
		if(newaddress.equals(address))
		{
			System.out.println("your current address:"+address);
		}
		else
		{
			System.out.println("Old Address is:"+address);
			address=newaddress;
			System.out.println("your new Address:"+address);
		}
		System.out.println("*******************************************************************");
	}
	
	// Main method 
	public static void main(String[] args) {
		System.out.println("Main method started");
		deposit(1000);
		updateAddress("Hyderabad");
		
	}

}

package com.languagefundamentals.constructors;

public class BankApplication {
	int accountNumber;
	String customerName;
	String accountType;
	double balance;
	
	BankApplication(int accountNumber,String customerName, String accountType, double balance)
	
	{
		this.accountNumber=accountNumber;
		this.customerName=customerName;
		this.accountType=accountType;
		this.balance=balance;
	}
	
	void display()
	{
		System.out.println("\n******************** Customer Info ******************\n");
		System.out.println("Bank Account Number :"+accountNumber);
		System.out.println("Customer Name :"+customerName);
		System.out.println("Account Type :"+accountType);
		System.out.println("Account Balance :"+balance);
	}
	
	public static void main(String[] args) {
		BankApplication c1= new BankApplication(2405,"Sunil Reddy","Saving Account",38000);
		BankApplication c2=new BankApplication(2406,"Jagadeeswari","Current Account", 30000);
		c1.display();
		c2.display();
	}

}

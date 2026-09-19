package com.datatypes;

// Importing Scanner class from java libraries
import java.util.Scanner;

public class User_ATM_Info {
	
	//declaration of instance variables with primitive data types
	int account_number;
	int pin_number;
	int deposit;
	int withdrawal;
	float check_balance;
	
	// creating instance method with return type and with arguments
	void deposit(int depositamount)
	{
		System.out.println("Your Amount is Succesfully Credited: "+depositamount);
		check_balance+=depositamount;
	}
	
	void withdrawal(int withdrawal)
	{
		// using if-else condition statements to check condition while doing withdrawal amount.
		if (withdrawal > check_balance)
		{
			System.out.println("Unable to withdrawal, due to your Withdrawal amount greater than your Current Balance:");
		}
		else
		{
			System.out.println("Your Withdrawal Amount "  +withdrawal+" is successfully completed\nPlease collect your amount and take your card");
			check_balance-=withdrawal;
		}
		
	}
	
	void check_balance()
	{
		System.out.println("Your Current Balance:"+check_balance);
		
	}
	
	// main method starts here
	public static void main(String[] args) {
		//creating object for class
		User_ATM_Info u=new User_ATM_Info();
		
		//creating object to Scanner class and reading the input from console.
		Scanner sc=new Scanner(System.in);
		int choice;
		
		// using do-while loop
		do 
		{
			System.out.println("\n --- ATM MENU --- ");
			System.out.println("Please Enter Your Choice:");
			System.out.println("1. Deposit");
			System.out.println("2. Withdrawal");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			
			// taking input from user and assigning to variable choice.
			choice=sc.nextInt();
			
			// using switch case to select users choice based on requirement.
			switch(choice)
			{
			case 1: 
				System.out.println("Enter your amount to deposit:");
				int depositamount=sc.nextInt();
				u.deposit(depositamount);
				break;
			case 2: 
				System.out.println("Enter your amount to withdrawal:");
				int withdrawal=sc.nextInt();
				u.withdrawal(withdrawal);
				break;
			case 3: 
				u.check_balance();
				break;
			case 4: 
				System.out.println("Thank you for using ATM! Please take your card");
				break;
				
			default:
				System.out.println("Invalid Reponse ! Please enter your choice between 1 to 4");
				
			}
		}
		while (choice!=4);
		
	}

}

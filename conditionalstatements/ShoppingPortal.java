package com.conditionalstatements;

// Developed  a Small Project Outcome on introducing about the Online Shopping Portal.
// This Project Covers Scanner Class, Data types , Variables, Operators, Conditional Statements.
import java.util.Scanner;

public class ShoppingPortal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.err.println("******* WELCOME TO ONLINE SHOPPING PORTAL *******");
		
		System.out.println("Enter Customer Name :");
		String name=sc.nextLine();
		
		System.out.println("Enter Product Name :");
		String product=sc.nextLine();
		
		System.out.println("Enter Product Price :");
		double price=sc.nextDouble();
		
		System.out.println("Enter Product Quantity :");
		int quantity=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Customer Location :");
		String loc=sc.nextLine();
		
		System.out.println("Do you Premium Member (Yes/No)");
		String member=sc.nextLine();
		
		// calculation of total amount
		
		double totalAmount=price*quantity;
		double discount=0;
		double discountAmount=0;
		double deliveryCharge=0;
		double finalAmount=0;
		
		// discount calculation
		// used Relational(Compound) Operators
		if (product.equalsIgnoreCase("laptop"))
		{
			if (totalAmount >= 50000)
			{
				discount=20;
			}
		
			else if(totalAmount >= 40000)
			{
				discount=15;
			
			}
		}
		else
		{
			if (product.equalsIgnoreCase("mobile"))
			{
				if (totalAmount >= 35000)
				{
					discount=10;
				}
		
				else if (totalAmount >=30000)
				{
					discount =5;
				}
			}
			else
			{
				discount =0;
			}
		}
		
		// if premium member, then discount
		
		if (member.equalsIgnoreCase("yes"))
		{
			discount+=5; // used Assignment Operator
		}
		
		// discount amount calculation
		discountAmount = totalAmount * discount/100;
		
		double amountafterdiscount= totalAmount - discountAmount;
		
		// delivery charge
		
		if (amountafterdiscount >= 20000)
		{
			deliveryCharge =0;
		}
		else
		{
			deliveryCharge=100;
		}
		
		// Final Amount 
		finalAmount = deliveryCharge + amountafterdiscount; 
		
		System.err.println("\n****** CUSTOMER BILL ******\n");
		
		System.out.println("Customer Name :"+name);
		System.out.println("Product Name  :"+product);
		System.out.println("Product Price :"+price);
		System.out.println("Product Quantity :"+quantity);
		System.out.println("Customer Location :"+loc);
		System.out.println("Total Amount :"+totalAmount);
		System.out.println("Discount On Product :"+discount+"%");
		System.out.println("Discount Amount:"+discountAmount);
		System.out.println("Amount After Discount :"+amountafterdiscount);
		System.out.println("Deliver charge :"+deliveryCharge);
		System.out.println("Final Amount :" +finalAmount);
		
		if (member.equalsIgnoreCase("yes"))
		{
			if (finalAmount >= 15000)
			{
				System.out.println("Congratulation ! your are eligible for premium reward");
			}
			else
			{
				System.out.println("Thank you for being premium member");
			}
		}
		else
		{
			if (finalAmount >= 25000)
			{
				System.out.println("you are eligible to become a premium member");
			}
			else
			{
				System.out.println("Become a premium member to get additional benefits");
			}
		}
		sc.close();
	}

}

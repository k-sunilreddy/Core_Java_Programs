package com.cjproject;

import java.util.ArrayList;
import java.util.Scanner;


// Developing the online shopping cart super market management system project outcome using switch case, conditional statements, loops.
public class OnlineShoppingCartSuperMarket {

	static class Products
	{
		int proId;
		String proName;
		double price;
		int quantity;
		
		Products(int proId,String proName, double price, int quantity)
		{
			this.proId=proId;
			this.proName=proName;
			this.price=price;
			this.quantity=quantity;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("==============================================");
		System.out.println("Online Shopping Super Market Management System");
		System.out.println("==============================================");
		
		ArrayList<Products> cart=new ArrayList<>();
		
		System.out.println("Enter the customer name :");
		String name=sc.nextLine();
		
		System.out.println("Enter customer mobile number :");
		long mobnum=sc.nextLong();
		
		double price=0;
		double discount=0;
		int quantity =0;
		double totalamount=0;
		
		while (true)
		{
			System.out.println("\nEnter your service needed :");
			System.out.println("\n1.Add Product\n2.Calculate Bill\n3.Apply Discount\n4.Display Final Amount\n5.Exit\n");
			int service=sc.nextInt();
			
			switch(service)
			{
				case 1 ->
					{
						System.out.println("Enter how many products do you want to add :");
						int count=sc.nextInt();
						for (int i=1;i<=count;i++)
						{
							System.out.println("----------------- Enter Product " +i+ " Details ---------------");
							
							System.out.println("Enter the product Id :");
							int proId=sc.nextInt();
							
							sc.nextLine();
							
							System.out.println("Enter the product Name :");
							String proName=sc.nextLine();
							
							System.out.println("Enter the Product Price :");
							price=sc.nextDouble();
							
							System.out.println("Enter Product Quantity :");
							quantity=sc.nextInt();
							
							Products p=new Products(proId,proName,price,quantity);
							
							cart.add(p);
							System.out.println("Product Added Successfully");
							
						}
					}
				case 2 ->
				{
					for(Products p:cart)
					{
						totalamount+=p.price * p.quantity;
					}
					System.out.println("-------------------------------------------------------");
					System.out.println("Calculated Product Bill Amount Rs."+totalamount);
					System.out.println("-------------------------------------------------------");
				}
				
				case 3 ->
				{
					if (totalamount > 5000)
					{
						discount=totalamount*0.15;
						System.out.println("-------------------------------------------------------");
						System.out.println("Congratulations you earned 15% discount on billing amount");
					}
					else
					{
						discount=0;
						System.out.println("-------------------------------------------------------");
						System.out.println("Sorry! No discount is availaible on your billing amount");
					}
					System.out.println("Discount Amount :"+discount);
				}
				case 4 ->
				{
					totalamount=0;
					System.out.println("\n=================== FINAL BILL ========================");
					System.out.println("Customer Name :"+name);
					System.out.println("Customer Mobile Number :"+mobnum);
					
					System.out.println("\n-------------------------------------------------------");
					
					System.out.printf("%-15s %-15s %-10s %-5s%n", "Product Id", "Product","Price","Quantity");
					System.out.println("-------------------------------------------------------");
					for(Products p:cart)
					{
						System.out.printf("%-15s %-15s %-10s %-5s%n", p.proId, p.proName, p.price, p.quantity);
						totalamount+=p.price*p.quantity;
					}
					if (totalamount > 1000)
					{
						discount=totalamount*0.15;
					}
					else
					{
						discount=0;
					}
					double finalamount=totalamount-discount;
					System.out.println("\n-------------------------------------------------------");
					
					System.out.println("Total amount Rs."+totalamount);
					System.out.println("Discount amount Rs."+discount);
					System.out.println("Final Bill Amount Rs."+finalamount);
					
					System.out.println("\n=======================================================\n");
					System.out.println("Thank You for Shopping ! Have a Nice Day");
					break;
				}
				
				case 5 ->
				{
					System.out.println("\n=======================================================\n");
					System.out.println("Thank you Visit Again");
					System.out.println("\n=======================================================\n");
				}
				default ->
				{
					System.out.println("Invalid Service! Please Try Again");
				}
			}	
		}
	}
}


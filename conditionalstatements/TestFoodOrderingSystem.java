package com.conditionalstatements;

// Developed a Small Project Out Come Related to the Online Food Ordering System.
// This Project Covers Variables, Data types, Operators, Conditional Statements, Switch Case and Scanner Class.

import java.util.Scanner;

public class TestFoodOrderingSystem {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.err.println("Welcome to Hyderabadi Food Court");
		
			double finalbill=0;		
			String yn="";
			do 
			{
				System.out.println("**** CHECK MENU CARD ****");
				
				System.out.println("1. Pizza       -  200 Rs/-");
				System.out.println("2. Burger      -  120 Rs/-");
				System.out.println("3. Biryani     -  180 Rs/-");
				System.out.println("4. Noodles     -  100 Rs/-");
				
				System.out.println("Enter your Food Item :");
				int val=sc.nextInt();
				
				double price=0;
				String item=" ";
				
				switch(val)
				{
				case 1 -> 
					{
						item ="Pizza";
						price=200;
					}
				case 2 ->
					{
						item = "Burger";
						price=120;
					}
				case 3 ->
					{
						item = "Biryani";
						price=180;
								
					}
				case 4 ->
					{
						item = "Noodles";
						price=100;
								
					}
				default -> 
					{
						System.out.println("Entered Product is not available, Please Check !");
					}
				}
				if (price > 0)
				{
					System.out.println("Enter the Food Quantity :");
					int quantity = sc.nextInt();
					if(quantity > 0)
					{
						double ordereditem= price*quantity;
						finalbill += ordereditem;
						
						System.err.println("********* Your Ordered Food Items **********");
						
						System.out.println("Selected Food item :"+item);
						System.out.println("Food item price    :"+price);
						System.out.println("Food item Quantity :"+quantity);
						System.out.println("Ordered Item Price :"+ordereditem);
						System.out.println("Total Bill Amount  :"+finalbill);
						
					}
					else
					{
						System.out.println("Invalid Quantity, Please enter the item quantity greater than 0");
					}
				}
				System.err.println("********** FINAL BILL *************");
				System.out.println("Your Final Bill Amount :"+finalbill);
				System.err.println("Do you want to continue to order! Click y for YES or n No ");
				yn= sc.next();
				
			}
			while(yn.equalsIgnoreCase("y"));
			
			System.out.println("Thank You! Visit Again ");
			sc.close();
	}

}

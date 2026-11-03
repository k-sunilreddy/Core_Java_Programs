package com.conditionalstatements.switchcases;

import java.util.Scanner;

// Developing a small project outcome on Restaurant Food: Invoice Management System using nested Switch Cases.

public class RestaurantFood_Invoice_System {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("********** WELCOME TO HYDERABADI NAWAB RESTAURANT'S ***********");
		
		System.out.println("\nSelect your Food Category : Veg-Biryani/Non-Veg-Biryani/Desserts/ Drinks");
		String category=sc.next();
		
		int price=0;
		String food_item=" ";
		
		switch(category)
		{
		
		case ("Non-Veg-Biryani") ->
			{
				System.out.println("***** HYDERABADI NAWAB NON-VEG BIRYANI'S MENU *******");
				System.out.println("1. Chicken Dum Biryani 			- 300 Rs/-");
				System.out.println("2. Chicken Fry Bit Biryani      - 350 Rs/-");
				System.out.println("3. Prawn Biryani 	     	 	- 300 Rs/-");
				System.out.println("4. Chicken Biryani              - 200 Rs/-");
				System.out.println("5. Mutton Dum Biryani           - 400 Rs/-");
				System.out.println("6. Mutton Biryani               - 350 Rs/-");
				System.out.println("7. Mughlai Biryani              - 350 Rs/-");
				
				System.out.print("\nPlease select food item number :");
				int non_Item = sc.nextInt();
				
				switch(non_Item)
				{
				case 1 ->
					{
						food_item="Chicken Dum Biryani";
						price = 300 ;
					}
				case 2 ->
					{
						food_item="Chicken Fry Bit Biryani";
						price = 350;
					}
				case 3 ->
					{
						food_item ="Prawn Biryani";
						price=300;
					}
				case 4 ->
					{
						food_item ="Chicken Biryani";
						price=200;
					}
				case 5 ->
					{
						food_item ="Mutton Dum Biryani";
						price=450;
					}
				case 6 ->
					{
						food_item ="Mutton Biryani";
						price=300;
					}
				case 7 ->
					{
						food_item ="Mughlai Biryani";
						price = 350;
					}
				default ->
					{
						System.out.println("Sorry! your entered food item is not available");
					}
				}
			}
		case ("Veg-Biryani") ->
			{
				System.out.println("***** HYDERABADI NAWAB VEG BIRYANI'S MENU *******");
				
				System.out.println("1. Veg Dum Biryani			- 200 Rs/-");
				System.out.println("2. Veg Munchoria Fried Rice		- 250 Rs/-");
				System.out.println("3. Paneer Biryani			- 200 Rs/-");
				System.out.println("4. Mushroom Biryani			- 250 Rs/-");
				System.out.println("5. Veg Dum Biryani (Special)		- 300 Rs/-");
				System.out.println("6. Baby Corn Biryani			- 300 Rs/-");
				System.out.println("7. Paneer Tikka Biryani			- 350 Rs/-");
				
				System.out.print("\nPlease Select your food item :");
				int veg_Item = sc.nextInt();
				
				switch(veg_Item)
				{
				case 1 ->
					{
						food_item="Veg Dum Biryani";
						price = 200;
					}
				case 2 ->
					{
						food_item="Veg Munchoria Fried Rice";
						price = 250;
					}
				case 3 ->
					{
						food_item="Panner Biryani";
						price = 200;
					}
				case 4 ->
					{
						food_item="Mushroom Biryani";
						price = 250;
					}
				case 5 ->
					{
						food_item="Veg Dum Biryani (Special)";
						price = 300;
					}
				case 6 ->
					{
						food_item="Baby Corn Biryani";
						price = 300;
					}
				case 7 ->
					{
						food_item="Panner Tikka Biryani";
						price = 350;
					}
				default ->
					{
						System.out.println(" \nSorry ! your entered Product is not available");
					}
				}
			}
		case ("Desserts")->
		{
			System.out.println("***** HYDERABADI NEW DESSERTS MENU *******");
			System.out.println("1. Gulab Jamun (4)           - 100 Rs/-");
			System.out.println("2. Double Ka Meetha          - 150 Rs/-");
			System.out.println("3. Rasmalai                  - 120 Rs/-");
			System.out.println("4. Apricot Delight           - 180 Rs/-");
			System.out.println("5. Butter Scotch             - 150 Rs/-");
			System.out.println("6. Chocolate Brownie         - 150 Rs/-");
			System.out.println("7. Fruit Salad               - 120 Rs/-");
			System.out.println("8. Ice Cream                 - 100 Rs/-");
			
			System.out.print("\nPlease Select your Dessert :");
			int dessert=sc.nextInt();
			
			switch (dessert)
			{
			case 1 ->
				{
					food_item="Gulab Jamun";
					price=100;
				}
			case 2 ->
				{
					food_item="Double a Meetha";
					price = 150;
				}
			case 3 ->
				{
					food_item="Rasamalai";
					price = 120;
				}
			case 4 ->
				{
					food_item = "Apricot Delight";
					price = 180;
				}
			case 5 ->
				{
					food_item = "Butter Scotch";
					price = 150;
				}
			case 6 ->
				{
					food_item ="Chocalate Brownie";
					price = 150;
				}
			case 7 ->
				{
					food_item = "Fruit Salad";
					price = 120;
				}
			case 8 ->
				{
					food_item = "Ice Creme";
					price = 100;
				}
			default ->
				{
					System.out.println("Sorry! your entered product is not available ");
				}
			}
		}
		case ("Drinks") ->
		{
			System.out.println("******** HYDERABADI NAWAB FAMOUS DRINKS MENU ********");

			System.out.println("1. Hyderabadi Lassi          - 80 Rs/-");
			System.out.println("2. Badam Milk                - 100 Rs/-");
			System.out.println("3. Falooda                   - 150 Rs/-");
			System.out.println("4. Shahi Sharbat             - 120 Rs/-");
			System.out.println("5. Mango Lassi               - 120 Rs/-");
			System.out.println("6. Sweet Lime Juice          - 100 Rs/-");
			System.out.println("7. Fresh Watermelon Juice    - 100 Rs/-");
			System.out.println("8. Sugarcane Juice           - 80 Rs/-");
			
			System.out.print("\nPlease Select your Drink :");
			int drink=sc.nextInt();
			
			switch(drink)
			{
			case 1->
				{
					food_item="Hyderabadi Lassi";
					price =80;
				}
			case 2 ->
				{
					food_item="Badam Milk";
					price = 100;
				}
			case 3 ->
				{
					food_item="Falooda";
					price = 150;
				}
			case 4 ->
				{	
					food_item="Shahi Sharbat";
					price=120;
				}
			case 5 ->
				{
					food_item="Mango Lassi";
					price=120;
				}
			case 6 ->
				{
					food_item="Sweet Lime Juice";
					price=100;
				}
			case 7 ->
				{
					food_item="Fresh Water Melon";
					price=100;
				}
			case 8 ->
				{
					food_item="Sugarcane Juice";
					price=80;
				}
			default ->
				{
					System.out.println("Sorry! your Entered Product is not available:");
				}
			
			}
		}
		default -> 
			{
				System.out.println("Invalid Category ! Please Enter Valid Category");
			}
		}
		if (price>0)
		{
			System.out.print("\nEnter the Quantity of Food Item :");
			int quantity=sc.nextInt();
			if (quantity > 0)
			{
				double ordered_item=price*quantity;
				double finalbill=ordered_item;
				System.out.println(" \n******** YOUR INVOICE ********");
				System.out.println("Selected Food Item      :"+food_item);
				System.out.println("Food Item Price         :"+price);
				System.out.println("Ordered Quantity        :"+quantity);
				System.out.println("Ordered Food Item Price :"+ordered_item);
				System.out.println("Final Bill Amount       :"+finalbill);
			}
			else
			{
				System.out.println("Invalid Quantity! please select your food item quantity");
			}
		}
		
		
	}

}

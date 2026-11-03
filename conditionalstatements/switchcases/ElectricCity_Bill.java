package com.conditionalstatements.switchcases;

import java.util.Scanner;

public class ElectricCity_Bill {

	public static void main(String[] args) {
		System.err.println(" ********* WELCOME EASTERN POWER SYSYTEM *********");
		Scanner sc=new Scanner(System.in);
		
		String yn;
		do
		{			
			int units =0;
			double price =0;
			int unitcharge=0;
			
			System.out.println("Select your Connection Type Number");
			System.out.println("Domestic\nCommercial");
			
			String connectionType=sc.next();
				
				connectionType=connectionType.substring(0,1).toUpperCase() + connectionType.substring(1);
				switch(connectionType)
				{
					case "Domestic" ->
					{
						System.out.println("Enter the number of units :");
						units=sc.nextInt();
						
						if (units > 0 && units <= 100)
						{
							unitcharge=2;
							price=units*unitcharge;
		
						}
						else
						{
							unitcharge += 3;
							price=units*unitcharge;
		
						}
						
					}
					case "Commercial" ->
					{
						System.out.println("Enter the number of units :");
						units=sc.nextInt();
						
						if(units > 0 && units <= 100)
						{
							unitcharge=4;
							price=units*unitcharge;
						}
						else if(units > 100 && units <=300)
						{
							unitcharge=6;
							price=units*unitcharge;
		
						}
						else
						{
							unitcharge=8;
							price=units*unitcharge;
						}
						
						
					}
					default ->
					{
						System.out.println("Invalid Connection Type! please enter your connection type correctly ");
					}
					
				}
				if (units > 0 && (connectionType.equalsIgnoreCase("Domestic")) || (connectionType.equalsIgnoreCase("Commercial")))
				{
					System.err.println("\n*********** BILL AMOUNT *********");
					System.out.println("Your Connection Type is :"+connectionType);
					System.out.println("Number of Units Consumed :"+units);
					System.out.println("Rate per Unit :"+unitcharge);
					System.out.println("Your "+connectionType+" Current Bill Amount :"+price);
				}
				System.out.println("\nDo you want to continue for checking bills ? then click y for Yes n for No");
				yn=sc.next();
				System.out.println("Thank you for using Eastern Power System");
				
		}
		while (yn.equalsIgnoreCase("y"));	
		sc.close();
	}

}

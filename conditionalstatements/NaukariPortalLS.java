package com.conditionalstatements;

import java.util.Scanner;

public class NaukariPortalLS {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.err.println("\n******* WELCOME TO NAUKRI PORTAL ************\n");
		System.out.println("Enter the Your Name :");
		String name=sc.nextLine();
		
		System.out.println("Enter your Educational Qualification :");
		String qualification=sc.next();
		
		System.out.println("Enter your Percentage :");
		int percentage=sc.nextInt();
		
		System.out.println("Enter your Years Of Experience :");
		int experience=sc.nextInt();
		
		System.out.println("Do you know Java? (yes/no)");
		String skill=sc.next();
		
		if (name!=null)
		{
			System.err.println("\n********* Job Eligibility *********** \n");
			System.out.println("Welcome To Naukri Portal Dear : "+name);
			if (qualification.equalsIgnoreCase("B.Tech"))
			{
				System.out.println("Great to have your Educational Qualification :"+qualification);
				if (percentage >=60)
				{
					System.out.println("Good ! your Percentage is matched with our eligibility criteria");
					if (experience >=2)
					{
						System.out.println("Your experience is matched with our eligibility criteria");
						if (skill.equalsIgnoreCase("Yes"))
						{
							System.out.println("Congratulation your Profile is matched with our eligibility criteria");
							System.out.println("Be prepared for the interview, our team will shortly contact you");
						}
						else
						{
							System.out.println("Sorry your skills are not matching with our eligibility criteria");
						}
					}
					else
					{
						System.out.println("Sorry! we are unable to proceed with your experience");
					}
				}
				else
				{
					System.out.println("Sorry ! your percentage is not matched with our eligibility criteria");
				}
			}
			else
			{
				System.out.println("Sorry! your Educational Qualificatio is not matched with our eligibility criteria");
			}
		}
		else
		{
			System.out.println("Enter your Name First ");
		}
		
		sc.close();
	}

}

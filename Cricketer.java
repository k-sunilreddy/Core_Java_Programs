package com.javaintroduction;

public class Cricketer {
	
	//Declaration of static variable
	static int Country_id=100;
	static String Country_Name="India";
	
	//Declaration of Instance Variables
	int Jersey_Number=999;
	String CricketName="Unknown";

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		//Object creation
		Cricketer msd=new Cricketer();
		Cricketer.Country_id=91;
		Cricketer.Country_Name="India";
		
		//Initia
		msd.Jersey_Number=07;
		msd.CricketName="Dhoni";
		
		// Accessing the static variable directly
		System.out.println("Cricketer Country ID: "+Country_id);
		System.out.println("Cricketer Country Name: "+Country_Name);
		
		// Accessing the Instance Variable using Object reference variable
		System.out.println("Cricketer Jersey Number"+msd.Jersey_Number);
		System.out.println("Cricketer Name:"+msd.CricketName);
		System.out.println();;
		
		// second Object Created
		Cricketer vk= new Cricketer();
		
		//Initializing the values to instance variables
		vk.Jersey_Number=18;
		vk.CricketName="Virat Kohli";
		System.out.println("Cricketer Country Id: "+Country_id);
		System.out.println("Cricketer Country Name: "+Country_Name);
		
		// Accessing the variable using object
		System.out.println("Cricketer Jersey Number: "+vk.Jersey_Number);
		System.out.println("Cricketer Name:"+vk.CricketName);
		System.out.println();
		
		// Third Object Creation
		Cricketer gill = new Cricketer();
		
		gill.Country_id=999;
		gill.Country_Name="Bharat";
		
		// Initializing the values to instance variables using object reference gill
		gill.Jersey_Number=77;
		gill.CricketName="Shubhman Gill";
		
		// Accessing the static variable directly
		System.out.println("Cricketer Country Id: "+Country_id);
		System.out.println("Cricketer Country Name: "+Country_Name);
		
		// Accessing the instance variable using object
		System.out.println("Cricketer Jersey Number: "+gill.Jersey_Number);
		System.out.println("Cricketer Cricketer Name: "+gill.CricketName);
		System.out.println();
		
		//Object 5 creation
		
		Cricketer hitman=new Cricketer();
		hitman.Jersey_Number=91;
		hitman.CricketName="Rohit Sharma";
		
		//Accessing the static and initial variables.
		
		System.out.println("Cricketer Country Id: "+Country_id);
		System.out.println("Cricketer Country Name: "+Country_Name);
		System.out.println("Cricketer Jersey Number: "+hitman.Jersey_Number);
		System.out.println("Cricketer Name: "+hitman.CricketName);
		System.out.println("Main Method Ended");
	
		
		
	}

}

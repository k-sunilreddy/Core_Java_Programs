package com.languagefundamentals.constructors;

// 1.Create a Java program to calculate a customer’s Mobile Bill using constructor chaining.
// Create multiple constructors and use "this()" to perform constructor chaining.
// The program should calculate:

// - Mobile cost = Price × Quantity
// - Final bill = Mobile cost + Delivery charge

public class MobileBill {
	String mobileModel;
	double price;
	int quantity;
	int deliveryCharge;
	
	//constructor 1
	
	MobileBill()
	{
		this(" ");
	}
	
	// constructor 2
	MobileBill(String mobileModel)
	{
		this(mobileModel, 0.0);
	}
	
	//constructor 3
	MobileBill(String mobileModel,double price)
	{
		this(mobileModel,price,0);
	}
	
	//constructor 4
	MobileBill(String mobileModel, double price, int quantity)
	{
	
		this(mobileModel, price, quantity, 0.0);
	}
	
	//main constructor 
	MobileBill(String mobileModel, double price, int quantity, double deliveryCharge)
	{
		double mobileCost=price * quantity;
		double finalBill= mobileCost + deliveryCharge;
		
		System.out.println("Mobile Model : "+mobileModel);
		System.out.println("Mobile Price : "+price);
		System.out.println("Mobile quantity : "+quantity);
		System.out.println("Mobiel Cost : "+mobileCost);
		System.out.println("Mobile Delivery Charge : "+deliveryCharge);
		System.out.println("************* FINAL PRICE **************");
		System.out.println("Mobile Final Price : "+finalBill);
		System.out.println("****************************************");
		
	}
	
	
	public static void main(String[] args) {
		MobileBill m= new MobileBill();
		
		MobileBill m1=new MobileBill("Iphone",65000.00, 2,250);
		MobileBill m2=new MobileBill("Samsung",98000, 1);
	}

}

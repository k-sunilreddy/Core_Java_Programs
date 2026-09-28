package com.languagefundamentals.constructors;

// no - arg constructor to display customer booking information.
public class Booking_info {
	
	int bookingID;
	String customerName;
	double price;
	
	Booking_info()
	{
		bookingID=100;
		customerName="Unknown";
		price=1200;
		
	}
	void book_info()
	{
		System.out.println("********** Customer Booking Information **************");
		System.out.println(" Booking ID : "+bookingID);
		System.out.println(" Booking Customer Name : "+customerName);
		System.out.println(" Booking Price : "+price);
	}
	
	public static void main(String[] args) {
		Booking_info c1=new Booking_info();
		c1.book_info();
		

	}

}

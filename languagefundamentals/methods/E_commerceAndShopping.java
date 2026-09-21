package com.languagefundamentals.methods;

//Method with Return Type and No Parameters

// Class E-Commerce And Shopping

public class E_commerceAndShopping {
	
	// Declaration product related variables in static
	static int productID;
	static String productName;
	static int quantity;
	
	// Declaring Customer related variable in instance.
	String userName;
	long userPhonenumber;
	String email;
	
	static double payment;
	double discount;
	
	// Instance Method with return type and no parameters
	
	String userInfo()
	{
		System.out.println("\n******************* CUSTOMER INFO *********************");
		return "\n Customer Name:"+userName+"\n Customer Mobile Number:"+userPhonenumber+"\n Email ID:"+email;
		
	}
	
	String productDetails()
	{
		System.out.println("\n****************** Product Details ********************");
		return "\n Product ID:"+productID+"\n Product Name:"+productName+"\n Total Quantity:"+quantity;
		
	} 
	
	String payment()
	{
		System.out.println("\n ****************** Payment Details *******************");
		discount=(discount/100)*100;
		double discount1=(payment*discount)/100;
		double totalpayable=quantity*(payment-discount1);
		return "\n Original Product Price:"+payment+"\n Discount Percentage:"+discount+"\n Your Discount Amount:"+discount1+"\n After discount Total payable:"+totalpayable;
	}
	
	public static void main(String[] args) {
		
		// creating object to class to access instance variable and instance methods data.
		E_commerceAndShopping e=new E_commerceAndShopping();
		productID=1;
		productName="Laptop";
		quantity=3;
		e.userName="Sunil Reddy";
		e.userPhonenumber=733070;
		e.email="koyyasunil1@gmail.com";
		payment=80000;
		e.discount=15;
		
		// calling the instance methods
		System.out.println(e.userInfo());
		System.out.println(e.productDetails());
		System.out.println(e.payment());;
		

	}

}

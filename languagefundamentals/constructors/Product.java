package com.languagefundamentals.constructors;

// create class product with instance variables
public class Product {
	int productId;
	String productName;
	double price;
	int quantity;
	
	// parameterized constructor
	Product(int productId, String productName, double price, int quantity)
	{
		
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
		
	}
	
	// copy constructor --> copying the parameterized constructor with same variables 
	Product(Product product)
	{
		this.productId=product.productId;
		this.productName=product.productName;
		this.price=product.price;
		this.quantity=product.quantity;
	}
	
	
	public static void main(String[] args) 
	{
		//creating the object 1 to product
		Product p1=new Product(001,"Laptop",70000,15);
		System.out.println("\n ********* Product 1 Details ************ \n ");
		p1.display();
		System.out.println("Total Price of Product : "+p1.calculatetotal());
		
		// creating the new object to same product and copying the product data members into new object
		Product p2=new Product(p1);
		// changing the product1 quantity to new product3 quantity
		p2.quantity=20;
		System.out.println("\n ********* Product 2 Details ************ \n ");
		p2.display();
		System.out.println("Total Price of Product : "+p2.calculatetotal());

	}
	
	// showing the product details using display method
	void display()
	{
		System.out.println("Product ID : "+productId);
		System.out.println("Product Name : "+productName);
		System.out.println("Product Price : "+price);
		System.out.println("Quantity Product : "+quantity);
		
	}
	
	//calculating the total price using calculate total method
	double calculatetotal()
	{
		return price * quantity;
	}

}

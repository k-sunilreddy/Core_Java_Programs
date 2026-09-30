package com.languagefundamentals.constructors;

// Display Details using Default Constructor 

public class Book {

	// declaring instance variables to book.
	int bookId;
	String bookName;
	String bookTitle;
	String author;
	double bookPrice;
	
	
	public static void main(String[] args) {
		Book b1=new Book();
		b1.bookId=001;
		b1.bookName="Java";
		b1.bookTitle="Programming";
		b1.author="James Gosling";
		b1.bookPrice=250;
		b1.display(); // calling the method display.
		
		
	}
	
	// display method to display the book details
	void display()
	{
		System.out.println("Book ID : "+bookId);
		System.out.println("Book Name : "+bookName);
		System.out.println("Book Title : "+bookTitle);
		System.out.println("Book Author : "+author);
		System.out.println("Book Price : "+bookPrice);
	}

}

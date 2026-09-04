package com.javaintroduction;

public class ObjectsCount {
	// static variable shares across all instances of this class.
	static int count; 
	// instance initializer block runs automatically when every object is created.
	{
		
		count++; // Count is incremented when the object is created
	}
	
	// display method for total count
	void show()
	{
		System.out.println("Total Objects Created: "+count);
	}
	public static void main(String[] args)
	{
		// Creating Multiple Objects
		ObjectsCount o=new ObjectsCount();
		ObjectsCount o1=new ObjectsCount();
		new ObjectsCount();
		o.show();
	}

}

package com.javaintroduction;

public class NullObject {
	// assigning value to integer a in class level
	int a=1;
	int b;
	void show()
	{
		System.out.println("Object Value:"+a);
	}
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		// creation of object
		NullObject o=new NullObject();
		o.show();
		// making the object null to eligible for GC
		// if object is not becomes null it will not eligible for GC.
		// when we assign a null value to object, the object no longer points to memory address. 
		o=null;
		/*
		 * o.a=2; o.show();
		 */		
		if (o==null)
		{
			System.out.println("Object become Eligible for GC");
		}
		else
		{
			System.out.println("Object is still active with a value:"+o.a);
		}
	}

}

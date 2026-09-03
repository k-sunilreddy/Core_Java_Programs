package com.javaintroduction;
// static block vs instance block
public class Test2 {
	
	static Test2 t1=new Test2();
	
// static block created
	static 
	{
		System.out.println("static block1 called");
	}

// instance block created and called using object
	{
		System.out.println("instance block called");
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		System.out.println("Main Method Ended");
		{
			System.out.println("instance block2 called");
		}

	}

}

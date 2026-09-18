package com.javaintroduction;

//A user has Rs. 100 and wants to buy a pencil which one pencil costs Rs 7. 
//Display how pencil does the user bought and how much balance money is left.
public class TestDemo {
	int total_amount;
	int each_pencil;
	public static void main(String[] args) {
		TestDemo t=new TestDemo();
		t.total_amount=100;
		t.each_pencil=7;
		System.out.println("No of pencils does the user bought:"+t.total_amount/t.each_pencil);
		System.out.println("Remaining Balance with user after bought pencils:"+t.total_amount%t.each_pencil);

	}

}

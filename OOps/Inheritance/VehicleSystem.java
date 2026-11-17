package com.OOps.Inheritance;

class Machine
{
	String name = "Mercedes";
	int speed =50;
	
	void display()
	{
		System.out.println("Vehicle Name :");
		System.out.println("Vehicle Actual Speed :");
	}
}
class Bus extends Machine
{
	int speed = 100;
	
	@Override
	void display()
	{
		System.out.println("Car Speed :"+speed);
	}
}
public class VehicleSystem {

	public static void main(String[] args) {
		
		Machine v=new Bus(); // creating a object to the car using the parent class reference.
		System.out.println("Speed :"+v.speed);
		v.display();
	}

}

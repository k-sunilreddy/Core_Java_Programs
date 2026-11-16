package com.OOps.Inheritance;

class Vehicle
{
	String name;
	int speed;	
	
	void start()
	{
		System.out.println(name + " is ready to start");
	}
	void stop()
	{
		System.out.println(name + " is stopped");
	}
	void display()
	{
		System.out.println("Vehicle name :"+name);
		System.out.println("Vehicle Speed :"+speed);
	}
}
class Car extends Vehicle
{	
	void sunroof()
	{
		System.out.println(name + " is a car contains most popular sunroof");
	}
}
class Bike extends Vehicle
{
	
	void dowheelie()
	{
		System.out.println(name +" is a bike that user performs better dowheelie");
	}
}

class Truck extends Vehicle
{
	
	void loadcargo()
	{
		System.out.println(name + " is a truck that carries load ");
	}
}
public class VehicleManagementSystem 
{
	public static void main(String args[])
	{
		System.out.println("Car Details :");
		Car c=new Car();
		c.name="Benz";
		c.speed=200;
		
		c.display();
		c.start();
		c.sunroof();
		c.stop();
		
		System.out.println("\nBike Details :");
		Bike b=new Bike();
		b.name="Royal Enfield";
		b.speed=180;
		b.display();
		b.start();
		b.dowheelie();
		b.stop();
		
		System.out.println("\nTruck Details :");
		Truck t=new Truck();
		t.name="Bharat Benz";
		t.speed=100;
		t.display();
		t.start();
		t.loadcargo();
		t.stop();
		
	
	}
}
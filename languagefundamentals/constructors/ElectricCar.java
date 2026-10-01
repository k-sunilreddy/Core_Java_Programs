package com.languagefundamentals.constructors;

class Vehicle {

	String type;
	Vehicle(String type)
	{
		this.type=type;
	}
	
}
class Car extends Vehicle
{
	String brand;
	int price;
	
	Car(String type, String brand, int price)	
	{
		super(type);
		this.brand=brand;
		this.price=price;
		
	}
	
}
public class ElectricCar extends Car
{
	int batterycapacity;
	ElectricCar(String type,String brand, int price, int batterycapacity)
	{
		super(type,brand,price);
		this.batterycapacity=batterycapacity;
		
	}
	public static void main(String [] args)
	{
		ElectricCar c1=new ElectricCar ("Electric Car", "TATA", 15000000,2020);
		
		c1.display();
		
	}
	void display()
	{
		System.out.println(" Type : "+type);
		System.out.println(" Brand Name : "+brand);
		System.out.println(" Car Price : "+price);
		System.out.println(" Battery Capacity : "+batterycapacity);
	}
	
	
}


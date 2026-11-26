package com.OOps.Inheritance;

class Device
{
	private String brand;
	private double price;
	
	public void setbrand(String brand)
	{
		this.brand=brand;
	}
	public String getbrand()
	{
		return brand;
	}
	public void setprice(double price)
	{
		this.price=price;
	}
	public double getprice()
	{
		return price;
	}
	
	void displaydetails()
	{
		System.out.println("Brand :"+brand);
		System.out.println("Price :"+price);
	}
	
}

class Laptop extends Device
{
	private String ram;
	private String processor;
	
	public void setram(String ram)
	{
		this.ram=ram;
	}
	
	public String getram()
	{
		return ram;
	}
	
	public void setprocessor(String procesor)
	{
		this.processor=procesor;
	}
	public String getprocessor()
	{
		return processor;
	}
	
	public void RunIDE()
	{
		System.out.println("Laptop is Running the IDE");
	}
	
	public void compilecode()
	{
		System.out.println("Laptop is compiling the code");
	}
	
	@Override
	public void displaydetails()
	{
		super.displaydetails();
		System.out.println("Ram :"+ram);
		System.out.println("Processor :"+processor);
	}
}

class Mobile extends Device
{
	private String camera;
	private int battery;
	
	public void setcamera(String camera)
	{
		this.camera=camera;
	}
	public String getcamera()
	{
		return camera;
	}
	public void setbattery(int battery)
	{
		this.battery=battery;
	}
	public int getbattery()
	{
		return battery;
	}
	
	public void makecall()
	{
		System.out.println(getbrand()+" Mobile is placing a call... ");
	}
	public void takephoto()
	{
		System.out.println("Mobile is take a photo with its "+camera+" camera");
	}
	
	@Override
	void displaydetails() 
	{
		super.displaydetails();
		System.out.println("camera :"+camera);
		System.out.println("battery :"+battery);
	}
}
public class Vcube {

	public static void main(String[] args) {
		Laptop l=new Laptop();
		Mobile m=new Mobile();
		
		l.setbrand("Dell");
		l.setprice(50000);
		l.setram("16GB");
		l.setprocessor("Intel i7");
		
		m.setbrand("Iphone");
		m.setprice(90000);
		m.setbattery(5000);
		m.setcamera("108MP");
		
		System.out.println("---- Class Specific Methods -----");
		l.RunIDE();
		l.compilecode();
		
		System.out.println();
		
		m.takephoto();
		m.makecall();
		
		System.out.println();
		
		System.out.println("----- RUNTIME POLYMORPHISM -----");
		
		Device d1=l;
		System.out.println("Display the laptop details :");
		d1.displaydetails();
		
		System.out.println();
		
		Device d2=m;
		System.out.println("Display the Mobile details :");
		d2.displaydetails();
	}

}

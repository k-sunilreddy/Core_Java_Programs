package com.OOps.Inheritance;

class Animal
{
	String name;
	int age;
	
	void eat()
	{
		System.out.println(name +" is Animal Can Eat");
	}
	
	void sleep()
	{
		System.out.println(name +" is Animal can sleep");
	}
	void display()
	{
		System.out.println("Animal Name :"+name);
		System.out.println("Animal Age :"+age);
		eat();
		sleep();
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog can Bark");
	}
}
class Cat extends Animal
{
	void meow()
	{
		System.out.println("Cat do meow ");
	}
}
class Cow extends Animal
{
	void givemilk() 
	{
		System.out.println("Cow give milk");
	}
}
public class AnimalManagementSystem {

	public static void main(String[] args) {
		
		Dog d=new Dog();
		d.name="German Shepeard";
		d.age=6;
		System.out.println("Dog Details :");
		d.display();
		d.bark();
		
		Cat c=new Cat();
		c.name="Tom";
		c.age=4;
		System.out.println("\nCat Details :");
		c.display();
		c.meow();
		
		Cow c1=new Cow();
		c1.name="Ramu";
		c1.age=9;
		System.out.println("\nCow Details :");
		c1.display();
		c1.givemilk();
		
	}

}

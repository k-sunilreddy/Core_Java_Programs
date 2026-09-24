package com.languagefundamentals.constructors;

//Create a Java class Employee with the following requirements:
/*Create instance variables name, id, and salary.
->Create a parameterized constructor to initialize these variables.

->Use the this keyword to differentiate instance variables from constructor parameters.

->Create an object in the main() method by passing employee details.
Display the employee details.*/

public class Employee1 {
	
	int id;
	String name;
	double salary;
	
	Employee1(int id,String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	
	public static void main(String[] args) {
		Employee1 e1=new Employee1(7496,"Sunil",33000);
		System.out.println("*************** Employee Information ****************");
		
		
		System.out.println("Employee ID: "+e1.id);
		System.out.println("Employee Name :"+e1.name);
		System.out.println("Employee Salary :"+e1.salary);
	}

}

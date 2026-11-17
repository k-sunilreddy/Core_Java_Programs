package com.OOps.Inheritance;

class Employee
{
	int empid;
	String name;
	double empsalary;
	
	void login()
	{
		System.out.println(name +" is an employee can do login");
	}
	void logout()
	{
		System.out.println(name +" is an employee can do logout");
	}
	void display()
	{
		System.out.println("Employee Id :"+empid);
		System.out.println("Employee Name :"+name);
		System.out.println("Employee Salary :"+empsalary);
		login();
		logout();
	}
}

class Manager extends Employee
{
	Manager(int id,String name,double salary)
	{
		super();
		this.empid=id;
		this.name=name;
		this.empsalary=salary;
	}
	void condutingMeeting()
	{
		System.out.println("A Manager can Manages employees and conducting meeting.");
	}
}
class Developer extends Employee
{
	Developer(int empid,String name,double salary)
	{
		super();
		this.empid=empid;
		this.name=name;
		this.empsalary=salary;
	}
	void writecode()
	{
		System.out.println("Developer can write code and do changes in code");
	}
}

class Tester extends Employee
{
	Tester(int id,String name, double salary)
	{
		super();
		this.empid=id;
		this.name=name;
		this.empsalary=salary;
	}
	void tester()
	{
		System.out.println("Tester can Analyzes the developer code");
	}
}
public class EmployeeManagementSystem {

	public static void main(String[] args) {
		
		Manager m=new Manager(9191, "Lakshmi", 50000);
		System.out.println("Manager details");
		m.display();
		m.condutingMeeting();
		
		Developer d=new Developer(1244, "Sunil Reddy", 35000);
		System.out.println("\nDeveloper details");
		d.display();
		d.writecode();
		
		Tester t=new Tester(7496,"Sunil", 30000);
		System.out.println("\nTester details");
		t.display();
		t.tester();
	}

}

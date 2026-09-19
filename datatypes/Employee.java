package com.datatypes;

// create a class Employee with variables empId , empName , empSalary and create three objects and Initialize unique values for each and print details using method.
public class Employee {
	// primitive + instance variables
	int emp_id;
	double salary;
	// Object + instance variable
	String emp_name;
	
	void show()
	{
		System.out.println("Employee Id:"+emp_id);
		System.out.println("Employee Name:"+emp_name);
		System.out.println("Employee Salary:"+salary);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Employee e=new Employee();
		Employee e1=new Employee();
		Employee e2=new Employee();
		e.emp_id=7496;
		e.emp_name="Sunil Reddy";
		e.salary=40000;
		e1.emp_id=1244;
		e1.emp_name="Sai";
		e1.salary=25000;
		e2.emp_id=6300;
		e2.emp_name="Jagadeeswari";
		e2.salary=30000;
		e.show();
		e1.show();
		e2.show();
	}

}

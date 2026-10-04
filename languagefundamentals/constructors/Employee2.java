package com.languagefundamentals.constructors;

/*Employee Java Program  with instance variables of id,name,salary. initialize values using parameterized constructor
and create methods to calculate 10% salary and display the final salary of employee.
*/

public class Employee2 {
	int id;
	String name;
	double salary;
	Employee2(int id,String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	
	double calculatebonus()
	{
		double bonus=salary/10;
		double finalSalary=bonus+salary;
		return finalSalary;
	}
	public static void main(String[] args) {
		Employee2 e1=new Employee2(7496,"Sunil Reddy",35000);
		System.out.println("Employee ID : "+e1.id);
		System.out.println("Employee Name : "+e1.name);
		System.out.println("Employee Salary : "+e1.salary);
		System.out.println("Employee Final Salary with bonus : "+e1.calculatebonus());
		
	}

}

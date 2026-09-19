package com.datatypes;
// creating class to represent employee information using primitive data types.
// display the leaves of employee taken and remaining leaves of employee

public class Employee_info {
	
	// declaration of variable with static, final and primitive data type keywords.
	static final int total_leaves_allowed=30;
	
	// declaration of instance variables with primitive data type.
	int employee_id;
	byte age;
	double salary;
	char grade;
	float experience;
	boolean employee_is_active;
	long phone_number;
	int total_leaves_used;
	int remaining_leaves = total_leaves_allowed;
	
	// declaration of method name decrement of leaves and access the employees details.
	void decrement_of_leaves(int leaves_taken)
	{
		// calculating the remaining leaves available for employee
		remaining_leaves=remaining_leaves-leaves_taken;
		
		// calculating the total leaves used by employee.
		total_leaves_used=total_leaves_allowed - remaining_leaves;
		

		System.out.println("Employee Id:"+employee_id);
		System.out.println("Employee age:"+age);
		System.out.println("Employee Salary:"+salary);
		System.out.println("Employee Grade:"+grade);
		System.out.println("Employee Experience:"+experience);
		System.out.println("Employee is active:"+employee_is_active);
		System.out.println("Total Leaves Allowed:"+total_leaves_allowed);
		System.out.println("Employee_Phone_Number:"+phone_number);

		System.out.println("Total Leaves Used:"+total_leaves_used);
		
		System.out.println("Remaining leaves available:"+remaining_leaves);
		System.out.println("-------------------------------------------");
	}
	
	public static void main(String[] args) {
		
		// Object creation for class employee_info
		Employee_info e=new Employee_info();
		
		// initializing values to instance variables using object reference variable.
		e.employee_id=7496;
		e.age=24;
		e.salary=35000;
		e.grade='A';
		e.experience=3.5F;
		e.employee_is_active=true;
		e.phone_number=7330708938L;
		
		// invoke the method decrement of leaves to display the employee information.
		e.decrement_of_leaves(1);
		e.decrement_of_leaves(5);
		
	}

}

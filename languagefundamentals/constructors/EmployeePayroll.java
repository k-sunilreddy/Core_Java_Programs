package com.languagefundamentals.constructors;

// parameterized constructor to display employee payroll information

public class EmployeePayroll {

	int empId;
	String empName;
	String departmentName;
	String empDesignation;
	int departmentNumber;
	double empSalary;
	
	EmployeePayroll(int empId,String empName,String departmentName, int departmentNumber, double empsalary,String empdesignation)
	{
		this.empId=empId;
		this.empName=empName;
		this.departmentName=departmentName;
		this.departmentNumber=departmentNumber;
		this.empSalary=empsalary;
		this.empDesignation=empdesignation;
	}
	
	
	public static void main(String[] args) {
		EmployeePayroll e=new EmployeePayroll(7496,"Sunil Reddy","IT",12,35000,"Developer");
		EmployeePayroll e1=new EmployeePayroll(1011,"Ravi","IT",12,60000,"Testing");
		EmployeePayroll e2=new EmployeePayroll(1050,"Priya","Medical",3,30000,"Quality Control");
		
		e.display();
		e1.display();
		e2.display();
	}
	
	void display()
	{
		System.out.println("\n*************** EMPLOYEE PAYROLL INFORMATION ****************\n");
		System.out.println("Employee ID : "+empId);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Department Name : "+departmentName);
		System.out.println("Employee Designation : "+empDesignation);
		System.out.println("Employee Department Number : "+departmentNumber);
		System.out.println("Employee Salary : "+empSalary);
		
	}
	

}

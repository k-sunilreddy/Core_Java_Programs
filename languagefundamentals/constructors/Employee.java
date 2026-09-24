package com.languagefundamentals.constructors;

// parameterized constructor
public class Employee {
	
	// static variable declaration
	String companyName ;
	String companyLocation ;
	int noOfEmployees;
	
	// display company info using method
	void company()
	{
		System.out.println("Comapny Name :"+companyName);
		System.out.println("Company Location :"+companyLocation);
		System.out.println("Company No Of Employees :"+noOfEmployees);
	}

	int empId;
	String empName;
	double empSalary;
	long empPhoneNumber;
	String empDept;
	int empDeptno;
	
	// parameterized constructor 
	Employee(int empId,String empName, double empSalary,long empPhoneNumber, String empDept, int empDeptno)
	{
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
		this.empPhoneNumber=empPhoneNumber;
		this.empDeptno=empDeptno;
		this.empDept=empDept;
	}
	
	
	public static void main(String[] args) {
		Employee e=new Employee(7496,"Sunil",78000,7330708938l,"IT",32);
		Employee e1=new Employee(7497,"Jagadeeswari",48000,73307089l,"Medical Coding",22);
		System.out.println(e); // prints the object reference variable address
		
		e.companyName="Capgemini";
		e.companyLocation="Hyd";
		e.noOfEmployees=2500;
		System.out.println("********** Company Information ************");
		e.company();
		
		System.out.println("\n********* Employee Information ***********");
		System.out.println("Emp Id :"+e.empId);
		System.out.println("Emp Name :"+e.empName);
		System.out.println("Emp Salary"+e.empSalary);
		System.out.println();
		System.out.println("Emp PhoneNumber :"+e1.empPhoneNumber);
		System.out.println("Emp Dept Number :"+e1.empDeptno);
		System.out.println("Emp Dept Name :"+e1.empDept);

	}

}

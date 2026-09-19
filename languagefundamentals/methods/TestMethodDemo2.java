package com.languagefundamentals.methods;

// create different method to represent your 10th class BIO details, SCC result and Total of SCC result, Average of SCC result. 
// create method with return type and with parameters.

public class TestMethodDemo2 {
	// declaring static variables to represent and same data to all class level objects.
	static String schoolName="Z.P High School";
	static String location="Kakinada, Andhra Pradesh";
	
	static void getHallticketNumber(int number )
	{
		System.out.println("Hall Ticket Number:"+number);
	}
	
	static void getStudentName(String name)
	{
		System.out.println("Student Name:"+name);
		
	}
	
	static void getStudentmarks(int t, int h, int e, int m, int sc, int so)
	{
		System.out.println("\n********************* Student Subject Marks *******************\n");
		System.out.println("Telugu Subject Marks:"+t);
		System.out.println("Hindi Subject Marks:"+h);
		System.out.println("English Subject Marks:"+e);
		System.out.println("Mathematics Subject Marks:"+m);
		System.out.println("Science Subject Marks:"+sc);
		System.out.println("Social Studies Subject Marks:"+so);
	}
	
	static void getStudent_total_result(int t, int h, int e, int m, int sc, int so)
	{
		double sum=t+h+e+m+sc+so;
		System.out.println("\n******************** Overall Marks of Student ***********************\n");

		System.out.println("Student Total Subject Marks"+sum);
		getStudent_Average_result(sum,6);
	}
	
	static void getStudent_Average_result(double sum, double total_sub)
	{
		double average=sum/total_sub;
		System.out.println("\n******************** Average Marks ********************\n");
		System.out.println("Student Average Marks:"+average);
	}
	
	// the program starts from here
	public static void main(String[] args) {
	
		System.out.println("Main Method Started");
		System.out.println("\n*******************Student 10 Class Details:********************\n");
		
		System.out.println("Student School Name:"+schoolName);
		System.out.println("Student School Location:"+location);
		
		// calling methods to display the results
		getHallticketNumber(1908106035);
		getStudentName("Sunil Reddy");
		getStudentmarks(95,88,93,95,87,91);
		getStudent_total_result(95,88,93,95,87,91);
		// getStudent_Average_result() I am not calling this method because, i was already this method in getStudent_total_result that will give both total result and average result

	}

}

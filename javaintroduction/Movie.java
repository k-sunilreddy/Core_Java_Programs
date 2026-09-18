package com.javaintroduction;

public class Movie {
	
	// Declaration of static variables
	static String Movie_Theatre="InOx";
	static String Location="Hyderabad";
	
	//Declaration of instance variables
	String Movie_Name;
	long Movie_Budget;
	String Movie_ReleaseDate;
	
	//Declaration of show method
	void show()
	{
		System.out.println("Movie Theatre Name: "+Movie_Theatre);
		System.out.println("Movie Theatre Location: "+Location);
		System.out.println("Movie Name: "+Movie_Name);
		System.out.println("Movie Budget: "+Movie_Budget);
		System.out.println("Movie Release Date:"+Movie_ReleaseDate);
		System.out.println();
	}
	public static void main(String[] args) {
		// Object Creation 
		// Object one
		Movie m=new Movie();
		m.Movie_Name="Irumudi";
		m.Movie_Budget=200000000;
		m.Movie_ReleaseDate="21-08-2026";
		
		//Object 2
		Movie m1=new Movie();
		m1.Movie_Name="Toxic";
		m1.Movie_Budget=500000000;
		m1.Movie_ReleaseDate="24-09-2026";
		
		//Object 3
		Movie m2=new Movie();
		m2.Movie_Name="Paradise";
		m2.Movie_Budget=500000000;
		m2.Movie_ReleaseDate="21-09-2026";
		
		// Object 4
		Movie m3 =new Movie();
		m3.Movie_Name="Jailer";
		m3.Movie_Budget=300000000;
		m3.Movie_ReleaseDate="15-10-2026";
		
		//Object 5
		Movie m4=new Movie();
		m4.Movie_Name="SpiderMan 3";
		m4.Movie_Budget=750000000;
		m4.Movie_ReleaseDate="28-07-2026";
		
		m.show();
		m1.show();
		m2.show();
		m3.show();
		m4.show();
	}

}

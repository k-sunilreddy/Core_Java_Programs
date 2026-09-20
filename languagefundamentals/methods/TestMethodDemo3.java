package com.languagefundamentals.methods;

// creating methods with return type and no parameters

public class TestMethodDemo3 {
	
	public static void main(String[] args) {
		System.out.println("Main method Started");
		
		System.out.println("**************** Area Of Shapes *******************");
		System.out.println("\n**************** Area Of Triangle *****************\n");
		
		double AroT=AreaofTriangle();
		System.out.println("Area of Triangle:"+AroT);
		
		System.out.println("\n**************** Area Of Rectangle ****************\n");
		double AroR=AreaofRectangle();
		System.out.println("Area of Rectangle:"+AroR);
		
		System.out.println("\n**************** Area Of Square ********************\n");
		double AroS=AreaOfSquare();
		System.out.println("Area of Square:"+AroS);
		
		System.out.println("\n**************** Area Of Circle ********************\n");
		double AroC=AreaOfCircle();
		System.out.println("Area of Circle:"+AroC);
	}
	// creating different methods of Areas of each Shapes
	// method with return type ,but method with no parameter
	static double AreaofTriangle()
	{
		double base=10;
		System.out.println("Base of Triangle:"+base);
		double height=12;
		System.out.println("Height of Triangle:"+height);
		double ArOfTri=base*height;
		return ArOfTri;
	}
	static double AreaofRectangle()
	{
		double length = 10;
		System.out.println("length of Rectangle:"+length);
		double breadth = 12;
		System.out.println("Breadth of Rectangle:"+breadth);
		double ArOfRec=length * breadth;
		return ArOfRec;
	}
	static double AreaOfSquare()
	{
		int side=10;
		System.out.println("Side of Square:"+side);
		double ArOfSq = side * side;
		return ArOfSq;
	}
	static double AreaOfCircle()
	{
		int r = 10;
		System.out.println("Radius of Circle:"+r);
		double ArOfCir=Math.PI*r*r;
		return ArOfCir;
	}
}

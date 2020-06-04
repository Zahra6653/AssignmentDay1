package com.techment.day7;
import java.lang.Math;
import java.util.Scanner;

public class HeronsFormula {

	public static void main(String[] args) {

		//System.in is a standard input stream.      
		Scanner sc= new Scanner(System.in);

		//Taking input of three sides of triangle from user
		System.out.print("Enter the sides of a triangle:\nSide1: ");
		int side1 = sc.nextInt();
		System.out.print("Side2: ");
		int side2 = sc.nextInt();
		System.out.print("Side3: ");

		//Calculating area using Math.sqrt()
		int side3 = sc.nextInt();
		float s=(side1 + side2 + side3)/2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

		// Displaying the area
		System.out.println("Area of Triangle : " + area);

		sc.close();





	}

}

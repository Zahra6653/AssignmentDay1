package com.techment.day8;

import java.util.Scanner;


/*************
 * Enter 3 sides of a triangle and check and display if a triangle can be formed or not. 
 * The sides of a triangle is constrained by the rule that the sum of any of its two sides
 *  is always bigger than the third side. Using this rule,
 *   we can find whether 3 sides given for a triangle is valid or not 
 * 
 * *********************/


public class TriangleCanBeFormed {

	/***
	 * Method to check whether sum of two sides of triangle
	 *  is  bigger than the third side or not
	 * ****/
	public  boolean checkTriangle(int a , int b , int c)
	{
		if( c < a + b)
			return true;
		else
			return false;
	}


	public static void main(String[] args) {

		//System.in is a standard input stream.      
		Scanner s= new Scanner(System.in);

		TriangleCanBeFormed ob = new TriangleCanBeFormed();

		//Taking the inputs of three sides from the user
		int side1,side2,side3;
		System.out.print("Enter the values of the sides of Triangle \nSide 1 : ");
		side1 = s.nextInt();
		System.out.print("Side 2 : ");
		side2 = s.nextInt();
		System.out.print("Side 3 : ");
		side3 = s.nextInt();

		// Applying check and calling the function checkTriangle
		if( ob.checkTriangle( side1 , side2 , side3 ) || ob.checkTriangle( side2 , side3 , side1 ) ||  ob.checkTriangle( side3 , side1 , side2 ) )
			System.out.println("Triangle can be formed...");
		else
			System.out.println("Triangle cannot be formed..");

		s.close();

	}

}

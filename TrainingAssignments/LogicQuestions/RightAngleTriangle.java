package com.techment.day7;

import java.util.Scanner;

/****
 * Write a program to accept 3 sides of a tringle and 
 * display if the tringle is a right angle tringle or not.
 * **********/

public class RightAngleTriangle {
	
	/***
	 * Method to check whether the triangle is right angled
	 * ****/
	public static boolean checkTriangle(int a , int b , int c)
	{
		if( c*c == a*a + b*b)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		//System.in is a standard input stream.      
		Scanner s= new Scanner(System.in);
		
		//Taking the inputs of three sides from the user
		int side1,side2,side3;
		System.out.print("Enter the values of the sides of Triangle \nSide 1 : ");
		side1 = s.nextInt();
		System.out.print("Side 2 : ");
		side2 = s.nextInt();
		System.out.print("Side 3 : ");
		side3 = s.nextInt();
		
        // Applying check and calling the function
		if( checkTriangle( side1 , side2 , side3 ) || checkTriangle( side2 , side3 , side1 ) ||  checkTriangle( side3 , side1 , side2 ) )
			System.out.println("It is a right angled Triangle...");
		else
			System.out.println("It is not a right angled Triangle..");

		s.close();




	}

}

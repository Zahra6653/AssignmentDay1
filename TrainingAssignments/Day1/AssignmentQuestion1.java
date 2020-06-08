package com.techment.day1;
import java.util.Scanner;

public class AssignmentQuestion1 {

	public static void main(String[] args) {
		
		//Variables to store the first and last digit of the number.
		int firstDigit,secondDigit;
		Scanner input= new Scanner(System.in); //System.in is a standard input stream.
		
		//Accepting two digit number as input
		System.out.print("Enter a two digit number - ");
		int number = input.nextInt();
		
        //Checking if the number is  of 2 digit or not
		if( number >= 10 && number >= 99 ) 
		{
			 firstDigit = number / 10;
		     secondDigit = number % 10;
		     int sum = firstDigit + secondDigit ;
		     System.out.println("The exit door number of the glasshouse is " + sum);
		        
		}
		else 
		{
			System.out.println("Not a 2 digit Number.");
		}
       
	}

}

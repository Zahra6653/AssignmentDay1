package com.techment.day1;
import java.util.Scanner;

public class AssignmentQuestion2 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in); //System.in is a standard input stream.
		
		// Accepting the day value as input...
		System.out.print("Enter the day - ");
		int dayValue= input.nextInt();
		
		//Checking the day value between 1 and 31
		if(dayValue < 1 || dayValue > 31) 
		{
			System.out.print(" Invalid Input ");
		}
		
		//Displaying appropriate message as output based on the value of day  .
        else 
        {
			if((dayValue % 2) == 0) 
			{
				System.out.println(" Cars with Even registration numbers are permitted today ");
				
			}
			else 
			{
				System.out.println(" Cars with Odd registration numbers are permitted today ");
			}
		}
	}
}

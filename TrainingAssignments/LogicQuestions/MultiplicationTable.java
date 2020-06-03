package com.techment.day7;

import java.util.Scanner;

/****
 * Write a program to accept a number from the user and display the multiplication table for that number
 * ****/
public class MultiplicationTable {

	public static void main(String[] args) {

		//System.in is a standard input stream.      
		Scanner s= new Scanner(System.in);

		//Taking input from the user for the number of table he wants to be printed
		System.out.print("Enter a number whose Table you want to have printed : ");
		int number = s.nextInt();

		//Printing the table using for loop
		System.out.println("Table of " + number + " : ");
		for(int i=1 ; i<=10 ; i++)
		{
			System.out.println(number + " x " + i + " = " + (number*i));
		}

		s.close();
	}

}

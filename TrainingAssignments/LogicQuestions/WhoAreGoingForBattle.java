package com.techment.day9;

import java.util.Scanner;

public class WhoAreGoingForBattle {

	public static void main(String[] args) {
		
		
		//System.in is a standard input stream.      
		Scanner s= new Scanner(System.in);

		
		//Taking input of first and last number from user
		System.out.print("Enter first Number : ");
		int first_number = s.nextInt();
		System.out.print("Enter last Number : ");
		int last_number = s.nextInt();
		
		//Printing numbers from first to last number
		for(int i = first_number ; i<=last_number ; i++) 
		{
			System.out.println(i);
		}


		s.close();

	}

}

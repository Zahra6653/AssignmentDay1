package com.techment.day6;

import java.util.Scanner;

public class Pattern34 {


	/******
	 * Write a program to accept a number from user and  create the following pattern

           7654321
           765432
           76543
           7654
           765
           76 
           7 ******/
	public static void main(String[] args) {


		//System.in is a standard input stream.      
		Scanner s= new Scanner(System.in);

		System.out.print(" Enter a number to make the pattern : ");
		int number = s.nextInt();

		for(int i=1 ; i<=number ; i++)
		{
			for(int j=number ; j>=i ; j--)
				System.out.print(j);
			System.out.println();
		}

		s.close();

	}

}

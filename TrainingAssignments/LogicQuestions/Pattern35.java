package com.techment.day6;

import java.util.Scanner;

/*****
 * Write a program to accept a number from user and  create the following pattern
 * 1
 * 12
 * 123
 * 12
 * 1
 * ********/

public class Pattern35 {

	public static void main(String[] args) {

		//System.in is a standard input stream.      
		Scanner s= new Scanner(System.in);

		System.out.print(" Enter a number to make the pattern : ");
		int number = s.nextInt();

		for(int i=1 ; i<=(2*number)-1 ; i++)
		{
			if(i<=number) 
			{
				for(int j=1 ; j<=i ; j++) 
					System.out.print(j);

			}
			else
			{
				for(int j=1 ; j<=(2*number)-i ; j++) 
					System.out.print(j);

			}
			System.out.println();
		}

		s.close();


	}

}

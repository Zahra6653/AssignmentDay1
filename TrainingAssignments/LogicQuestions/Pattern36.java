package com.techment.day7;

import java.util.Scanner;

public class Pattern36 {


	/**
	 * Write a program to accept a number from user and  create the following pattern
	 * 
	 * 1234554321
	 * 12344321
	 * 123321
	 * 1221
	 * 11
	 * *****/
	public static void main(String[] args) {

		//System.in is a standard input stream.      
		Scanner s= new Scanner(System.in);

		System.out.print("Enter a number to make the pattern : ");
		int number = s.nextInt();

		for(int i=number ; i>=1 ; i--)
		{
			int c=i;
			for(int j=1 ; j<=2*i ; j++)
			{
				
				if(j<=i)
					System.out.print(j);
				else
				{
					System.out.print(c);
					c--;
				}
			}

			System.out.println();
		}

		s.close();



	}

}

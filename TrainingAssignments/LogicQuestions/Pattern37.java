package com.techment.day7;

import java.util.Scanner;

public class Pattern37 {
	/**
	 * Write a program to accept a number from user and  create the following pattern
	 *   1
	 *  212
	 * 32123
	 *  212
	 *   1
	 * **/

	public static void main(String[] args) { 


		//System.in is a standard input stream.      
		Scanner s= new Scanner(System.in);

		//Taking input from the user
		System.out.print(" Enter a number to make the pattern : ");
		int number = s.nextInt();
		int c;

		for(int i=1 ; i<=(2*number)-1 ; i++)
		{

			if(i<=number)
			{
				int d=1;

				//Loop for printing space
				for(int j=1;j<=number-i;j++)
				{
					System.out.print(" ");
				} 
				// loop for printing numbers
				d=i;
				for(int k = 1 ; k <= (i*2)-1 ; k++)
				{
					if(k<i) 
					{
						System.out.print(d);

						d--;
					}
					else if(k==i) 
					{
						System.out.print(d);
					}
					else 
					{
						d++;
						System.out.print(d);
					}				
				}
			}
			else {
				//Loop for printing space
				for(int j=1;j<=i-number;j++)
				{
					System.out.print(" ");
				} 
				// loop for printing numbers
				c=(4*number)-(2*i)-1;
				int d=(c/2) + 1;
				for(int k = c; k >= 1 ; k--)
				{

					if(k> ((c/2)+1))
					{
						System.out.print(d);
						d--;
					}
					else if(k==(c/2)+1)
					{
						System.out.print(d);
					}
					else 
					{
						d++;
						System.out.print(d);
					}
				}

			}
			System.out.println();
		}


		s.close();
	}

}

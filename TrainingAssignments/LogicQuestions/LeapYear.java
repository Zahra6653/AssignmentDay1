package com.techment.day9;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year;
		boolean is_leap_year = false;

		//System.in is a standard input stream.      
		Scanner s= new Scanner(System.in);

		System.out.print("Enter the year you want to check is leap year or not : ");
		year = s.nextInt();
		if(year % 4 == 0)
		{
			if( year % 100 == 0)
			{
				// year is divisible by 400, hence the year is a leap year
				if ( year % 400 == 0)
					is_leap_year = true;
				else
					is_leap_year = false;
			}
			else
				is_leap_year = true;
		}
		else
			is_leap_year = false;

		if(is_leap_year)
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year.");

		s.close();
	}

}

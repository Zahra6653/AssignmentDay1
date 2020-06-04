package com.techment.day6;

import java.util.Scanner;

public class AccountLocked {

	public static void main(String[] args) {

		//System.in is a standard input stream.      
		Scanner s= new Scanner(System.in);

		//Variables to store pin, attempts , correct pin
		int attempt=0,pin=0;
		int correct_pin=12345;

		//Checking for if user has entered correct pin or not
		while(attempt<3) 
		{
			attempt++;
			System.out.println("Enter Your PIN : ");
			pin = s.nextInt();
			if((attempt < 2) && (pin != correct_pin)) 
				System.out.println("Incorrect PIN..... TRY AGAIN");
			else if(pin == correct_pin)
			{
				System.out.println("PIN ACCEPTED...");
				break;
			}

		}
		if((attempt==3) && (pin!=correct_pin))
			System.out.println("You have run out of tries..... \nACCOUNT LOCKED");

		s.close();

	}

}

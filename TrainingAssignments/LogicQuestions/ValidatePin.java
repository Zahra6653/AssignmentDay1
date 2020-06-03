package com.techment.day7;

import java.util.Scanner;

public class ValidatePin {

	/****
	 * Use a loop to continuously check for the PIN number and keep 
	 * repeatedly ask the customer to enter PIN 
	 * until he enters the correct PIN.
	 * ******/

	public static void main(String[] args) {

		//System.in is a standard input stream.      
		Scanner s= new Scanner(System.in);

		int pin=0;
		int correct_pin=12345;
		while(true) {
			System.out.println("Enter Your PIN : ");
			pin = s.nextInt();
			if(pin != correct_pin) 
				System.out.println("Incorrect PIN..... TRY AGAIN");
			else
				break;
				
		}
		System.out.println("PIN ACCEPTED...");
		s.close();
	}
	

}

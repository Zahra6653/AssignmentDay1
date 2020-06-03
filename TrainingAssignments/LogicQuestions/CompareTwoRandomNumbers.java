package com.techment.day7;
import java.util.*;

/*****
 * Use Random class of Util Package to generate random numbers.
                  Use the nextInt() method of Random class 


 * ****/


public class CompareTwoRandomNumbers {

	public static void main(String[] args) {
		
		
		//Creating object of Random class
		Random ob = new Random();
		int upperbound = 100;
		
		//Initialising the numbers with random integer between 0-99
        int number1 = ob.nextInt(upperbound);
		int number2 = ob.nextInt(upperbound);
		
		System.out.println("Random number1 : " + number1 + "\nRansom Number2 : " + number2 );
		
		
		//Comparing the Random Numbers
		if( number1 == number2 )
		{
			System.out.println("Both random numbers are equal....");
		}
		else
			System.out.println("Random numbers are different.....");
		


	}

}

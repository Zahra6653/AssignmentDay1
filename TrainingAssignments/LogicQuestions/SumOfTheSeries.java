package com.techment.day7;

import java.util.Scanner;

public class SumOfTheSeries {
	
	//Methoud to find Factorial of number
	public static double fact(int number) {
		if(number == 0)
			return 1;
		else
			return number*fact(number-1);

	}

	public static void main(String[] args) {

		//System.in is a standard input stream.      
		Scanner s= new Scanner(System.in);
		
		//Taking input for knowing the number of terms he wants 
		System.out.print("Enter number of terms in series : ");
		int noOfTerms = s.nextInt();
		double result=0;

		//finding the sum of series using fact() function
		for(int i=1; i<=noOfTerms ; i++) {
			result += i/fact(i);	
		}
          
		System.out.println("The sum of series is : " + result);



		s.close();


	}

}

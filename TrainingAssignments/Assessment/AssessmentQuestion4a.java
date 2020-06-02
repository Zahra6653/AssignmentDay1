package com.techment.assessment1;

import java.util.Scanner;

public class AssessmentQuestion4a {
	/****
	 * Array Program to result odd sum and even sum
	 * ***/

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in); //System.in is a standard input stream.
		
		//Variable to store the size of the array
		int size;
		System.out.print("Enter the number of elemnts in the array : ");
		size = s.nextInt();
		
		//Declaring variables to store sum of even and odd values
		int even_sum=0 , odd_sum=0;
		
		//Taking elements of array as user input
		int arr[] = new int [size];
		System.out.println("Enter the value of : ");
		for(int i=0 ; i < size ; i++)
		{
			System.out.print("Element " + (i+1) + " : " );
			arr[i] = s.nextInt();
			if((arr[i] % 2) == 0)
				even_sum += arr[i];
			else
				odd_sum += arr[i];
		}
		
		//Displaying the output...
		System.out.println("The sum of even values is : "+ even_sum);
		System.out.println("The sum of odd values is : "+ odd_sum);
		
		s.close();

	}

}

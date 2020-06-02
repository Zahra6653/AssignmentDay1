package com.techment.assessment1;

import java.util.Scanner;

public class AssessmentQuestion4b {

	/***
	 * pair of sum in a given array
	 * ***/

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in); //System.in is a standard input stream.

		//Variable to store the size of the array
		int size;
		System.out.print("Enter the number of elemnts in the array : ");
		size = s.nextInt();

		//Taking elements of array as user input
		int arr[] = new int [size];
		System.out.println("Enter the value of : ");
		for(int i=0 ; i < size ; i++)
		{
			System.out.print("Element " + (i+1) + " : " );
			arr[i] = s.nextInt();	
		}

		//Taking input of a number for which pair is to be founded
		System.out.print("Enter a number : ");
		int num = s.nextInt();

		//Checking for pairs having sum equals value of number
		System.out.println("Pairs of the elements whose sum is: "+num);
		for(int i=0; i<size ; i++)
		{
			for (int j=i; j<size; j++)
			{
				if((arr[i]+arr[j])== num && i!=j)
				{
					System.out.println("( " + arr[i] + " , " + arr[j] + " )");
				}
			}
		}
		
		s.close();

	}


}



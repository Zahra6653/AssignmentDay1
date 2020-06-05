package com.techment.day7;

import java.util.Scanner;

public class MirrorMatrix {
	
	/***
	 *  Create two dimensional array to store the values of n*n matrix 
	 *  and using nested for loop and using nested for loop
	 *   find out the mirror image of the matrix
	 * *****/

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in); //System.in is a standard input stream.

		//Taking rows and columns of both the matrices from user
		int row,column;
		System.out.print("Enter number of rows and columns in first matrix \nRow : ");
		row = s.nextInt();
		System.out.print("Column : ");
		column = s.nextInt();



		//Declaring matrices to store user values
		int matrix[][]=new int[row][column];
		
		
		//Taking user input for Matrix 
		System.out.println("Enter the elements of matrix :");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++) 
			{
				matrix[i][j]=s.nextInt();

			}

		}

		System.out.println("The elements you entered are as follows :");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++) 
			{
				System.out.print(matrix[i][j] + " ");

			}
			System.out.println();

		}
		
		System.out.println("The mirror image of matrix is :");
		for(int i=0;i<column;i++)
		{
			for(int j=row-1;j>=0;j--) 
			{
				System.out.print(matrix[i][j] + " ");

			}
			System.out.println();

		}

        s.close();

	}

}

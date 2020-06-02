package com.techment.assessment1;

import java.util.Scanner;

public class AssessmentQuestion3 {

	public static void main(String[] args) {


		Scanner s= new Scanner(System.in); //System.in is a standard input stream.

		//Taking rows and columns of both the matrices from user
		int r1,r2,c1,c2;
		System.out.print("Enter number of rows and columns in first matrix \nRow : ");
		r1 = s.nextInt();
		System.out.print("Column : ");
		c1 = s.nextInt();


		System.out.print("Enter number of rows and columns in Second matrix \nRow : ");
		r2 = s.nextInt();
		System.out.print("Column : ");
		c2 = s.nextInt();

		//Declaring matrices to store user values
		int matrix1[][]=new int[r1][c1];
		int matrix2[][]=new int[r2][c2];
		int sum_matrix[][]=new int [r1][c1];
		
        //Checking if both the matrices can be added or not
		if((r1 == r2)  && (c1 == c2))
		{


			//Taking user input for Matrix 1
			System.out.println("Enter the elements of matrix1 :");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++) 
				{
					matrix1[i][j]=s.nextInt();

				}

			}

			//Taking user input for Matrix 2
			System.out.println("Enter the elements of matrix2 : ");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					matrix2[i][j]=s.nextInt();

				}

			}

			//Displaying the result matrix
			System.out.println("After adding the resultant matrix is : ");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++) 
				{
					sum_matrix[i][j] = matrix1[i][j] + matrix2[i][j] ;

					System.out.print(sum_matrix[i][j]+ "  ");
				}
				System.out.println("");
			}
		}
		else
			System.out.println("The matrices cannot be added....");
		
		s.close();	  		
	}


}

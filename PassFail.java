package com.techment.day1;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
	
		Scanner input= new Scanner(System.in); //System.in is a standard input stream.
		
		
		System.out.print("Enter the number of subjects : ");
		int n = input.nextInt();
		
		//Taking marks of each n subjects as input
		int marks[]=new int[n];
		for(int i=0;i<n;i++)
		{		  
		  System.out.print("Enter marks of subject "+(i+1)+" : ");
		  marks[i]= input.nextInt(); 
		}
		
		
		int totalMarks=0, min=marks[0], max=marks[0];
		
		for(int i=0;i<n;i++) {
			totalMarks = totalMarks + marks[i];
			if(min>marks[i])
				min=marks[i];
			if(max < marks[i])
				max=marks[i];
		}
		System.out.println("Total marks : "+ totalMarks);
		System.out.println("Minimum marks : "+ min);
		System.out.println("Maximum marks : " + max);
		
		
		int pass[]=new int[n];
		int fail[]=new int[n];
		int j=0,k=0;
		for(int i=0;i<n;i++) 
		{
			if(marks[i]>=50) 
			{
				pass[j]=marks[i];
				j++;
				System.out.println("Result of Subject " +(i+1) + " : pass");
			}
			else 
			{
				fail[k]=marks[i];
				k++;
				System.out.println("Result of Subject " +(i+1) + " : fail");
			}
		}
		System.out.println("Number of subjects passed : " + j);
		System.out.println("Number of subjects failed : " + k);
		
	}

}

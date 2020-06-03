package com.techment.day6;

import java.util.Scanner;

public class SuperMarketTotalStock {

	public static void main(String[] args) {

		//System.in is a standard input stream.      
		Scanner s= new Scanner(System.in);

		System.out.print("Enter the number of products present in your Super Market : ");
		int items = s.nextInt();

		int product_quantity[] = new int [items];
		int sum=0;

        //Taking input from the user about the product quantity
		System.out.println("Enter the Product Quantities for ");
		for(int i=0 ; i<items ; i++)
		{
			System.out.print("Product " + (i+1) + " : ");
			product_quantity[i] = s.nextInt();
			sum+=product_quantity[i];
		}
		
		System.out.println("The total of product in Super Market is : " + sum);


		s.close();

	}

}

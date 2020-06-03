package com.techment.day6;

import java.util.*;

public class SuperMarketStockChallenge {

	public static void main(String[] args) {


		//System.in is a standard input stream.      
		Scanner s= new Scanner(System.in);

		System.out.print("Enter the number of products present in your Super Market : ");
		int items = s.nextInt();

		int product_quantity[] = new int [items];
		int max= 0, c=0;


		System.out.println("Enter the Product Quantities for ");
		for(int i=0 ; i<items ; i++)
		{
			System.out.print("Product " + (i+1) + " : ");
			product_quantity[i] = s.nextInt();
			if(max < product_quantity[i])
			{
				max = product_quantity[i];
				c = i+1;
			}




		}
		System.out.println("The maximum Quantity is of product " + c + " :" + max);
		s.close();

	}

}

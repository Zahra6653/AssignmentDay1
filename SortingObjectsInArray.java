package com.techment.day9;

import java.util.Scanner;

/********
 * 
 * Create a list of Product Objects with id,name and price as attributes  and store the objects into an array . 
 * Display the products in ascending order of their names.
 *
 ***************/
class Product
{
	private int p_id;
	float price;
	private String name;
	Product(int id , String name , float price)
	{
		this.p_id=id;
		this.name = name;
		this.price = price;

	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return p_id;
	}
	public float getPrice()
	{
		return price;
	}

}

public class SortingObjectsInArray {


	public static void main(String[] args) {

		//System.in is a standard input stream.      
		Scanner s= new Scanner(System.in);
		Product ob[] = new Product[5];
		int pid;
		float price;
		String temp,name;

		
		//Taking input of the id ,name and price of product
		for(int i=0 ; i<5 ; i++) 
		{
			System.out.print("Enter the id of Product " + (i+1) + " : " );
			pid = s.nextInt();
			System.out.print("Enter the name of Product " + (i+1) + " : " );
			name = s.next();
			System.out.print("Enter the Price of Product " + (i+1) + " : " );
			price = s.nextFloat();
			ob[i]=new  Product(pid , name , price);
		}
		
		//Sorting names list alphabetically
		for (int i=0 ; i<5 ; i++) 
		{
			for (int j=i+1 ; j<5 ; j++) 
			{
				if (ob[i].getName().compareTo(ob[j].getName())>0) 
				{
					temp = ob[i].getName();
					ob[i].setName(ob[j].getName());
					ob[j].setName(temp);
				}
			}
		}

		
		//Displaying result
		System.out.println("\n\nOutput : \n");
		for(int i=0 ; i<5 ; i++)
		{
			System.out.println( ob[i].getId() + " " + ob[i].getName() + " " + ob[i].getPrice());
		}


		s.close();
	}

}

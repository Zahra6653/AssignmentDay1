package com.techment.day1;
import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in); //System.in is a standard input stream.
		System.out.print("Enter a  number - ");
		int number = input.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(number + " * " + i +" = " + (number*i));
			
		}
		
	}

}

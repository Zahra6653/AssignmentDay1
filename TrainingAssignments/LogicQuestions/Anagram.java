package com.techment.day8;
import java.lang.String;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	/******
	 * Check whether String is Anagram or not
	 * *************/
	public static void main(String[] args) {


		//System.in is a standard input stream.      
		Scanner s= new Scanner(System.in);


		//Taking Strings input from user
		System.out.print("Enter the First String : ");
		String s1 =s.next();
		System.out.print("Enter the Second String : ");
		String s2 = s.next();

		//Converting the string to lower case and then converting it to char array and storing in variables
		char[] str1 =(s1.toLowerCase()).toCharArray();
		char[] str2 =(s2.toLowerCase()).toCharArray();

		//Sorting both the strings using Arrays.sort method
		Arrays.sort(str1);
		Arrays.sort(str2);

		//Checking if both the sorted Strings are equal using Arrays.equal method 
		boolean result = Arrays.equals(str1, str2);

		//Printing the result on the basis of the output of Arrays.equal method
		if(result==true)
			System.out.println("Both strings are Anagram...");
		else
			System.out.println("Strings are not Anagram....");


		s.close();


	}

}

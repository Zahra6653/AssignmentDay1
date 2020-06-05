package com.techment.day9;
import java.lang.Math;
import java.util.Scanner;

/******
 * Accept the Binary number into an integer variable. Using num%10 extract the digits from right to left .
 * Use a while loop for the same. Find the power of each digit using Math. Pow() and
 * find the sum of the powers which results in the decimal equivalent.
 * ********/

public class ConvertBinaryToDecimal {

	public static void main(String[] args) {

		//System.in is a standard input stream.      
		Scanner s= new Scanner(System.in);


		//Taking users input of binary number
		System.out.print("Enter binary number : ");
		long binary_number = s.nextLong();

		//Converting it to decimal using Math.pow() function
		int temp,sum=0,count=0;
		while(binary_number>0) {
			temp=(int)(long) binary_number%10;

			sum+= (temp * Math.pow(2, count));
			count++;
			binary_number /=10;
		}
		
		//Printing the output
		System.out.println("The converted Decimal number is : " + sum);

		s.close();

	}

}

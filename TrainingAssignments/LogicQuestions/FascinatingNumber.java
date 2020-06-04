package com.techment.day8;
import java.util.Arrays;
import java.util.Scanner;

/*****
 * Fascinating numbers are 3 digit numbers with a unique property.
 * When a 3 digit number is concatenated with the number multiplied by 2 and the number multiplied by 3, 
 * sometimes we get a number which contains all the digits from 1 to 9 exactly once.
 * There could be any number of zeros, but they are ignored. 
 * Such a 3 digit number is known as a fascinating number. 
 * 
 * ************/



public class FascinatingNumber {

	public static void main(String[] args) {

		//System.in is a standard input stream.      
		Scanner s= new Scanner(System.in);
		//For appending numbers into a number
		StringBuilder temp = new StringBuilder();

		
		int n, flag=0;
		//Array to store frequency of each element
		int frequency[] = new int[10];
		//Initialising all array elements with a 0 value
		Arrays.fill(frequency, 0);
		//Taking input from the user
		System.out.print("Enter a three digit Number : ");
		int number = s.nextInt();
		temp.append(number);
		temp.append(2*number);
		temp.append(3*number);
		
		long Fascinating_Number = Integer.parseInt(temp.toString());

        System.out.println(Fascinating_Number);
        
        //Checking if a number is fascinating number or not
		while(Fascinating_Number>0)
		{
			n = (int)(long) Fascinating_Number % 10;
			
			for(int i=1; ;i++) {
				frequency[n]++;
				break;
			}
			Fascinating_Number/=10;

		}
		for(int i=1;i<=9;i++) {
			if(frequency[i]==1)
				continue;
			else {
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("It is a Fascinating number");
		else
			System.out.println("It is not a Fascinating number");
		s.close();

	}

}

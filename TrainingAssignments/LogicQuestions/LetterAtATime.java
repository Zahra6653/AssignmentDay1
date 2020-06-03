package com.techment.day7;

import java.util.Scanner;

/*******
 * Write a program to accept a message from the user and display the following data.
 * How many characters is the whole message consists of ?
 * Which is the first and last character and the position of the same
 * Print all the characters in the message one at a time.
 * How many times is the letter ‘a’ present in the message?

 **********/

public class LetterAtATime {

	public static void main(String[] args) {

		//System.in is a standard input stream.      
		Scanner s= new Scanner(System.in);
        
		
		//Taking message from the user as input
		int count_of_a = 0;
		String message;
		System.out.print("Enter a message : ");
		message = s.nextLine();
		int message_length = message.length();
		
		//Using string functions
		System.out.println("Your message is of " + message_length + " characters long");
		System.out.println("The first character is at position 0 and is " + message.charAt(0));
		System.out.println("The last character is at position " + (message.length()-1) + " and is " + message.charAt(message_length-1));
        System.out.println("Here are all characters in the message one at a time : ");
        for(int i=0 ; i<message_length ; i++)
        {	
        	System.out.println(i + " : " +  message.charAt(i));
        	if(message.charAt(i)=='a')
        		count_of_a++;
        
        }
        System.out.println(count_of_a + " times letter 'a' id present in the message...");
        
        s.close();
	}

}

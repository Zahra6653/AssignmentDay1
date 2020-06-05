package com.techment.day7;


import java.lang.String;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SortWordsOfArray {

	/*******
	 * Rohan wants to break a sentence into words and then sort the words in ascending order.
	 * Find a solution to his problem by writing a java program which inputs 
	 * a sentence and outputs the words in ascending order.


	 * *************/

	public static void main(String[] args) throws IOException{

		//System.in is a standard input stream.      
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		// Taking input from the user
		System.out.println("Enter a sentence : ");
		String sentence = br.readLine();

		// Splitting each word
		String[] arrOfWords = sentence.split(" ");
		Arrays.sort(arrOfWords);
		for(int i=0; i<arrOfWords.length;i++) {

			System.out.println(arrOfWords[i]);
		}


	}

}

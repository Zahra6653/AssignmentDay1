package com.techment.day7;

import java.util.Scanner;
import java.util.Stack;

public class StackImplementation {
	/*******
	 * Create a stack with push and pop methods , 
	 * The elements should be stored in an array with a fixed maximum stack size of 5 elements.
	 *  Push 5 elements and pop all the elements . Should  allow pop only from top.
	 ******/

	public static void main(String[] args) {


		//System.in is a standard input stream.      
		Scanner s= new Scanner(System.in);

		//Declaring stack object
		Stack <Integer> Elements = new Stack <Integer>();
		int arr[] = new int[5];
		
		//Taking elements from user to be pushed in stack
		System.out.println("Enter five elements : ");
		for( int i=0;i<5;i++){
			arr[i]=s.nextInt();
			Elements.push(arr[i]);
		}
		System.out.println("Elemets pushed into stack are \n " + Elements);
		
		//Popping the emplents from stack 
		System.out.println("Elements popped from stsck : ");
		for( int i=0;i<5;i++){
			System.out.println("Item popped is : " + Elements.pop());
		}
		s.close();
	}



	
}



package com.techment.day7;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {


		//System.in is a standard input stream.      
		Scanner s= new Scanner(System.in);
		System.out.print("Enter your weight in kgs : ");
		float weight = s.nextFloat();
		System.out.print("Enter your Height in cms : ");
		float height = s.nextFloat();
		float Height = height / 100;
		float BMI = weight /(Height * Height);
		if(BMI < 18.5) 		
			System.out.println("You are Underweight......");
		else if(BMI >= 18.5 && BMI < 25)
			System.out.println("Your BMI is Normal......");
		else if(BMI >= 25 && BMI < 30)
			System.out.println("You are Overweight......");
		else
			System.out.println("You are Obese.....");


		s.close();


	}

}

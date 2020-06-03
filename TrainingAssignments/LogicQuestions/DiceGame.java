package com.techment.day7;
import java.util.Random;
/**
 * Use Random class of Util Package to generate random numbers.
                  check if both the random numbers are even or  not
                   Add the numbers if both are even or else subtract the values.


 *******/

public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		int upperbound=6;
		int dice1 = rand.nextInt(upperbound);
		int dice2 = rand.nextInt(upperbound);
		int difference;
		dice1 += 1;
		dice2 += 1;
		System.out.println("Roll Dice : \nNumber is : " + dice1 + "\nRoll Dice again : \nNumber is : " + dice2 );
		
		if( (dice1 % 2) == 0 && (dice2 % 2) == 0)		
			System.out.println("Points : " + (dice1 + dice2 ));
		
		else 
		{
			if(dice1>dice2)
				difference = dice1 - dice2;
			else
				difference = dice2 - dice1;
			System.out.println("Points : "+ difference);
		}
		

	}

}

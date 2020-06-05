package com.techment.day6;

import java.util.*;

public class SortingCommandLineArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array list to store the names 
		ArrayList <String> name_of_player = new ArrayList <String>();


		//Taking first arguments as number of players
		System.out.println("Total the numbers of players are " + args[0]);
		
		// sorting the list using Collections.sort()
		System.out.println("Sorted list of their names are as follows :");
		for(int j=1 ; j < args.length ; j++) {
			name_of_player.add(args[j]);
			Collections.sort(name_of_player);
		}

		//Displaying the sorted list
		System.out.println(name_of_player);

	}
}

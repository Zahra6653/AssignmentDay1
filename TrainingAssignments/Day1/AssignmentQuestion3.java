/**
 * 
 */
package com.techment.day1;
import java.util.Scanner;

public class Assignment {

	
	public static void main(String[] args) {
		
		
		Scanner input= new Scanner(System.in); //System.in is a standard input stream.
		
		//Weight of first horse
		System.out.print("Enter the weight of fisrt horse - ");
		int wgtHorse1= input.nextInt();
		
		//Weight of Second horse
		System.out.print("Enter the weight of Second horse - ");
		int wgtHorse2= input.nextInt();
		
		//Weight of Third horse
		System.out.print("Enter the weight of Third horse - ");
		int wgtHorse3= input.nextInt();
		
		if( wgtHorse1 == wgtHorse2 || wgtHorse1 == wgtHorse3 || wgtHorse2 == wgtHorse3)
        {
        	 System.out.println("Entered weights are not distinct values.");

        }
		
		else 
		{
			//Comparison of weights
	        if(wgtHorse1 > wgtHorse2 && wgtHorse1 > wgtHorse3)

	        {
	        	System.out.println("The First Horse has maximum Weight.");          
	        
	        }

	        else if(wgtHorse2 > wgtHorse3)

	        {
	        	        	
	        	System.out.println("The Second Horse has maximum Weight.");
	        	           
	        }
	        else
	        {
	            System.out.println("The Third Horse has maximum Weight.");
	        }
			
		}
		

	}

}

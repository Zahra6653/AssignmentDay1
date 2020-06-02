package com.techment.assessment1;

public class AssessmentQuestion1 {

	/***
	 *  find the value of b
	 *  int a=7
	 *     i)int b=a++ - ++a - a++ + ++a -a--
	 *    ii)int b=--a + a-- + ++a + a-- -++a 
	 * ******/

	public static void main(String[] args) {

		int a=7;

	    int b=a++ - ++a - a++ + ++a -a--;
		System.out.println("The value of b for : \nb=a++ - ++a - a++ + ++a -a--  : " + b);
        a=7;
		int b1= --a + a-- + ++a + a-- - ++a ;
		System.out.println("The value of b for : \nb=--a + a-- + ++a + a-- -++a  : " + b1);


	}

}

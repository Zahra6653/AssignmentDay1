package com.techment.day7;
import java.util.*;


/****
 * 
 * Creating class to store the question and each of the four options and the correct answer..**
 * 
 * ****/

class Question{
	private String question,option1,option2,option3,option4;
	private char correct_answer;
	Question(String question, String option1 , String option2 , String option3 , String option4 , char correct_answer)
	{
		this.question = question ;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.correct_answer = correct_answer;

	}
	public int question() {
		System.out.println(question);
		System.out.println("a. " + option1);
		System.out.println("b. " + option2);
		System.out.println("c. " + option3);
		System.out.println("d. " + option4);
		return 0;
	} 
	public String checkAnswer(char answer) {
		if(answer == correct_answer)
			return "You entered correct answer";
		else 
			return "You entered Wrong answer";
	}
}

public class QuizGame {
	public static void main(String []args) {

		//System.in is a standard input stream.      
		Scanner s= new Scanner(System.in);


		/***
		 * Making object instances to pass value to the constructor*
		 * **/
		Question ob1 = new Question("1. what is 2+3???","5","6","none of the above","all of the above",'a');
		Question ob2 = new Question("2. what is 6/3???","5","2","none of the above","all of the above",'b');
		Question ob3 = new Question("3. which of these is not a fruit???","Apple","Banana","Cauliflower","Peach",'c');
		Question ob4 = new Question("4. Orange is a colour or fruit ?? ","Colour","Fruit","none of the above","Both",'d');
		Question ob5 = new Question("5. Which of these is an animal","Rose","Papaya","Dog","Blue",'c');
		Question ob6 = new Question("6. Lotus is a???","Flower","Colour","Fruit","all of the above",'a');
		Question ob7 = new Question("7. Pen is a???","Musical insrtument","Writing instrument","Printing instrument","all of the above",'b');


		/***
		 * Declaring HashMap to store the question and option number wise**
		 ***/
		HashMap <String,Integer> Quiz = new HashMap <String,Integer>();

		//Asking for the number of question he want to ask
		System.out.print("Enter the number of Question which you want to ask [1-7] : ");
		int choice = s.nextInt();


		/*****
		 * USing switch asking the answer and checking whether it is correct or not 
		 ***/
		switch(choice)
		{
		case 1 :
			Quiz.put("Question 1",ob1.question());
			System.out.print("Enter your answer choice : ");	
			char answer = s.next(). charAt(0);
			System.out.println(ob1.checkAnswer(answer));
			break;
		case 2:
			Quiz.put("Question 2",ob2.question());
			System.out.print("Enter your answer choice : ");	
			char answer1 = s.next(). charAt(0);
			System.out.println(ob2.checkAnswer(answer1));
			break;
		case 3:
			Quiz.put("Question 3",ob3.question());
			System.out.print("Enter your answer choice : ");	
			char answer3 = s.next(). charAt(0);
			System.out.println(ob3.checkAnswer(answer3));
			break;
		case 4:
			Quiz.put("Question 4",ob4.question());
			System.out.print("Enter your answer choice : ");	
			char answer4 = s.next(). charAt(0);
			System.out.println(ob3.checkAnswer(answer4));
			break;
		case 5:
			Quiz.put("Question 5",ob5.question());
			System.out.print("Enter your answer choice : ");	
			char answer5 = s.next(). charAt(0);
			System.out.println(ob5.checkAnswer(answer5));
			break;
		case 6:
			Quiz.put("Question 6",ob6.question());
			System.out.print("Enter your answer choice : ");	
			char answer6 = s.next(). charAt(0);
			System.out.println(ob6.checkAnswer(answer6));
			break;
		case 7:
			Quiz.put("Question 7",ob7.question());
			System.out.print("Enter your answer choice : ");	
			char answer7 = s.next(). charAt(0);
			System.out.println(ob7.checkAnswer(answer7));
			break;
		default:
			System.out.println("You entered a wrong Question. It should be in the range of 1 to 7....");

		}

		s.close();

	}

}


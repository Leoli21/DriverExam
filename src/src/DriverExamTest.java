import java.util.Arrays;
import java.util.Scanner;

public class DriverExamTest {

	public static void main(String[] args) {
		char[] answers = {'A','D','C','A','B','A','D','B','C','A','B','C','A','D','B','C','D','A','C','B'};
		DriverExam test = new DriverExam(answers);
		char[] studentAns = new char[answers.length];
		
		double passing = 0.75;
		
		//check to see totalCorrect by running method
		Scanner keyboard = new Scanner(System.in);
		
		for(int i = 0; i <studentAns.length; i++)
		{
			System.out.println("What is the answer to question #" + (i + 1) + "? ");
			String answer = keyboard.nextLine();
			studentAns[i] = answer.charAt(0);
		}
		//totalCorrect() method
		System.out.println("Total correct: " + test.totalCorrect(studentAns));
		
		//totalIncorrect() method
		System.out.println("Total incorrect: " + test.totalIncorrect(studentAns));
		
		
		//questionsMissed() method
		int [] missedQuestions = test.questionsMissed(studentAns);
		for (int i = 0; i < missedQuestions.length; i++)
		{
			System.out.println("Question missed: " + missedQuestions[i]);
		}
		 	
		
		//passed() method
		if (test.passed(studentAns))
		{
			System.out.println("You passed!");
		}
		else
		{
			System.out.println("You failed.");
		}
	}

}

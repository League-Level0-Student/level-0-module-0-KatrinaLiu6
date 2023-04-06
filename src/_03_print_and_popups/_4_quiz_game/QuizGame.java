package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
			String question1 = JOptionPane.showInputDialog("What is 3 times 2?");	
				// 3.  Use an if statement to check if their answer is correct
			if(question1.equals("6")) {
			
				// 4.  if the user's answer was correct, add one to their score 
				score +=1;
			}else {
				score +=-1;
			}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
			String question2 = JOptionPane.showInputDialog("What is 4 times 8?");
			if(question2.equals("32")) {
				
				// 4.  if the user's answer was correct, add one to their score 
				score +=1;
			}else {
				score +=-1;
			}
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null, "your total score is" + score);
	}
}

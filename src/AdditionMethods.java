import java.util.Scanner;
public class AdditionMethods {
	public static void main(String[] args) {
		System.out.println("Booyah more addition game jazz");
		//Score, difficulty, and the Number Assignments will be given their own methods
		//The main method will contain the for loop that will put the user through the four-round addition game.
		int Score = 0;
		int Difficulty = 10;
		for (int i = 0; i <= 3; i++){
			// Round 1
			
			int num1 = (int)(Math.random()*Difficulty);
			int num2 = (int)(Math.random()*Difficulty);
			System.out.println("The first number is: " + num1);
			System.out.println("The second number is: " + num2);
			int realAnswer = (num1 + num2);
			//  Ask the user to add these two numbers together	
			System.out.println("If we add " + num1 + " and " + num2
					+ ", what is the answer?");
			
			
			//  Read in their response
			
			Scanner input = new Scanner(System.in);
			int givenAnswer = input.nextInt();
			
			//  Check if the answer was correct		
			
			if(realAnswer == givenAnswer){
			
			//		IF correct
				//			Tell them it was correct
				System.out.println("Correct!");
				//			Give them points
				Score = Score + Difficulty;
				System.out.println("Your score is now " + Score);
				//			Make the next question harder		
				Difficulty = Difficulty + 15;
				System.out.println("Making the next question harder. . .");
			}else{
				//		IF not correct
			
				//			Tell them it was wrong
				System.out.println("Sorry, that was incorrect.");
				// 			Tell them the correct answer
				System.out.println("The correct answer was " + realAnswer);
				//			Do not give them points
				System.out.println("Your score is still " + Score);
				//			Make the next question easier
				Difficulty = Difficulty - 5;
				System.out.println("Making the next question easier. . .");
			}
		}
		System.out.println(". . . Except there is no 'next question', the game is over!");
		System.out.println("Your final Score is " + Score + ", Congratulations!");
	}
}

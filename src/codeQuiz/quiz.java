package codeQuiz;

// used to randomise questions from the array 
import java.util.Random;
// will need the scanner for user input
import java.util.Scanner;

public class quiz {


	/**
	 * Method to run a simple quiz
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// scanner to get user input
		Scanner scanner = new Scanner(System.in);

		try {
			// declaring the questions and answers as arrays of strings
			String[] jokeQuestions = { "Which is the largest planet ? ", "How many continents are there on earth?", "What is the capital of Peru?",
					"Who is the Roman god of War ?" };
			String[] jokeAnswers = { "Jupiter", "Seven", "Lima", "Mars" };

			// variables for the game
			Random random = new Random();
			String userAnswer;
			String anotherQuestion;

			System.out.println("Welcome to the General Knowledge quiz!");

			// wrapping the game in a do loop
			do {

				// gets a random index value using random so the user gets a random question each time
				int questionIndex;
				questionIndex = random.nextInt(jokeQuestions.length);

				System.out.println(jokeQuestions[questionIndex]);
 
				System.out.println("Your answer ...");
				userAnswer = scanner.nextLine();
				// checking the user answer against the expected answer
				if (userAnswer.equalsIgnoreCase(jokeAnswers[questionIndex])) {
					System.out.println("Well done !");
				} else {
					System.out.println("Not a bad guess but it was " + jokeAnswers[questionIndex]);
				}

				System.out.println("Another question (Y or N)..");
				anotherQuestion = scanner.nextLine();

			} while (anotherQuestion.equalsIgnoreCase("Y"));

		} catch (Exception exception) {
			System.out.println("The quiz master had a problem ... run the game again.");
		} finally {
			scanner.close();
			System.out.println("Thanks for playing");
		}

	}

}


//Imports
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        // Define Variables
        Scanner scanner = new Scanner(System.in); // User Input
        Random random = new Random();
        int totalScore = 0;
        boolean playAgain = true;

        // Display Title
        System.out.println("Welcome to Guess the Number");
        System.out.println("**************************************");

        // Game Loop
        while (playAgain) {
            // Define Game Variables
            int number = random.nextInt(100) + 1; // 1 to 100
            int attempts = 0;
            int maxAttempts = 10;
            boolean guessedCorrectly = false;

            System.out.println("\nA Number Was Picked Between 1 and 100.");
            System.out.println("You Have " + maxAttempts + " Attempts to Guess It.");

            // Turn Loop
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == number) {
                    guessedCorrectly = true;
                    int score = Math.max(1, 11 - attempts);
                    totalScore += score;

                    System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                    System.out.println("Score this round: " + score);
                    break;
                } else if (guess < number) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            // Attempt Failure
            if (!guessedCorrectly) {
                System.out.println("You've used all attempts.");
                System.out.println("The correct number was: " + number);
            }

            System.out.println("Total Score: " + totalScore); // Final Score

            // Prompt to Play Again
            System.out.print("\nDo you want to play again? (yes/no): ");
            scanner.nextLine(); // clear buffer
            String choice = scanner.nextLine(); // User Input

            // Game End
            if (!choice.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        // Final Stats
        System.out.println("\nGame Over!");
        System.out.println("Final Score: " + totalScore);
        scanner.close();
    }
}

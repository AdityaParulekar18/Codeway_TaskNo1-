import java.util.*;
import java.util.Random;

public class NumberGuessingGame 
{
    public static void main(String[] args) 
        {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!!!");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            attempts++;

            if (guess == secretNumber) 
                {
                System.out.println("Woww...Congratulations! You guessed the correct number in " + attempts + " attempts.");
            } 
            else {
                System.out.println((guess < secretNumber ? "Too low! " : "Too high! ") + "Try again.");
            }

        } 
       while (guess != secretNumber);

        scanner.close();
    }
}

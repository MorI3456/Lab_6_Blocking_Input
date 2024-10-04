import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Random generator = new Random();
        Scanner in = new Scanner(System.in);
        int randomNumber = generator.nextInt(10) + 1;
        int guess = 0;
        boolean validInput;

        // Get the guess
        do {
            System.out.print("Guess the number between 1 and 10: ");
            validInput = in.hasNextInt();
            if (validInput) {
                guess = in.nextInt();
                if (guess < 1 || guess > 10) {
                    System.out.println("Please enter a number between 1 and 10.");
                    validInput = false;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                in.next();  // Clear invalid input
            }
        } while (!validInput);

        // Show the random number and evaluate the guess
        System.out.println("The random number was: " + randomNumber);
        if (guess < randomNumber) {
            System.out.println("Your guess was too low.");
        } else if (guess > randomNumber) {
            System.out.println("Your guess was too high.");
        } else {
            System.out.println("Your guess was right on the money!");
        }
    }
}

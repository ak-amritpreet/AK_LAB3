import java.util.Scanner;

public class NumberGuess {
    private static final int MAX_ATTEMPTS = 10;
    private static final int MAX_NUMBER = 9999;

    public static void main(String[] args) {
        int SecretNumber = GenerateSecretNumber();
        PlayGame(SecretNumber);
    }

    private static int GenerateSecretNumber() {
        return (int) (Math.random() * (MAX_NUMBER + 1));
    }

    private static void PlayGame(int secretNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the NUMBER GUESSING GAME!");
        System.out.println("Guess a number between 0 and 9999.");

        for (int attempt = 1; attempt <= MAX_ATTEMPTS; attempt++) {
            System.out.print("Attempt " + attempt + ": ");
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempt + " attempts.");
                return;
            }

            if (guess < secretNumber) {
                System.out.println("The SECRET NUMBER is bigger than " + guess + ".");
            } else {
                System.out.println("The SECRET NUMBER is smaller than " + guess + ".");
            }
        }

        System.out.println("Sorry, you did not guess the number within " + MAX_ATTEMPTS + " attempts.");
        System.out.println("The SECRET NUMBER was: " + secretNumber);
    }
}

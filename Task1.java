import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minlimit = 1;
        int maxlimit = 100;
        int Attemptslimit = 5;
        int score = 0;

        System.out.println("Welcome to Guess the Number Game");

        do {
            int generatedNumber = random.nextInt(maxlimit - minlimit + 1) + minlimit;
            int attempts = 0;
            boolean guessingisCorrect = false;

            System.out.println(" Let's begin");

            while (attempts < Attemptslimit) {
                System.out.print("\nEnter your guessing number: ");
                int Guess= scanner.nextInt();
                attempts++;

                if (Guess == generatedNumber) {
                    System.out.println("Congratulations! You guessed correct number in " + attempts + " attempts.");
                    guessingisCorrect = true;
                    score++;
                    break;
                } else if (Guess < generatedNumber) {
                    System.out.println("It's low Try again.");
                } else {
                    System.out.println("It's high Try again.");
                }
            }

            if (!guessingisCorrect) {
                System.out.println("Sorry, you've used all your attempts. The correct number was:  " + generatedNumber);
            }

            System.out.print("\nDo you want to play this game again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();

            if (playAgain.equals("no")) {
                break;
            }
        } while (true);

        System.out.println("Your total score is: " + score);
        System.out.println("Thank you for playing Guess the Number Game");
    }
}
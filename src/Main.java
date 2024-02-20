import java.util.Scanner;

public class Main {
    public static void main(String[] arg)
    {
        guessingGame();
    }

    public static void guessingGame()
    {
        Scanner guessNumber = new Scanner(System.in);


        int randomNumber = (int)(1000* Math.random());
        int j = 10;
        int i;
        int guessAttempt;

        System.out.println("A number has been chosen at random. Guess to win!");

        for (i = 0; i < j; i++) {
            System.out.println("Enter Your Guess!:");
            guessAttempt = guessNumber.nextInt();

            if (randomNumber == guessAttempt) {
                System.out.println("YOU WIN!");
                break;
            }
            else if (randomNumber > guessAttempt && i != j) {
                System.out.println(
                        "So close! You are too LOW! Try again!");
            }
            else if (randomNumber < guessAttempt && i != j) {
                System.out.println(
                        "So close! You are too HIGH. Try again!");
            }
        }
        if (i == j) {
            System.out.println("Oh, no! You used up all attempts! GAME OVER");
            System.out.println("The answer was " + randomNumber);
        }
    }

}

import java.util.*;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int gamesPlayed = 0;
        int gamesWon = 0;
        int bestScore = 0;
        char playAgain;
        System.out.println("=================================================");
        System.out.println("         SMART NUMBER GUESSING GAME");
        System.out.println("=================================================");
        do {
            gamesPlayed++;
            int maxNumber = 100;
            int attempts = 7;
            System.out.println("\nChoose Difficulty Level");
            System.out.println("1. Easy (1 - 50)    - 10 Attempts");
            System.out.println("2. Medium (1 - 100) - 7 Attempts");
            System.out.println("3. Hard (1 - 500)   - 5 Attempts");
            System.out.print("Enter your choice : ");
            int choice;
            while (!sc.hasNextInt()) {
                System.out.print("Invalid input! Enter a number: ");
                sc.next();
            }
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    maxNumber = 50;
                    attempts = 10;
                    break;
                case 2:
                    maxNumber = 100;
                    attempts = 7;
                    break;
                case 3:
                    maxNumber = 500;
                    attempts = 5;
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    System.out.println("Medium Level Selected.");
                    maxNumber = 100;
                    attempts = 7;
            }
            int secretNumber = random.nextInt(maxNumber) + 1;
            boolean guessed = false;
            System.out.println("\nI have selected a number between 1 and " + maxNumber);
            System.out.println("Guess the number!");
            int totalAttempts = attempts;
            while (attempts > 0) {
                System.out.print("\nEnter your guess : ");
                while (!sc.hasNextInt()) {
                    System.out.print("Please enter a valid number: ");
                    sc.next();
                }
                int guess = sc.nextInt();
                if (guess < 1 || guess > maxNumber) {
                    System.out.println("Enter a number between 1 and " + maxNumber);
                    continue;
                }
                if (guess == secretNumber) {
                    guessed = true;
                    gamesWon++;
                    int score = attempts * 10;
                    if (score > bestScore)
                        bestScore = score;
                    System.out.println("\nCongratulations!");
                    System.out.println("You guessed the correct number.");
                    System.out.println("Attempts Used : " + (totalAttempts - attempts + 1));
                    System.out.println("Attempts Left : " + attempts);
                    System.out.println("Your Score : " + score);
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Too Low!");
                    if (secretNumber - guess <= 5)
                        System.out.println("Hint: You are very close!");
                } else {
                    System.out.println("Too High!");
                    if (guess - secretNumber <= 5)
                        System.out.println("Hint: You are very close!");
                }
                attempts--;
                if (attempts > 0)
                    System.out.println("Remaining Attempts : " + attempts);
            }
            if (!guessed) {
                System.out.println("\nGame Over!");
                System.out.println("Correct Number : " + secretNumber);
            }
            System.out.print("\nDo you want to play again? (Y/N): ");
            playAgain = sc.next().charAt(0);
        } while (playAgain == 'Y' || playAgain == 'y');
        System.out.println("\n================ GAME SUMMARY ================");
        System.out.println("Games Played : " + gamesPlayed);
        System.out.println("Games Won    : " + gamesWon);
        System.out.println("Games Lost   : " + (gamesPlayed - gamesWon));
        double winPercentage = ((double) gamesWon / gamesPlayed) * 100;
        System.out.printf("Win Percentage : %.2f%%\n", winPercentage);
        System.out.println("Best Score : " + bestScore);
        System.out.println("\nThank You For Playing!");
        System.out.println("==============================================");
        sc.close();
    }
}

// Write a program to Create Number Guessing Game.

import java.util.Random;
import java.util.Scanner;

public class problem_101 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Random random = new Random();
            int bestScore = Integer.MAX_VALUE;
            char choice;
            System.out.println("==================================");
            System.out.println("      NUMBER GUESSING GAME");
            System.out.println("==================================");
            do {
                int secret = random.nextInt(100) + 1;
                int attempts = 0;
                int guess;
                System.out.println("\nI have selected a number between 1 and 100.");
                System.out.println("Try to guess it!");
                while (true) {
                    System.out.print("Enter your guess: ");
                    guess = sc.nextInt();
                    if (guess < 1 || guess > 100) {
                        System.out.println("Please enter a number between 1 and 100.");
                        continue;
                    }
                    attempts++;
                    if (guess > secret)
                        System.out.println("Too High!");
                    else if (guess < secret)
                        System.out.println("Too Low!");
                    else {
                        System.out.println("\nCongratulations!");
                        System.out.println("You guessed the number.");
                        System.out.println("Attempts = " + attempts);
                        if (attempts < bestScore) {
                            bestScore = attempts;
                            System.out.println("New Best Score!");
                        }
                        System.out.println("Best Score = " + bestScore);
                        break;
                    }
                }
                System.out.print("\nPlay Again? (Y/N): ");
                choice = sc.next().charAt(0);
            } while (choice == 'Y' || choice == 'y');
            System.out.println("\nThank you for playing!");

        }
    }
}
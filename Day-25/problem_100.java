// Write a program to Sort Words by Length.

import java.util.Scanner;

public class problem_100 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of words: ");
            int n = sc.nextInt();
            sc.nextLine();
            String[] words = new String[n];
            System.out.println("Enter words:");
            for (int i = 0; i < n; i++)
                words[i] = sc.nextLine();
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (words[j].length() > words[j + 1].length()) {
                        String temp = words[j];
                        words[j] = words[j + 1];
                        words[j + 1] = temp;
                    }
                }
            }
            System.out.print("Sorted by Length: ");
            for (String word : words)
                System.out.print(word + " ");
        }
    }
}
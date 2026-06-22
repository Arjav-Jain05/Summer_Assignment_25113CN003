// Write a program to Count Words in a Sentence.

import java.util.Scanner;

public class problem_86 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a sentence: ");
            String str = sc.nextLine();
            str = " " + str;
            int words = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ')
                    words++;
            }
            System.out.println("Number of Words = " + words);
        }
    }
}